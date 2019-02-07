package exercici10;
import utils.Lib;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercici10 {
    // Variable selección del menu.
    int numA;
    // Variables para las operaciones.
    float numB;
    float numC;
    float resultado;
    // Variable para seguir o salir del bucle.
    boolean condicion;
    Scanner lector;
    public Exercici10(){
        lector = new Scanner(System.in);
        condicion = false;
        // Bucle para vovlver a ejecutar asta pulsar 0.
        do { // imprimimos el menu.
            do {
                System.out.println("****CALCULADORA****");
                System.out.println("  1. Suma");
                System.out.println("  2. Resta");
                System.out.println("  3. Multiplicación");
                System.out.println("  4. División");
                System.out.println("  5. Resto división");
                System.out.println("  ------------------");
                System.out.println("  0. Salir");
                System.out.println("********************");
                System.out.print("Elije una opción: ");
                try {
                    numA = Integer.parseInt(lector.nextLine());
                    condicion = true;
                } catch (NumberFormatException nfe1) {
                    System.out.println("opcio no valida");
                    Lib.continuar();
                }
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
                        try {
                            numB = Float.parseFloat(lector.nextLine());
                            condicion = true;
                        }
                        catch (NumberFormatException nfe2){
                            System.out.println(nfe2.getMessage());
                            condicion = false;
                            Lib.continuar();
                        }
                        catch (InputMismatchException imme1){
                            imme1.getMessage();
                            condicion = false;
                            Lib.continuar();
                        }
                    }while (!condicion);
                    do {
                        System.out.print("\n  Introduzca el segundo número: ");
                        try {
                            numC = Float.parseFloat(lector.nextLine());
                            condicion = true;
                        }
                        catch (NumberFormatException nfe2){
                            System.out.println(nfe2.getMessage());
                            condicion = false;
                            Lib.continuar();
                        }
                        catch (InputMismatchException imme1){
                            imme1.getMessage();
                            condicion = false;
                            Lib.continuar();
                        }
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
                        try {
                            numB = Float.parseFloat(lector.nextLine());
                            condicion = true;
                        }
                        catch (NumberFormatException nfe2){
                            System.out.println(nfe2.getMessage());
                            condicion = false;
                            Lib.continuar();
                        }
                        catch (InputMismatchException imme1){
                            imme1.getMessage();
                            condicion = false;
                            Lib.continuar();
                        }
                    }while (!condicion);
                    do {
                        System.out.print("\n  Introduzca el segundo número: ");
                        try {
                            numC = Float.parseFloat(lector.nextLine());
                            condicion = true;
                        }
                        catch (NumberFormatException nfe2){
                            System.out.println(nfe2.getMessage());
                            condicion = false;
                            Lib.continuar();
                        }
                        catch (InputMismatchException imme1){
                            imme1.getMessage();
                            condicion = false;
                            Lib.continuar();
                        }
                    }while (!condicion);
                    resultado = numB - numC;
                    System.out.println("\n     " + numB + "-" + numC + "=" + resultado);
                    System.out.print("\n  Pulse intro para continuar");
                    lector.nextLine();
                    condicion = true;
                    break;
                case 3:// multiplicación
                    System.out.println("         MULTIPLICACIÓN");
                    System.out.print("\n  Introduzca el primer número: ");
                    do {
                        System.out.print("\n  Introduzca el primer número: ");
                        try {
                            numB = Float.parseFloat(lector.nextLine());
                            condicion = true;
                        }
                        catch (NumberFormatException nfe2){
                            System.out.println(nfe2.getMessage());
                            condicion = false;
                            Lib.continuar();
                        }
                        catch (InputMismatchException imme1){
                            imme1.getMessage();
                            condicion = false;
                            Lib.continuar();
                        }
                    }while (!condicion);
                    do {
                        System.out.print("\n  Introduzca el segundo número: ");
                        try {
                            numC = Float.parseFloat(lector.nextLine());
                            condicion = true;
                        }
                        catch (NumberFormatException nfe2){
                            System.out.println(nfe2.getMessage());
                            condicion = false;
                            Lib.continuar();
                        }
                        catch (InputMismatchException imme1){
                            imme1.getMessage();
                            condicion = false;
                            Lib.continuar();
                        }
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
                            try {
                                numB = Float.parseFloat(lector.nextLine());
                                condicion = true;
                            } catch (NumberFormatException nfe2) {
                                System.out.println(nfe2.getMessage());
                                condicion = false;
                                Lib.continuar();
                            } catch (InputMismatchException imme1) {
                                System.out.println(imme1.getMessage());
                                condicion = false;
                                Lib.continuar();
                            }
                        } while (!condicion);
                        do {
                            System.out.print("\n  Introduzca el segundo número: ");
                            try {
                                numC = Float.parseFloat(lector.nextLine());
                                condicion = true;
                            } catch (NumberFormatException nfe2) {
                                System.out.println(nfe2.getMessage());
                                condicion = false;
                                Lib.continuar();
                            } catch (InputMismatchException imme1) {
                                imme1.getMessage();
                                condicion = false;
                                Lib.continuar();
                            }
                            try {
                                resultado = numB / numC;
                            } catch (ArithmeticException ae1) {
                                System.out.println(ae1.getMessage());
                                condicion = false;
                            }
                        } while (!condicion);
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
                        try {
                            numB = Float.parseFloat(lector.nextLine());
                            condicion = true;
                        }
                        catch (NumberFormatException nfe2){
                            System.out.println(nfe2.getMessage());
                            condicion = false;
                            Lib.continuar();
                        }
                        catch (InputMismatchException imme1){
                            imme1.getMessage();
                            condicion = false;
                            Lib.continuar();
                        }
                        catch (ArithmeticException ae1){
                            System.out.println(ae1.getMessage());
                            condicion = false;
                            Lib.continuar();
                        }
                    }while (!condicion);
                    do {
                        System.out.print("\n  Introduzca el segundo número: ");
                        try {
                            numC = Float.parseFloat(lector.nextLine());
                            condicion = true;
                        }
                        catch (NumberFormatException nfe2){
                            System.out.println(nfe2.getMessage());
                            condicion = false;
                            Lib.continuar();
                        }
                        catch (InputMismatchException imme1){
                            imme1.getMessage();
                            condicion = false;
                            Lib.continuar();
                        }
                        catch (ArithmeticException ae1){
                            System.out.println(ae1.getMessage());
                            condicion = false;
                            Lib.continuar();
                        }
                    }while (!condicion);
                    resultado = numB % numC;
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
}
