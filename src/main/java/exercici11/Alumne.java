package exercici11;

public class Alumne {

    private int nia;
    private String nom;
    private String cognom;
    private String dataNaiximent;
    private String grup;
    private int telefon;

    public Alumne(int nia, String nom, String cogmom, String dataNaiximent, String grup, int telefon) {
        this.nia = nia;
        this.nom = nom;
        this.cognom = cogmom;
        this.dataNaiximent = dataNaiximent;
        this.grup = grup;
        this.telefon = telefon;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getDataNaiximent() {
        return dataNaiximent;
    }

    public void setDataNaiximent(String dataNaiximent) {
        this.dataNaiximent = dataNaiximent;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }


    //metodes
    @Override
    public String toString(){
        StringBuilder sB=new StringBuilder();
        String s;
        sB.append(getNia()).append("\t");
        sB.append(getNom()).append("\t");
        sB.append(getCognom()).append("\t");
        sB.append(getDataNaiximent()).append("\t");
        sB.append(getGrup()).append("\t");
        sB.append(getTelefon()).append("\t");
        s=sB.toString();
        return s;
    }
}
