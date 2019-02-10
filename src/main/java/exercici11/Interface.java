package exercici11;

import utils.Lib;
import java.util.Scanner;

public class Interface {
    private int eleccio;
    private Scanner lec;
    private boolean esCorrecte;
    private int eleccioGrup;
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
        }while(eleccio <0 || eleccio>4 || !esCorrecte);
        return eleccio;
    }

    public String menuGrup(){
        String [] posiblesGrups = {"1ºDAM","2ºDAM","1ºSMX","2ºSMX"};
        String grup = "";
        do {
            System.out.println("**GRUP**");
            System.out.println("1. 1ºDAM");
            System.out.println("2. 2ºDAM");
            System.out.println("3. 1ºSMX");
            System.out.println("4. 2ºSMX");
            System.out.println("********");
            System.out.print("selecciona un grup: ");
            try{
                eleccioGrup = Integer.parseInt(lec.nextLine());
                if (eleccioGrup<1 || eleccioGrup>4){
                    Lib.mensajeError();
                }
            }
            catch (NumberFormatException nfe){
                Lib.mensajeError();
            }
            switch (eleccioGrup) {
                case 1:
                    grup = posiblesGrups[0];
                    break;
                case 2:
                    grup = posiblesGrups[1];
                    break;
                case 3:
                    grup = posiblesGrups[2];
                    break;
                case 4:
                    grup = posiblesGrups[3];
                    break;
            }
        }while (eleccioGrup<1 || eleccioGrup>4);
        return grup;
    }
}

