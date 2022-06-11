package main;

import java.util.ArrayList;
import java.util.List;

public class Eat extends Plate implements Repository {
    public static void main(String[] args) {
        System.out.println();
    }

    @Override
    public ArrayList<Cats> getAll() {
        List<Cats> cats = new ArrayList<>();
        Cats.add(new Cats("Гриша", 25, 25));
        Cats.add(new Cats("Толстячек", 55, 35));
        Cats.add(new Cats("Персик", 35, 15));

        for (int i = 0; i < cats.size(); i++) {
            if (getPlate() < cat.getBelly(i)) {
                System.out.println("голодный" + cats.get(i).getName());
            } else {
                System.out.println("покушал " + cats.get(i).getName());
            }
            reloadPlate(getPlate());
        }

        return (ArrayList<Cats>) cats;
    }

    @Override
    public void add(Cats cats) {

    }

}



