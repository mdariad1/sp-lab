package org.example.models;

import java.awt.*;

public class ImageProxy implements Element,Picture,Visitee{
    String url;
    Dimension dim;
    PictureContent content;
    org.example.models.Image realImage;

    ImageProxy (String url){}

    @Override
    public void print() {

    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int x) {
        return null;
    }

    @Override
    public Element getParent() {
        return null;
    }

    @Override
    public void setParent(Element el) {

    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public PictureContent content() {
        return content;
    }

    public org.example.models.Image loadImage(){
        if (realImage == null){
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public void accept(Visitor v) {
        this.print();
    }
}
