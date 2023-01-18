package org.example.models.interfaces;

import org.example.models.entities.PictureContent;

import java.awt.*;

public interface Picture {
    String url();

    Dimension dim();

    PictureContent content();

}
