import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 6: Se requiere determinar la hipotenusa de un triángulo rectángulo. ¿Cómo sería el\n" +
                "diagrama de flujo y el pseudocódigo que representen el algoritmo para obtenerla?\n" +
                "Recuerde que por Pitágoras se tiene que: C A B .\n");
        //Se definen las variables
        double catetoUno, catetoDos, hipotenusa;

        //Se Habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese el valor del primer cateto: ");
        catetoUno = keyboard.nextDouble();

        System.out.print("Ingrese el valor del segundo cateto: ");
        catetoDos = keyboard.nextDouble();

        //Se Calcula el valor de la hipotenusa
        hipotenusa = Math.sqrt(Math.pow(catetoUno,2) + (Math.pow(catetoDos,2)));

        //Mostrar el resultado
        System.out.println("El valor de la hipotenusa es de: "+ hipotenusa);

    }
}
