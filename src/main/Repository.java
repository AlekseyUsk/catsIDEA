package main;


import java.util.ArrayList;
import java.util.List;

public interface Repository {

    ArrayList<Cats> getAll(); // получение списка котов

    void add (Cats cats);

    Cats cat = new Cats();
}
