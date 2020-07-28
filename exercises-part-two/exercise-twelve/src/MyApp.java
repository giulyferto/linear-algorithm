import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 12: Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para\n" +
                "determinar cuánto pagará finalmente una persona por un artículo equis, considerando\n" +
                "que tiene un descuento de 20%, y debe pagar 15% de IVA (debe mostrar el precio con\n" +
                "descuento y el precio final).\n");

        //Se definen las variables
        double pagoARealizar, precioConDescuento, precioFinal;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos al usuario

        System.out.print("Ingrese el costo del producto: ");
        pagoARealizar = keyboard.nextDouble();

        //Se calcula el precio con descuento
        precioConDescuento = pagoARealizar - (pagoARealizar*0.20);

        //Se calcula el precio final con descuento mas IVA

        precioFinal = precioConDescuento +(pagoARealizar*0.15);

        //se muestra el precio con descuento y el precio final

        System.out.println("El precio con descuento es de: "+ precioConDescuento + " Y el precio final mas IVA es de: "+ precioFinal);
    }
}
