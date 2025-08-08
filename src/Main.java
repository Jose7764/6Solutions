import service.logica;
import view.Visual;
import service.logica;

import javax.swing.text.View;

public class Main {

    public static void main (String [] args){

        logica menu = new logica();
        Visual view = new Visual();


        menu.gerarNumeros();
        view.telaInicial();
        menu.armazenarPosibilidade();



    }
}
