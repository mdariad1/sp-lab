package org.example.models.interfaces;

public interface Visitee {
    <T> T accept(Visitor<T> v);
}
