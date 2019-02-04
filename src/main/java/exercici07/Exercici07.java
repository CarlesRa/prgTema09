package exercici07;

public class Exercici07 {
    public Exercici07(){
        String [] array = new String[5];
        array[0]="Hola amigo";
        array[1] = "O dios mio";
        array[3] = "La diosa";
        array[4] = "Al patio";
        mostrarCadenesArray(array);
    }

    public void mostrarCadenesArray(String[] vector){
        for (int i=0; i<vector.length; i++){
            try {
                System.out.println(vector[i].charAt(0));
            }
            catch (NullPointerException NPEe1){

            }

        }
    }
}
