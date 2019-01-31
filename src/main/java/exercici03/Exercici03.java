package exercici03;
import utils.Lib;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercici03 {
    private boolean isIntroduced;
    private int num;
    private int numMajor;
    public Exercici03(){

        isIntroduced = true;
        demanarNumeros();
        if (!isIntroduced){
            System.out.println("No ha introducido ningun número...");
        }
        else{
            System.out.print("El numero mayor introducido es: " + num);
        }
    }
    public void demanarNumeros(){
        Scanner lec = new Scanner(System.in);
        int count = 0;
        boolean sonLetras = false;
        do{
            System.out.print("Introduce numeros hasta que se introduzcan letras: ");
            try {
                num = Integer.parseInt(lec.nextLine());
                if (numMajor<num){
                    count++;
                    numMajor = num;
                }
            }
            catch (NumberFormatException NFEe){
                if (count == 0){
                    isIntroduced = false;
                }
                sonLetras = true;
            }
            catch (InputMismatchException IMEe){
                if (count == 0){
                    this.isIntroduced = false;
                }
                sonLetras = true;
            }
        }while (!sonLetras);
    }

}
