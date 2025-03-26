import java.util.Scanner;

public class Arreglos {
        public static int t = 25; //tamano maximo del grupo

    public static double [] leerCalificaiones (double [] calificaciones) {
        Scanner scn = new Scanner(System.in);
            for (int i = 0; i < calificaciones.length; i++) {
                System.out.println("escribe calificacion [" + i + "]: ");
                calificaciones[i] = scn.nextDouble();
            }
            return calificaciones;
    }

    public static void imprimirCalificaciones (double [] calificaciones) {
        //estre tipo de impresion es usando el for extendidos
        System.out.println("contenido del arreglo calificaciones: ");
        for (double calificacion : calificaciones)
            System.out.println(calificacion);
    }

    public static void evaluarCalificaciones () {

    }

    public static void main(String[] args) {
        double [] parcial1, parcial2, parcial3, parcial4; //se declaran los arreglos
        double [] promInd;
        boolean [] aprobados;
        Scanner scn = new Scanner(System.in);

        System.out.println("Programa que calcula el promedio final del grupo");
        System.out.println("escribe el tamano del grupo: ");
        t = scn.nextInt();

        //para contruir los arreglos
        parcial1 = new double [t];
        parcial2 = new double [t];
        parcial3 = new double [t];
        parcial4 = new double [t];
        promInd = new double [t];
        aprobados = new boolean [t];

        //para leer las calificaciones 
        System.out.println("--------------------------------------------------");
        System.out.println("lectura de calificaiones del parcial 1: ");
        parcial1 = leerCalificaiones(parcial1);

        System.out.println("--------------------------------------------------");
        System.out.println("lectura de calificaiones del parcial 2: ");
        parcial2 = leerCalificaiones(parcial2);

        System.out.println("--------------------------------------------------");
        System.out.println("lectura de calificaiones del parcial 3: ");
        parcial3 = leerCalificaiones(parcial3);

        System.out.println("--------------------------------------------------");
        System.out.println("lectura de calificaiones del parcial 4: ");
        parcial4 = leerCalificaiones(parcial4);

        //mostrar calificaiones de los parciales 
        System.out.println("----------------------");
        System.out.println("calificaciones del parcial 1: ");
        imprimirCalificaciones(parcial1);

        System.out.println("----------------------");
        System.out.println("calificaciones del parcial 2: ");
        imprimirCalificaciones(parcial2);

        System.out.println("----------------------");
        System.out.println("calificaciones del parcial 3: ");
        imprimirCalificaciones(parcial3);

        System.out.println("----------------------");
        System.out.println("calificaciones del parcial 4: ");
        imprimirCalificaciones(parcial4);

        scn.close();
    }
    
}
