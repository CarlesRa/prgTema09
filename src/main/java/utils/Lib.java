package utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import  java.util.Scanner;
import java.util.Random;
public class Lib {

        static  Scanner lec = new Scanner (System.in);
        public static  String limpiarPantalla(){
            return "\u001B[H\u001B[2J";
        }

        public static String letraRoja(){
            return "\u001B[31m";
        }

        public static  String reiniciarColorLetra(){
            return "\u001B[0m";
        }

        public  static void mensajeError(){

            System.out.print(limpiarPantalla()+letraRoja()+
            "Dato erroneo, pulsa intro para continuar: "+ reiniciarColorLetra());
            lec.nextLine();
        }

        public static void mensajeSalida(){
            System.out.print("Saliendo de la aplicación, pulsa intro para continuar: ");

            lec.nextLine();
        }

        public static  void continuar(){
            System.out.print("Intro per continuar: ");
            lec.nextLine();
        }

        /**
         * Metode per validar dates.
         * @param fecha entra un string amb la data.
         * @return
         */
        public static boolean validarFecha(String fecha) {

            try {

                SimpleDateFormat formatoFecha;
                formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

                formatoFecha.setLenient(false);

                formatoFecha.parse(fecha);

            } catch (ParseException e) {

                return false;

            }

            return true;

        }

        //Generar un numero random compres entre dos enters.
        public static int random(int min, int max){
            int aleatori;
            Random rnd=new Random();
            aleatori=rnd.nextInt(max-min+1)+min;
            return aleatori;
        }

        public static int calcularEdad(Calendar fechaNac) {

            Calendar fechaActual = Calendar.getInstance();
            // Cálculo de las diferencias.
            int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
            int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
            int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);
            /*comprovem si el mes del aniversari es posterior a la data
            o si estem en el mes pero no ha arrivat el dia*/
            if(months < 0 || months==0 && days < 0){
                years--;
            }
            //en cas de que ja haja pasat la data
            if(months<=0 && days>=0){
                years++;
            }
            return years;
        }

    /**
     * mostra una barra de carrega.
     * @param num temps que tarda la barra en milisegons.
     */
    public static void barraCarrega(int num){

        for (int i = 0; i <30; i++) {
            try {
                Thread.sleep(num);
            } catch (InterruptedException e) {
                // this part is executed when an exception (in this example
                // InterruptedException) occurs
            }
            System.out.print("\u001B[44m ");
        }
        System.out.println("\u001B[0m");
    }
    }
