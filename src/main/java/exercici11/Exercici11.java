package exercici11;

public class Exercici11 {
    private int eleccio;
    private int eleccio2;
    private Interface menu;
    private Centre centre;
    public Exercici11(){
        eleccio = 0;
        eleccio2 = 0;
        menu = new Interface();
        centre = new Centre();
        do {
            eleccio = menu.mostrarMenu();
            switch (eleccio) {
                case 1:
                    centre.registrarAlumne();

            }
        }while (eleccio!=0);
    }
}
