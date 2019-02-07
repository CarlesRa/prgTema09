package exercici10;
import utils.Lib;

import java.util.Scanner;
public class Exercici10 {
    // Variable selección del menu.

    // Variables para las operaciones.
    private float numB;
    private float numC;
    private float resultado;
    // Variable para seguir o salir del bucle.
    private boolean condicion;
    private Scanner lector;
    public Exercici10(){
        int numA;
        condicion = false;
        lector = new Scanner(System.in);
        // Bucle para vovlver a ejecutar asta pulsar 0.
        do { // imprimimos el menu.
            do {
                System.out.println("\n  Elija una opción: ");
                System.out.println("  1. Suma");
                System.out.println("  2. Resta");
                System.out.println("  3. Multiplicación");
                System.out.println("  4. División");
                System.out.println("  5. Resto división");
                System.out.println("  ------------------");
                System.out.println("  0. Salir");
                numA = intNumberFormatE();
            }while (!condicion);
            // switch con los casos del menu.
            switch (numA) {
                case 0:// opción para salir del programa.
                    condicion = false;
                    break;
                case 1:// suma
                    System.out.println("         SUMA");
                    do {
                        System.out.print("\n  Introduzca el primer número: ");
                        numB = floatNumberFormatE();
                    }while (!condicion);
                    do {
                        System.out.print("  Introduzca el segundo número: ");
                        numC = floatNumberFormatE();
                    }while (!condicion);
                    resultado = numB + numC;
                    System.out.println("\n     " + numB + "+" + numC + "=" + resultado);
                    System.out.print("\n  Pulse intro para continuar");
                    lector.nextLine();
                    condicion = true;
                    break;
                case 2:// resta
                    System.out.println("         RESTA");
                    do {
                        System.out.print("\n  Introduzca el primer número: ");
                        numB = floatNumberFormatE();
                    }while (!condicion);
                    do {
                        System.out.print("  Introduzca el segundo número: ");
                        numC = floatNumberFormatE();
                    }while (!condicion);
                    resultado = numB - numC;
                    System.out.println("\n     " + numB + "-" + numC + "=" + resultado);
                    System.out.print("\n  Pulse intro para continuar");
                    lector.nextLine();
                    condicion = true;
                    break;
                case 3:// multiplicación
                    System.out.println("         MULTIPLICACIÓN");
                    do {
                        System.out.print("\n  Introduzca el primer número: ");
                        numB = floatNumberFormatE();
                    }while (!condicion);
                    do {
                        System.out.print("  Introduzca el segundo número: ");
                        numC = floatNumberFormatE();
                    }while (!condicion);
                    resultado = numB * numC;
                    System.out.println("\n     " + numB + "x" + numC + "=" + resultado);
                    System.out.print("\n  Pulse intro para continuar");
                    lector.nextLine();
                    condicion = true;
                    break;
                case 4:// division
                    System.out.println("         DIVISIÓN");
                    do {
                        do {
                            System.out.print("\n  Introduzca el primer número: ");
                            numB = floatNumberFormatE();
                        } while (!condicion);
                        do {
                            System.out.print("  Introduzca el segundo número: ");
                            numC = floatNumberFormatE();
                        } while (!condicion);
                        resultado = division(numB, numC);
                    }while (!condicion);
                    System.out.println("\n     " + numB + "/" + numC + "=" + resultado);
                    System.out.print("\n  Pulse intro para continuar");
                    lector.nextLine();
                    condicion = true;
                    break;
                case 5:// modulo
                    System.out.println("         MÓDULO");
                    do {
                        System.out.print("\n  Introduzca el primer número: ");
                        numB = floatNumberFormatE();
                    } while (!condicion);
                    do {
                        System.out.print("  Introduzca el segundo número: ");
                        numC = floatNumberFormatE();
                    } while (!condicion);
                    resultado = modulo(numB,numC);
                    System.out.println("\n     " + numB + "%" + numC + "=" + resultado);
                    System.out.print("\n  Pulse intro para continuar");
                    lector.nextLine();
                    condicion = true;
                    break;
                default:// Si el usuario no indica ninguna opción valida, imprimimos mensaje y volvemos
                    // al menu.
                    System.out.println("  OPCION NO VALIDA!!! Pulse intro para continuar...");
                    lector.nextLine();
                    condicion = true;
                    break;
            }
        } while (condicion == true);
    }

    public int intNumberFormatE(){
        int num = 0;
        try{
            num = Integer.parseInt(lector.nextLine());
            condicion = true;
        }
        catch (NumberFormatException nfe){
            System.out.println(nfe.getMessage());
            condicion = false;
        }
        return num;
    }

    public float floatNumberFormatE(){
        float num = 0;
        try{
            num = Float.parseFloat(lector.nextLine());
            condicion = true;
        }
        catch (NumberFormatException nfe){
            System.out.println(nfe.getMessage());
            condicion = false;
        }
        return num;
    }

    public float division(float numerador, float denominador){
        float resultado = 0;
        try{
            resultado = numerador/denominador;
            condicion = true;
        }
        catch (ArithmeticException afe){
            System.out.println(afe.getMessage());
            condicion = false;
            Lib.continuar();
        }
        return resultado;
    }
    public float modulo(float num1, float num2){
        float resultado = 0;
        try{
            resultado = num1%num2;
            condicion = true;
        }
        catch (ArithmeticException afe){
            System.out.println(afe.getMessage());
            condicion = false;
            Lib.continuar();
        }
        return resultado;
    }

}
