import java.util.Scanner;

public class Practicajiji {
    
     // horas trabajadas
    public static boolean validarHoras(int horas) {
        if (horas >= 40 && horas <= 52) {
            return true;
        } else {
            return false;
        }
    }

    // horas normales
    public static int calcularHorasNormales(int horas) {
        if (horas > 40) {
            return 40;
        } else {
            return horas;
        }
    }

    // calcular las horas extra
    public static int calcularHorasExtra(int horas) {
        if (horas > 40) {
            return horas - 40;
        } else {
            return 0;
        }
    }

    // bono por puntualidad o descuento por retardos
    public static double calcularBonoPuntualidad(double sueldoBase, int retardos) {
        if (retardos == 0) {
            return sueldoBase * 0.10;
        } else if (retardos >= 3) {
            return -(sueldoBase * 0.10); 
        } else {
            return 0;
        }
    }

    // bono por antiguedad
    public static double calcularBonoAntiguedad(int antiguedad) {
        if (antiguedad >= 5) {
            return 200.0;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Pedir datos al usuario
            System.out.println("ingrese el area de trabajo (Producción (1), Mantenimiento (2), TI (3), Administración (4)): ");
            int area = scanner.nextInt();

            System.out.println("ingrese las horas trabajadas en la semana : ");
            int horasTrabajadas = scanner.nextInt();

            System.out.println("ingrese el numero de retardos en la semana: ");
            int retardos = scanner.nextInt();

            System.out.println("ingrese los años de antiguedad en la empresa: ");
            int antiguedad = scanner.nextInt();

            // Definir sueldo base según el área
            double sueldoBase;
            switch (area) {
                case 1:
                    sueldoBase = 100;
                    break;
                case 2:
                    sueldoBase = 120;
                    break;
                case 3:
                    sueldoBase = 150;
                    break;
                case 4:
                    sueldoBase = 80;
                    break;
                default:
                    System.out.println("area no válida. intente de nuevo.");
                    continue; // Regresa al inicio 
            }

            // horas trabajadas
            if (!validarHoras(horasTrabajadas)) {
                System.out.println("error: las horas deben estar entre 40 y 52.");
                return;
            }

            //horas normales y extra
            int horasNormales = calcularHorasNormales(horasTrabajadas);
            int horasExtra = calcularHorasExtra(horasTrabajadas);
            double pagoHorasExtra = horasExtra * (sueldoBase * 2);

            // Calcular bonos
            double bonoPuntualidad = calcularBonoPuntualidad(sueldoBase, retardos);
            double bonoAntiguedad = calcularBonoAntiguedad(antiguedad);

            // Calcular sueldo total
            double sueldoTotal = sueldoBase * horasNormales + pagoHorasExtra + (bonoPuntualidad * horasNormales) + bonoAntiguedad;

            // Mostrar resultados
            System.out.println("tu Nomina");
            System.out.println("sueldo base: " + sueldoBase);
            System.out.println("horas normales trabajadas: " + horasNormales);
            System.out.println("horas extra: " + horasExtra);
            System.out.println("pago por horas Extra: " + pagoHorasExtra);
            System.out.println("bono por puntualidad: " + bonoPuntualidad * horasNormales);
            System.out.println("bono por antigüedad: " + bonoAntiguedad);
            System.out.println("sueldo total: " + sueldoTotal);

             // ingresar otro sueldo
            System.out.println("Desea ingresar otro sueldo? (1: continuar /2: fin): ");
            int respuesta;
            scanner.nextLine();
            respuesta = scanner.nextInt();

            if (respuesta == 2) {
                System.out.println("adios");
                break; 
                }
            }
            scanner.close();
        }
    }

