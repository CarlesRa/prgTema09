package exercici03;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercici03 {
    private boolean hayNumeros;
    private float num;
    private float numMajor;
    public Exercici03(){

        hayNumeros = true;
        demanarNumeros();
        if (hayNumeros) {
            System.out.print("El numero mayor introducido es: " + numMajor);
        }
    }

    /**
     * Demana nombres fins que sintrodueixen lletres
     */
    public void demanarNumeros(){
        Scanner lec = new Scanner(System.in);
        int count = 0;
        boolean sonLetras = false;
        do{
            System.out.print("Introduce numeros hasta que se introduzcan letras: ");
            try {
                num = Float.parseFloat(lec.nextLine());
                count = 0;
                if (numMajor<num){
                    count++;
                    numMajor = num;
                }
            }
            catch (InputMismatchException IMEe){
                if (count == 0){
                    hayNumeros = false;
                    System.out.println("No ha introducido ningun número...");
                }
                else {
                    hayNumeros = true;
                    sonLetras = true;
                }
            }
            catch (NumberFormatException NFEe){
                if (count == 0){
                    hayNumeros = false;
                    System.out.println("No ha introducido ningun número...");
                }
                else {
                    hayNumeros = true;
                    sonLetras = true;
                }
            }
        }while (!sonLetras);
    }

}
