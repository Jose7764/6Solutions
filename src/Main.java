import service.logica;
import view.*;

import javax.swing.text.View;

public class Main {

    public static void main (String [] args){

        logica menu = new logica();
        Visual view = new Visual();

        view.telaInicial();

        /*
        menu.comecarJogo();
        menu.gerarRespostas();
        menu.mostrarB();
        menu.armazenarPosibilidade();
         */
    }
}
