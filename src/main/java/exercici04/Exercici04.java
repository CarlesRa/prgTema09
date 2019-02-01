package exercici04;
import utils.Lib;

import java.util.Arrays;
import java.util.Scanner;
public class Exercici04 {
    private Scanner lec = new Scanner(System.in);
    private int []vector ;
    private int []vFail;
    private boolean esLetra;
    public Exercici04(){
        vector = new int[5];
        vFail = null;
        rellenarVector(vector);
        System.out.println(Arrays.toString(vector));
        rellenarVector(vFail);

    }

    public void rellenarVector(int [] vector){
        int num = 0;
        int i = 0;
        boolean condicion = false;
        while (!condicion){
            System.out.print("Introduce un número: ");
            try {
                num = Integer.parseInt(lec.nextLine());
                vector[i] = num;
                i++;
            } catch (NumberFormatException NFEe) {
                System.out.println("No puedes introducir letras.");
                Lib.continuar();
            }
            catch (ArrayIndexOutOfBoundsException AIOOBEe){
                System.out.println("Ha superado la capacidad de almacenamiento.");
                condicion = true;
            }
            catch (NullPointerException NPEe){
                System.out.println("Es un vector vacio... no se pueden introducir valores.");
                condicion = true;
            }
        }
    }
}
