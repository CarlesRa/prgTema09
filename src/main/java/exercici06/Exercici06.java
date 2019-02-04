package exercici06;

import java.util.Arrays;

public class Exercici06 {
    public Exercici06(){
        int [] array= {14,15,56,78,98,0,-1,-2};
        int denominador = 2;
        System.out.println(Arrays.toString(dividirEntreArray(denominador,array)));
    }
    public int [] dividirEntreArray(int num, int [] enters){
        int [] arrayDividit = new int[enters.length];
        for (int i=0; i<arrayDividit.length; i++){
            try {
                arrayDividit[i] = enters[i] / num;
            }catch (ArithmeticException AEe1){

            }
        }
        return enters;
    }
}
