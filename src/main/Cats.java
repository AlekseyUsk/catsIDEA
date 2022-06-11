package main;

public class Cats {
    String name;
    int belly; // сытость кота
    int catsEat; // прожорливость кота

    public Cats(String name, int belly, int catsEat) {
        this.name = name;
        this.belly = belly;
        this.catsEat = catsEat;
    }

    public int getBelly() {
        return belly;
    }

    public Cats() {

    }

    public static void add(Cats персик) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBelly(int i) {
        return belly;
    }

    public void setBelly(int belly) {
        this.belly = belly;
    }

    public int getCatsEat() {
        return catsEat;
    }

    public void setCatsEat(int catsEat) {
        this.catsEat = catsEat;
    }
}
