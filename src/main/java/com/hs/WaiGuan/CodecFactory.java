package com.hs.WaiGuan;

/**
 * @author Huasheng
 * @Date 2021/05/10/11:30
 * @Description
 */
public class CodecFactory {
    public static Codec extract(VideoFile file){
        String type = file.getCodecType();
        if (type.equals("mp4")){
            System.out.println("这是mp4的");
            return new MPEG4CompressionCodec();
        }else {
            System.out.println("这是ogg的");
            return new OggCompressionCodec();
        }
    }

}
