/**
 * EjerciciosTema4
 */
public class EjerciciosTema4 {

    public static void main(String[] args) {

        // Usando un if, crear una condición que compare si la variable numeroIf es
        // positivo, negativo, o 0.

        int numeroIf = -5;

        if (numeroIf > 0)
            System.out.println("\nnumeroIf es Positivo");
        else if (numeroIf < 0)
            System.out.println("\nnumeroIf es Negativo");
        else
            System.out.println("\nnumeroIf es 0");

        // -------------------------------------------------------------------------
        // Crea un bucle While, este bucle tendrá que tener como condición que la
        // variable numeroWhile
        // sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        // Incrementar el valor de la variable en uno cada vez que se ejecute.
        // Mostrarlo por pantalla cada vez que se ejecute.

        System.out.println("\n");
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println("numeroWhile = " + numeroWhile);
            numeroWhile++;
        }

        // -------------------------------------------------------------------------
        // Para el bucle Do While, deberás crear la misma estructura que en el While,
        // pero solo se debe ejecutar una vez.
        numeroWhile = 0;
        do {
            System.out.println("\nSolo me ejecuto una vez");
            numeroWhile++;
        } while (numeroWhile < 1);

        // -------------------------------------------------------------------------
        // Para el bucle For, crea una variable numeroFor, esta variable tendrá como
        // valor 0
        // y su condición será que la variable sea igual o menor que 3, se irá
        // incrementando en 1 su valor cada vez
        // que se ejecute y deberá mostrarse por pantalla.

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("\nnumeroFor = " + numeroFor);
        }

        // -------------------------------------------------------------------------
        // Por último, para el Switch, deberás crear la variable estacion, y distintos
        // case
        // para las cuatro estaciones del año. Dependiendo del valor de la variable
        // estacion
        // se deberá mandar un mensaje por consola informando de la estación en la que
        // está.
        // También habrá que poner un default para cuando el valor de la variable no sea
        // una estación.

        System.out.println("\n");

        int estacion = 0;

        switch (estacion) {
            case 1:
                System.out.println("Primavera");
                break;

            case 2:
                System.out.println("Verano");
                break;

            case 3:
                System.out.println("Otoño");
                break;

            case 4:
                System.out.println("Invierno");
                break;

            default:
                System.out.println("Era de hielo");
        }

        System.out.println("\n");

    }
}