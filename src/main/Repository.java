package main;


import java.util.ArrayList;

public interface Repository {

    ArrayList<Cats> getAll(); // получение списка котов

    void add (Cats cats);

    Cats cats = new Cats();
}
