class Coche {

    public int doors;

    public Coche(int doors) {
        this.doors = doors;
    }

    public void addDoors(int value) {
        doors += value;
    }

}

public class EjerciciosTema3 {

    static int suma(int a, int b, int c) {

        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println("Suma = " + suma(7, 3, 5));

        Coche myCar = new Coche(4);

        myCar.addDoors(1);

        System.out.println("Número de puertas = " + myCar.doors);

    }

}
