package main;

import java.util.ArrayList;
import java.util.List;

public class Eat extends Plate implements Repository {
    public static void main(String[] args) {
        System.out.println(cats.getName());
    }

    @Override
    public ArrayList<Cats> getAll() {
        List<Cats> cat = new ArrayList<>();
        cat.add(new Cats("Гриша", 25, 25));
        cat.add(new Cats("Толстячек", 55, 35));
        cat.add(new Cats("Персик", 35, 15));

        for (int i = 0; i < 3; i++) {
            if (getPlate() < cats.getBelly(i)) {
                System.out.println("голодный" + cat.get(i).getName());
            } else {
                System.out.println("покушал " + cat.get(i).getName());
            }
           // reloadPlate(getPlate());
        }

        return (ArrayList<Cats>) cat;
    }

    @Override
    public void add(Cats cats) {

    }

}



