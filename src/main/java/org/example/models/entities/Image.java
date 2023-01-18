package org.example.models.entities;

import org.example.models.interfaces.Element;
import org.example.models.interfaces.Visitee;
import org.example.models.interfaces.Visitor;
import org.example.services.ImageLoaderFactory;

import javax.persistence.*;
import java.util.concurrent.TimeUnit;

@Entity
public class Image implements Element, Visitee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    String url;

    @Column
    String extension;
    @ManyToOne()
    @JoinColumn(name = "content_id", referencedColumnName = "id")
    ImageContent content;

    @ManyToOne(targetEntity = AbstractElement.class)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    AbstractElement parent;



    public Image(String url) {
        url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Image() {
    }


    public String getUrl() {
        return url;
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
        this.parent = (AbstractElement) el;
    }

    public ImageContent content(){
        return content;
    }
    public void setContent(){
        ImageLoaderFactory factory = new ImageLoaderFactory();
        factory.create(url,extension);
        this.content = factory.create(url,extension);
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public <T>  T accept(Visitor<T> v) {
        return v.visitImage(this);
    }
}
