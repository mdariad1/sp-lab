package org.example;

public class Image implements Element {
    String imageName;
    SubChapter subChapter;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void print(){
        System.out.println(imageName);
    }
}
