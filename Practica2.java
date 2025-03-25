import java.util.Scanner;

public class Practica2 {

    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int horas;
        System.out.println("Ingrese las horas trabajadas: ");
        horas = myScanner.nextInt();

        if (horas >= 20 && (horas <= 40))
            System.out.println("Tine derecho a Sueldo.");
            else {
                System.out.println("No tiene derecho a sueldo");
                System.exit(1);
    }

        double spP;//sueldo semanal
        double spA;//sueldo por 
        int tipo;
        System.out.println("Area en la que trabaja Produccion=1 o Administrativa=2: ");
        tipo = myScanner.nextInt();
        spP = horas * 100;
        spA = horas * 60;
        double bonoantig = spP + 500;
        double bonopunt = spP + 100;
        if (tipo == 1){
            System.out.println("Su Sueldo Semanal es: $" + spP);
            System.out.println("Cuantos años de antiguedad tiene?: ");
            int antig = myScanner.nextInt();
                if (antig >= 5);{
                System.out.println("Su sueldo con bono por antiguedad es: $" + bonoantig);
                }
                
                System.out.println("El trabajodor tiene retardos?: ");
                
                boolean punt = myScanner.nextBoolean();
                
                    if (punt == false){
                    
                    System.out.println("Su sueldo final con bono de antiguedad y puntualidad es: $" + bonopunt);
                if (punt == true)
                    System.out.println("No tienes bono de puntualidad.");
                }
                if (antig <=4)
                    System.out.println("No tienes bono por antiguedad.");
        }
        double bonoantig2 = spA + 500;
        double bonopunt2 = spA + 100;
        if (tipo == 2){
            System.out.println("Su Sueldo semanal es: " + spA);
            System.out.println("Cuanto s años de antiguedad tiene?: ");
            int antig = myScanner.nextInt();
                if (antig >= 5);{
                    
                System.out.println("Su sueldo con bono por antiguedad es:" + bonoantig2);
                System.out.println("El trabajodor tiene retardos?: ");
                boolean punt = myScanner.nextBoolean();
                    if (punt == false)
                    
                    System.out.println("Su sueldo final con bono de antiguedad y puntualidad es: $" + bonopunt2);
                if (punt == true)
                    System.out.println("No tienes bono de puntualidad.");
                }
                if (antig <=4)
                    System.out.println("No tienes bono por antiguedad.");
        myScanner.close();
        }
    }
}