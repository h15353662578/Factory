package com.hs.WaiGuan;

import java.io.File;

/**
 * @author Huasheng
 * @Date 2021/05/10/11:35
 * @Description
 */
public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("转换开始");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("转换完成");
        return result;
    }
}
