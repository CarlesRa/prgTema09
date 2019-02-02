package exercici05;

public class Alumne {
    private String nom;
    private int edad;
    private float altura;
    public Alumne(){
        nom = "";
        edad = 0;
        altura = 0;
    }

    public Alumne(String nom, int edad, float altura) {
        this.nom = nom;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
            this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "nom= " + nom +
                ", edat= " + edad + " anys"+
                ", altura= " + altura + " metres."+
                '}';
    }
}
