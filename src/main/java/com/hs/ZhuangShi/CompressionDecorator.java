package com.hs.ZhuangShi;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * @author Huasheng
 * @Date 2021/05/10/16:48
 * 压缩装饰
 * @Description
 */
public class CompressionDecorator extends DataSourceDecorator{

    private int compLevel = 6;

    public CompressionDecorator(DataSource dataSource){
        super(dataSource);
    }

    public int getCompressionLevel(){
        return compLevel;
    }

    public void setCompressionLevel(int value){
        compLevel = value;
    }

    @Override
    public void writeData(String data){
        super.writeData(compress(data));
    }

    @Override
    public String readData(){
        return decompress(super.readData());
    }

    private String compress(String stringData){
        byte[] data = stringData.getBytes();
        try{
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream,new Deflater(compLevel));
            deflaterOutputStream.write(data);
            deflaterOutputStream.close();
            byteArrayOutputStream.close();
            return Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
        }catch(IOException exception){
            return  null;
        }
    }

    private String decompress(String stringData){
        byte[] data = Base64.getMimeDecoder().decode(stringData);
        try {
            InputStream inputStream = new ByteArrayInputStream(data);
            InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            int b;
            while ((b = inflaterInputStream.read()) != -1) {
                byteArrayOutputStream.write(b);
            }
            inputStream.close();
            inflaterInputStream.close();
            byteArrayOutputStream.close();
            return new String(byteArrayOutputStream.toByteArray());
        }catch (IOException exception){
            return null;
        }
    }
}
