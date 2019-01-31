package exercici01;
import utils.Lib;

import java.util.InputMismatchException;
import  java.util.Scanner;
public class Exercici01 {

    public Exercici01(){
        Scanner lec = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.print("introduce números hata que ponga un negativo : ");
            try {
                numero = Integer.parseInt(lec.nextLine());
            }
            catch (InputMismatchException IMEe){
                System.out.println("\u001B[31mERROR!! solo se aceptan números....\u001B[0m");
                Lib.continuar();

            }
            catch (NumberFormatException NFEe){
                System.out.println("\u001B[31mERROR!! solo se aceptan números....\u001B[0m");
                Lib.continuar();
            }

        }while (numero>=0);
    }

}
