import java.util.Scanner;

public class Arreglos {
        final int T = 25; //tamano maximo del grupo

        public static void leerCalificaiones () {
        
    }

    public static void evaluarCalificaciones () {

    }

    public static void main(String[] args) {
        double [] parcial1, parcial2, parcial3, parcial4; //se declaran los arreglos
        double [] promInd;
        boolean [] aprobados;
        
        double [] calificaciones = new double [5]; //estoy declarando y construyendo el arreglo 
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("escribe calificacion [" + i + "]: ");
            calificaciones[i] = scn.nextDouble();
        }
        //cuando tenemos esta forma de imprimir lo que verdaderamente imprimira sera la direccion en la cual esta alojados los valores
        //System.out.println("calificaciones: " + calificaciones);

        //estre tipo de impresion es usando el for extendidos
        System.out.println("contenido del arreglo calificaciones: ");
        for (double calificacion : calificaciones)
            System.out.println(calificacion);

        //impresiono con el for tradicional
        System.out.println("contenido de calificaiones: ");
        for (int i=0; i< calificaciones.length; i++)
            System.out.println(calificaciones[i]);

        scn.close();
    }
    
}
