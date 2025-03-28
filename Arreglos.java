import java.util.Scanner;

public class Arreglos {
        public static int t = 25; //tamano maximo del grupo

    public static double [] leerCalificaiones () {
        double [] calificaciones = new double [t];
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

    

    public static double[] obtenerPromInd (double[] p1, double[] p2, double[] p3, double[] p4) {
        double[] resultado = new double [t];
        for (int i=0; i< resultado.length; i++)
            resultado [i] = (p1[i] + p2[i] + p3[i] + p4[i]) / 4;
        return resultado;
    }

    public static boolean[]  evaluarCalificaciones (double [] proms) {
        boolean[] resultado = new boolean[t];
        for (int i=0; i<proms.length; i++){
            if (proms[i] >= 7)
                resultado[i] = true;
            else
                resultado[i] = false;
        }
        return resultado;
    }

    public static void imprimirResultados (boolean [] resultados) {
        for (boolean resultado : resultados)
        System.out.println(resultado);
    }

    public static double calcularPromedioGrupo (double [] proms) {
        double suma = 0;
        for (int i = 0; i < proms.length; i++)
            suma += proms[i]; //sumando promedios
        return suma / proms.length; // proms es la longitud del arreglo o de alumnos en este caso
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
        parcial1 = leerCalificaiones();

        System.out.println("--------------------------------------------------");
        System.out.println("lectura de calificaiones del parcial 2: ");
        parcial2 = leerCalificaiones();

        System.out.println("--------------------------------------------------");
        System.out.println("lectura de calificaiones del parcial 3: ");
        parcial3 = leerCalificaiones();

        System.out.println("--------------------------------------------------");
        System.out.println("lectura de calificaiones del parcial 4: ");
        parcial4 = leerCalificaiones();

        //calculamos el promedio individual
        promInd = obtenerPromInd(parcial1, parcial2, parcial3, parcial4);
        //evaluamos si ada estudiante esta aprobado o no 
        aprobados = evaluarCalificaciones(promInd);

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

        System.out.println("----------------------");
        System.out.println("promedios individuales");
        imprimirCalificaciones(promInd);

        System.out.println("----------------------");
        System.out.println("estudiantes aprobados");
        imprimirResultados (aprobados);

        System.out.println("-------------------------------");
        System.out.println("el promedio del grupo es: " + calcularPromedioGrupo(promInd)); // se puede imprimir con solo mandarlo a llamrar 

        scn.close();
    }
    
}
