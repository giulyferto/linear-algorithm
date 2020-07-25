import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Programa para calcular el area del terreno");

        //defino las variables
        double aSide;
        double bSide;
        double cSide;
        double areaTriangle;
        double areaRectangle;
        double area;

        //Habilito el ingreso de datos por el teclado
        Scanner keyboard = new Scanner(System.in);

        //Leo los datos del usuario

        System.out.print("Ingrese el lado A del terreno: ");
        aSide = keyboard.nextInt();

        System.out.print("Ingrese el lado B del terreno: ");
        bSide = keyboard.nextInt();

        System.out.print("Ingrese el lado C del terreno: ");
        cSide = keyboard.nextInt();

        //Calculo el area del triangulo

        areaTriangle = (bSide * (aSide - cSide))/2;

        //Calculo el area del rectangulo

        areaRectangle = bSide * cSide;

        //Calculo el area final del terreno

        area = areaRectangle + areaTriangle;

        //Muestro el resultado:
        System.out.println("El area del terreno es: " + area);

    }

}
