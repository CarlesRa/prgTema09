package exercici11;

import utils.Lib;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Interface {
    private int eleccio;
    private Scanner lec;
    private boolean esCorrecte;
    public Interface(){
        lec = new Scanner (System.in);
        eleccio = 0;
        esCorrecte = false;
    }

    public int mostrarMenu(){
        do {
            System.out.println("**GESTIÓ ALUMNES**");
            System.out.println("******************");
            System.out.println("1. Nou alumne...");
            System.out.println("2. Baixa alumne...");
            System.out.println("3. Consultes...");
            System.out.println("******************");
            System.out.println("0. Eixir");
            System.out.print("Tria una opció: ");
            try {
                eleccio = Integer.parseInt(lec.nextLine());
                if (eleccio<0 || eleccio>3){
                    Lib.mensajeError();
                }
                esCorrecte = true;
            }
            catch (NumberFormatException nfe){
                Lib.mensajeError();
            }
        }while(eleccio <0 || eleccio>3 || !esCorrecte);
        return eleccio;
    }

    public int mostrarSubMenu(){
        do {
            System.out.println("*****************");
            System.out.println("**  CONSULTES  **");
            System.out.println("*****************");
            System.out.println("1. Per grup...");
            System.out.println("2. Per edad...");
            System.out.println("3. Per nia...");
            System.out.println("4. Per cognoms...");
            System.out.println("*****************");
            System.out.println("0. Eixir");
            System.out.print("Tria una opció: ");
            try {
                eleccio = Integer.parseInt(lec.nextLine());
                esCorrecte = true;
            }
            catch (NumberFormatException nfe){
                Lib.mensajeError();
            }
        }while(eleccio !=0 || !esCorrecte);
        return eleccio;
    }

}

