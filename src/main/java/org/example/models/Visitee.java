package org.example.models;

public interface Visitee {
    <T> T accept(Visitor<T> v);
}
