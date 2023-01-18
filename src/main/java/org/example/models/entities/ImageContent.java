package org.example.models.entities;

import javax.persistence.*;
import java.awt.image.BufferedImage;

@Entity
public class ImageContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Transient
    BufferedImage content;
    public ImageContent(BufferedImage content){
        this.content = content;
    }

    public ImageContent() {

    }
}
