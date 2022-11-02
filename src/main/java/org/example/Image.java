package org.example;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    String url;
    ImageContent content;
    Element parent;

    public Image(String url) {
        url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print(){
        System.out.println("Image with name: " + url);
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Element get(int x) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Element getParent() {
        return parent;
    }

    @Override
    public void setParent(Element el) {
        this.parent = el;
    }

    public ImageContent content(){
        return content;
    }
}
