package exercici02;
import utils.Lib;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercici02 {
    public Exercici02(){
        Scanner lec = new Scanner(System.in);
        boolean esCorrecto = true;
        float numMajor = 0;
        int count = 0;
        float nums = 0;
        for (int i=0; i<10; i++){
            do {
                System.out.print("Introduce el numero "+(i+1)+":");
                try{
                    nums = Float.parseFloat(lec.nextLine());
                    esCorrecto = true;
                    if (numMajor<nums){
                        numMajor = nums;
                    }
                }
                catch (InputMismatchException IMEe){
                    esCorrecto = false;
                    Lib.mensajeError();
                    count++;
                }
                catch (NumberFormatException NFEe){
                    esCorrecto = false;
                    Lib.mensajeError();
                    count++;
                }
            }while (!esCorrecto);
        }
        System.out.println("El numero mayor es: "+numMajor+" Ha cometido: "+count+" Errores.");
    }
}
