package exercici05;
import utils.Lib;

import java.util.Scanner;
public class Exercici05 {
    private Scanner lec = new Scanner(System.in);
    private Alumne [] registreAlumnes;
    private Alumne alumneMajor;
    public Exercici05(){
        registreAlumnes = new Alumne[2];
        alumneMajor = new Alumne();
        crearAlumne();
        Lib.limpiarPantalla();
        System.out.println("Els alumnes creats son:");
        System.out.println(registreAlumnes[0].toString());
        System.out.println(registreAlumnes[1].toString());
        if (registreAlumnes[0].getEdad()>registreAlumnes[1].getEdad()
        || registreAlumnes[1].getEdad()>registreAlumnes[0].getEdad()) {
            System.out.println("\nEl mes major es: " + alumneMajor.toString());
        }
        else{
            System.out.println("\nEls alumnes tenen la mateixa edat...");
        }
    }

    private  void crearAlumne(){
        boolean condicio;
        String nom ="";
        int edat = 0;
        float altura = 0;
        Lib.limpiarPantalla();
        for (int i = 0; i<2; i++){
            Alumne a = new Alumne();
            while (nom.equals("")) {
                System.out.print("Introduix el nom: ");
                nom = lec.nextLine();
                if (nom.equals("")){
                    System.out.println(Lib.letraRoja()+"No ha indicat cap nom..."
                            +Lib.reiniciarColorLetra());
                    Lib.continuar();
                }
            }
            condicio = false;
            while (!condicio){
                System.out.print("Introduix l'edat: ");
                try {
                    edat = Integer.parseInt(lec.nextLine());
                    if (edat>=5 && edat<=90) {
                        condicio = true;
                    }
                    else {
                        System.out.print(Lib.letraRoja()+"No poden existir alumnes amb eixa edat.."
                        +Lib.reiniciarColorLetra());
                        condicio = false;
                        Lib.continuar();
                    }
                } catch (NumberFormatException NFEe2) {
                    System.out.println(Lib.letraRoja()+"La edat tenen que ser numeros enters... "
                    +Lib.reiniciarColorLetra());
                    condicio = false;
                    Lib.continuar();
                }
            }
            condicio = false;
            while (!condicio){
                System.out.print("Introduix l'altura: ");
                try {
                    altura = Float.parseFloat(lec.nextLine());
                    if (altura>=0.50 && altura<=2.20) {
                        condicio = true;
                    }
                    else {
                        System.out.println(Lib.letraRoja()+"No existixen humans amb eixa altura..xD"
                                +Lib.reiniciarColorLetra());
                        condicio = false;
                        Lib.continuar();
                    }
                } catch (NumberFormatException NFEe2) {
                    System.out.println(Lib.letraRoja()+"L'altura tenen que ser numeros... "+Lib.reiniciarColorLetra());
                    condicio = false;
                    Lib.continuar();
                }
            }
            a.setNom(nom);
            a.setEdad(edat);
            a.setAltura(altura);
            if (alumneMajor.getEdad()<a.getEdad()){
                alumneMajor.setNom(a.getNom());
                alumneMajor.setEdad(a.getEdad());
                alumneMajor.setAltura(a.getAltura());
            }
            registreAlumnes [i] = a;
            System.out.println("Alumne creat amb exit!!");
            System.out.println(a.toString());
            Lib.continuar();
            nom = "";
        }

    }
}
