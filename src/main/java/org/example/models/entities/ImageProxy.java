package org.example.models.entities;

import org.example.models.interfaces.Element;
import org.example.models.interfaces.Picture;
import org.example.models.interfaces.Visitee;
import org.example.models.interfaces.Visitor;

import javax.persistence.*;
import java.awt.*;

@Entity
public class ImageProxy implements Element, Picture, Visitee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    String url;

    @Transient
    Dimension dim;

    @Transient
    PictureContent content;
    @ManyToOne()
    @JoinColumn(name = "realImage_id", referencedColumnName = "id")
    Image realImage;

    public ImageProxy() {

    }

    public Image getRealImage() {
        return realImage;
    }

    public void setRealImage(Image realImage) {
        this.realImage = realImage;
    }

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

    public Image loadImage(){
        if (realImage == null){
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public <T>  T accept(Visitor<T> v) {
        return v.visitImageProxy(this);
    }

    public String getUrl() {
        return url;
    }
}
