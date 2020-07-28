import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 11:  La compañía de luz y sombras (CLS) requiere determinar el pago que debe realizar una\n" +
                "persona por el consumo de energía eléctrica, la cual se mide en kilowatts (KW). Realice\n" +
                "un diagrama de flujo y pseudocódigo que representen el algoritmo que permita\n" +
                "determinar ese pago");

        //Definir las variables
        double consumoEnergia, precioKilowatt, pago;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese la cantidad de consumo de energia: ");
        consumoEnergia = keyboard.nextDouble();

        System.out.print("ingrese el costo por kilowatt: ");
        precioKilowatt = keyboard.nextDouble();

        //Se calcula el costo del boleto
        pago = consumoEnergia * precioKilowatt;

        System.out.println("El pago a realizar es de: "+ pago);
    }
}
