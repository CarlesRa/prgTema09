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
    private Interface menu;
    private String grup;
    public Centre(){
        registreAlumne = new Alumne[50];
        puntero = 0;
        lec = new Scanner(System.in);
        esCorrecte = false;
        grup = "";
        menu = new Interface();
    }

    public void registrarAlumne(){
        int nia = 0;
        String nom = "";
        String congnom = "";
        String dataNaixient = "";
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
        grup = menu.menuGrup();
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
        System.out.println("Alumne creat amb exit!!");
        System.out.println(aux.toString());
        Lib.continuar();
        puntero++;
    }

    public void baixaAlumne(){
        esCorrecte = false;
        int nia;
        do {
            System.out.print("Introduix el nia del alumne a remoure: ");
            try {
                nia = Integer.parseInt(lec.nextLine());
                for (int i=0; i<puntero; i++){
                    try {
                        if (nia == registreAlumne[i].getNia()) {
                            registreAlumne[i] = registreAlumne[puntero-1];
                            esCorrecte = true;
                            puntero--;
                        }
                    }
                    catch (NullPointerException npe){

                    }
                }
                if (esCorrecte){
                    System.out.println("Alumne remogut amb exit...");
                    Lib.continuar();
                }
                else{
                    System.out.println("No hi ha cap alumne amb eixe nia...");
                    Lib.continuar();
                    esCorrecte = true;
                }
            }
            catch (NumberFormatException nfe){
                Lib.mensajeError();
            }
        } while (!esCorrecte);
    }

    public void consultarPerGrup(){
        esCorrecte = false;
        String grup;
        grup=menu.menuGrup();
        for (int i=0; i<puntero; i++){
            try {
                if (registreAlumne[i].getGrup().equals(grup)) {
                    System.out.println(registreAlumne[i].toString());
                    esCorrecte = true;
                }
            }
            catch (NullPointerException npe){

            }
        }
        if (!esCorrecte){
            System.out.println("Ningun alumne amb eixe grup...");
        }
        Lib.continuar();
    }

    public void consultarPerEdat(){
        int edat;

    }

    /*public void numberFormatE(int dada){
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
    }*/
}
