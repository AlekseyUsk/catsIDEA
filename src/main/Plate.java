package main;

public class Plate {

    public int getPlate() {
        return plate;
    }

    int plate = 100; // тарелка

    public int getNoFood() {
        return noFood;
    }

    static int noFood = 20; // параметр пустоты тарелки

    //todo- метод заполнения тарелки едой
    public static int reloadPlate(int plate) {
        while (plate <= noFood) {
            plate = 100;
        }

        return plate;
    }

}
