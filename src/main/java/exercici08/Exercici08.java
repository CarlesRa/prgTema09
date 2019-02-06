package exercici08;

import exercici07.Exercici07;

import java.io.IOException;

public class Exercici08 {
    private int [] vector;
    private int num;
    public Exercici08(){
        vector = new int[4];
        vector[0] = 1;
        vector[1] = 2;
        vector[3] = 4;
        num = 3;
        try{
            num = num/0;
        }
        catch (ArithmeticException aEe1){
            System.out.println("T'he salvat que no es pot dividir per 0 taboll!!");
        }

        for (int i=0; i<=vector.length; i++){
            try{
                vector[i] = i+1;
            }
            catch (IndexOutOfBoundsException iOOBEe3){
                System.out.println("Index out of... xaato");
            }
        }
        try {
            nullPointer();
        }
        catch (NullPointerException nPEe2){
            System.out.println("He provocat un nullPointer");
        }

    }
    public void nullPointer() throws NullPointerException {
        throw new NullPointerException();
    }


}
