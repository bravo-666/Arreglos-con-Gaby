import java.util.Scanner;

public class Practica21 {
    public static int horasT, sueldoPH, antiguedad, retardos, horasex, horasrestantes, resto;
    public static char area;
    public static Scanner myScanner = new Scanner(System.in);

    public static boolean horasdetrabajo() {
        System.out.println("Cuantas horas se trabajo?: ");
        horasT = myScanner.nextInt();
        if (horasT >= 40 && (horasT <= 52))
            return true;
        else 
            return false;
        {
            System.out.println("A que area pertenece? 'm'= mantenimiento, 'p'= produccion, 't'= tecnologias de la informacion, 'a'= administracion: ");
        sueldoPH = 0;
        area = myScanner.next().charAt(0);
        if (area == 'm'){
            sueldoPH = 120;
        }
        if (area == 'p'){
            sueldoPH = 100;
        }
        if (area == 't'){
            sueldoPH = 150;
        }
        if (area == 'a'){
            sueldoPH = 80;
        }
        
    }
    else{
        System.out.println("No tiene derecho a sueldo.:(");
            System.exit(1);
        }
}

    public static double antiguedad() {
        double jajaantiguedad;
        //antiguedad
        System.out.println("Cuantos años tiene de antiguedad?: ");
        antiguedad = myScanner.nextInt();
        if (antiguedad >= 5){
            antiguedad = 200;
        }
        else{
            antiguedad = 0;
        }
        return jajaantiguedad;
}

    public static double retrasos() {
        //retrasos
        System.out.println("Cuantos retardos tiene?: ");
        retardos = myScanner.nextInt();
        if (retardos == 0){
        retardos = sueldoPH;
        }
        if (retardos >= 3){
            retardos = sueldoPH * -1;
        }
    }

    public static double horasrestantes() {
        //horas extras restantes
        horasrestantes = horasT - 40;//son las horas extras 
        resto = horasrestantes * sueldoPH;//multiplico las horas extras por el sueldo, para despues restarlo
        horasex = (horasT - 40) * sueldoPH * 2;
        System.out.println("Sus horas extras equivalen a: " + horasex);
    }

    public static double sueldofinal() {
        
        //sueldo final
        double SueldoF = sueldoPH * horasT + retardos + antiguedad + horasex - resto;
        // multiplico el sueldo por las horas, mas bono por puntualidad, mas bono por antiguedad, mas horas extras
        // pero resto el sueldo de las horas que sobran pero no cuentan como horas dobles
        System.out.println("Su sueldo final es: " + SueldoF);
        

    }



    public static void main(String[] args) {
        boolean hola;
        hola = antiguedad();
    
    myScanner.close();
        }
    }