package exercici11;

import utils.Lib;

import java.util.*;

public class Centre {
    private Alumne [] registreAlumne;
    private int puntero;
    private Scanner lec;
    private boolean esCorrecte;
    private Interface menu;
    private String grup;
    private GregorianCalendar fechaActual;
    public Centre(){
        registreAlumne = new Alumne[50];
        puntero = 0;
        lec = new Scanner(System.in);
        esCorrecte = false;
        grup = "";
        menu = new Interface();
        fechaActual = (GregorianCalendar) Calendar.getInstance();
    }

    public void registrarAlumne(){
        int nia = 0;
        String any = "";
        String nom = "";
        String congnom = "";
        String dataNaixient = "";
        int telefon = 0;
        int anyInt;
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
                esCorrecte = false;
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
            else{
                any = dataNaixient.substring(6,10);
                anyInt = Integer.parseInt(any);
                if (anyInt>fechaActual.get(Calendar.YEAR)-2
                        || anyInt<fechaActual.get(Calendar.YEAR)-91){
                    System.out.println("No poden existir alumnes amb eixa edat...");
                    esCorrecte = false;
                }
            }
        }while (!esCorrecte);
        grup = menuGrup();
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
        grup=menuGrup();
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
        esCorrecte = false;
        int edat=0;
        int calcularEdad=0;
        int dia;
        int mes;
        int año;
        GregorianCalendar fechaCompleta;
        esCorrecte = false;
        do {
            System.out.print("Introduix la edat: ");
            esCorrecte = true;
            try {
                edat = Integer.parseInt(lec.nextLine());
                if(edat<3 || edat>90){
                    System.out.println("no poden haver alumnes amb eixa edat...");
                    esCorrecte = false;
                    Lib.continuar();
                }
            }
            catch (NumberFormatException nfe) {
                Lib.mensajeError();
            }
        }while (!esCorrecte);
        esCorrecte = false;
        for(int i = 0; i<puntero; i++){
            dia=Integer.parseInt(registreAlumne[i].getDataNaiximent().substring(0,2));
            mes=Integer.parseInt(registreAlumne[i].getDataNaiximent().substring(3,5));
            año=Integer.parseInt(registreAlumne[i].getDataNaiximent().substring(6,10));
            fechaCompleta=new GregorianCalendar(año,mes,dia);
            calcularEdad=Lib.calcularEdad(fechaCompleta);
            if(calcularEdad==edat){
                System.out.println(registreAlumne[i].toString());
                esCorrecte = true;
            }
        }
        if(!esCorrecte){
            System.out.println("\u001B[31mNingun alumne te eixa edat...\u001B[0m");
        }
        Lib.continuar();
    }

    public void consultarPerNia(){
        int nia;
        do {
            esCorrecte = false;
            System.out.print("Introduix el nia: ");
            try{
                nia = Integer.parseInt(lec.nextLine());
                for (int i=0; i<puntero; i++){
                    if (registreAlumne[i].getNia() == nia){
                        System.out.println(registreAlumne[i].toString());
                        Lib.continuar();
                        return;
                    }
                }
                if(!esCorrecte){
                    System.out.println("Ningun alumne amb eixe nia...");
                    esCorrecte = true;
                }
            }
            catch (NumberFormatException nfe){
                Lib.mensajeError();
            }
        }while (!esCorrecte);

    }

    public void consultarPerCognom(){
        esCorrecte = false;
        String cognom;
        System.out.print("introduix el cognom: ");
        cognom = lec.nextLine();
        for (int i=0; i<puntero; i++){
            if (cognom.equals(registreAlumne[i].getCognom().substring(0,cognom.length()))){
                System.out.println(registreAlumne[i].toString());
                esCorrecte = true;
            }
        }
        if (!esCorrecte){
            System.out.println("Ningun alumne amb eixe cognom...");
        }
        Lib.continuar();
    }

    public String menuGrup(){
        String [] posiblesGrups = {"1ºDAM","2ºDAM","1ºSMX","2ºSMX"};
        String grup = "";
        int eleccioGrup = 0;
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
