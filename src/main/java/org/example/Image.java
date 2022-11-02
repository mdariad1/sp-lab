package org.example;

public class Image implements Element {
    String url;
    Element parent;

    public Image(String imageName) {
        this.url = imageName;
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
}
