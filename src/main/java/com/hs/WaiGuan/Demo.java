package com.hs.WaiGuan;

import java.io.File;

/**
 * @author Huasheng
 * @Date 2021/05/10/11:35
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
