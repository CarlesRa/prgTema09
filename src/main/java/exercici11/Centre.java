package exercici11;

import utils.Lib;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Centre {
    private Alumne [] registreAlumne;
    private int puntero;
    private Scanner lec;
    private boolean esCorrecte;
    private int eleccioGrup;
    private String grup;
    public Centre(){
        registreAlumne = new Alumne[50];
        puntero = 0;
        lec = new Scanner(System.in);
        esCorrecte = false;
        grup = "";
    }

    public void registrarAlumne(){
        int nia = 0;
        String nom = "";
        String congnom = "";
        String dataNaixient = "";
        String [] posiblesGrups = {"1ºDAM","2ºDAM","1ºSMX","2ºSMX"};
        int telefon = 0;
        do {
            esCorrecte = true;
            System.out.print("Introduix el nia: ");
            try{
                nia = Integer.parseInt(lec.nextLine());
                for (int i=0; i<puntero; i++){
                    if (registreAlumne[i].getNia() == nia){
                        System.out.println("El nia no es pot repetir...");
                        Lib.continuar();
                        esCorrecte = false;
                    }
                }
            }
            catch (NumberFormatException nfe){
                Lib.mensajeError();
            }
        }while (!esCorrecte);
        do {
            System.out.print("Introduix el nom: ");
            nom = lec.nextLine();
            esCorrecte = true;
            if (nom.equals("")){
                System.out.println("No ha introduit cap nom...");
                Lib.continuar();
                esCorrecte = false;
            }
        }while (!esCorrecte);
        do {
            System.out.print("Introduix el congnom: ");
            congnom = lec.nextLine();
            esCorrecte = true;
            if (congnom.equals("")) {
                System.out.println("No ha introduit cap congnom...");
                Lib.continuar();
                esCorrecte = false;
            }
        }while (!esCorrecte);
        do {
            System.out.print("Introduix la data de naiximent: ");
            dataNaixient = lec.nextLine();
            esCorrecte = Lib.validarFecha(dataNaixient);
            if (!esCorrecte){
                Lib.mensajeError();
                System.out.println("Recorda introduir la data en format DD-MM-AAAA");
                Lib.continuar();
            }
        }while (!esCorrecte);
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
        do {
            esCorrecte = true;
            System.out.print("Introduixca el telefon: ");
            try{
                telefon = Integer.parseInt(lec.nextLine());
                if (telefon<600000000 || telefon>699999999){
                    Lib.mensajeError();
                    esCorrecte = false;
                }
            }
            catch (NumberFormatException nfe){
                Lib.mensajeError();
                esCorrecte = false;
            }
        }while (!esCorrecte);
        Alumne aux = new Alumne(nia,nom,congnom,dataNaixient,grup,telefon);
        registreAlumne [puntero] = aux;
        System.out.println("Alumne creat amb exit");
        System.out.println(aux.toString());
        Lib.continuar();
        puntero++;
    }

    public void numberFormatE(int dada){
            try {
                dada = Integer.parseInt(lec.nextLine());
                esCorrecte = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Dada incorrecta...");
                Lib.continuar();
            }
    }

    public void inputMismatchE(String dada){

        try {
            dada = lec.nextLine();
            esCorrecte = true;
        } catch (InputMismatchException ime) {
            System.out.println("Dada incorrecta...");
            Lib.continuar();
        }
    }
}
