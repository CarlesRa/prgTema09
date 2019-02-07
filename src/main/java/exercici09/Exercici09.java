package exercici09;

public class Exercici09 {
    private String [] vector;
    private int num;
    private MiExcepcion mE;
    public Exercici09() {
        try {

            nullPointer(vector);

        } catch (MiExcepcion mi) {
            mi.getMessage();
        }
    }



    public void nullPointer() throws NullPointerException {
        throw new NullPointerException();
    }

    public void nullPointer(String [] vector)throws MiExcepcion{
            throw new MiExcepcion("hola");
    }

}
