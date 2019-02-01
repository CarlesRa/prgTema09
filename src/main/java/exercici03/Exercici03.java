package exercici03;
import utils.Lib;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercici03 {
    private boolean isIntroduced;
    private float num;
    private float numMajor;
    public Exercici03(){

        demanarNumeros();
            System.out.print("El numero mayor introducido es: " + numMajor);
    }
    public void demanarNumeros(){
        Scanner lec = new Scanner(System.in);
        int count = 0;
        String numStr = "";
        boolean sonLetras = false;
        do{
            do {
                System.out.print("Introduce numeros hasta que se introduzcan letras: ");
                numStr = lec.nextLine();
                if ( numStr.equals("")){
                    System.out.println("No ha introducido ningun número...");
                    Lib.continuar();
                }
            }while (numStr.equals(""));
            try {
                num = Float.parseFloat(numStr);
                if (numMajor<num){
                    numMajor = num;
                }
            }
            catch (NumberFormatException NFEe){
                sonLetras = true;

            }
            catch (InputMismatchException IMEe){
                sonLetras = true;

            }
        }while (!sonLetras);
    }

}