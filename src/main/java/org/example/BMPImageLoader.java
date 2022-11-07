package org.example;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BMPImageLoader implements ImageLoader{
    public BMPImageLoader() {}

    @Override
    public ImageContent load(String path) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
        }
        return new ImageContent(img);
    }
}
