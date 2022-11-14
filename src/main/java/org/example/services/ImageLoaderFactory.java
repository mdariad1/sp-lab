package org.example.services;

import org.example.models.ImageContent;

public class ImageLoaderFactory {

    public ImageLoaderFactory() {
    }

    public ImageContent create(String path, String extension){
        if (extension == "bmp"){
            BMPImageLoader loader = new BMPImageLoader();
            ImageContent content = loader.load(path);
            return content;
        }
        if (extension == "jpg"){
            JPGImageLoader loader = new JPGImageLoader();
            ImageContent content = loader.load(path);
            return content;
        }
        return null;
    }
}
