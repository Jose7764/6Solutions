package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import view.Visual;
import model.*;

public class logica {


    ArrayList<blocos> ListaBlocos = new ArrayList<>();

    Random random = new Random();

        int b1,b2,b3;
        int b4,b5,b6;
        int b7,b8,b9;

        int d1,d2,d3;
        int d4,d5,d6;
        int d7,d8,d9;

        int r1,r2,r3,r4,r5,r6;

    public void gerarNumeros(){

        b1 = random.nextInt(18);

        while(b1 == 0) {

            b1 = random.nextInt(18);

        }

        b2 = random.nextInt(18);

        while(b2 == b1 || b2 == 0) {

            b2 = random.nextInt(18);

        }

        b3 = random.nextInt(18);

        while(b3 == b1 || b3 == b2 || b3 == 0) {

            b3 = random.nextInt(18);

        }

        b4 = random.nextInt(18);

        while(b4 == b1 || b4 == b2 || b4 == b3|| b4 == 0) {

            b4 = random.nextInt(18);

        }

        b5 = random.nextInt(18);

        while(b5 == b1 || b5 == b2 || b5 == b3 || b5 == b4|| b5 == 0) {

            b5 = random.nextInt(18);

        }

        b6 = random.nextInt(18);

        while(b6 == b1 || b6 == b2 || b6 == b3 || b6 == b4 || b6 == b5 || b6 == 0) {

            b6 = random.nextInt(18);

        }

        b7 = random.nextInt(18);

        while(b7 == b1 || b7 == b2 || b7 == b3 || b7 == b4 || b7 == b5 || b7 == b6 || b7 == 0) {

            b7 = random.nextInt(18);

        }
        b8 = random.nextInt(18);

        while(b8 == b1 || b8 == b2 || b8 == b3 || b8 == b4 || b8 == b5 || b8 == b6 || b8 == b7 || b8 == 0) {

            b8 = random.nextInt(18);

        }
        b9 = random.nextInt(18);

        while(b9 == b1 || b9 == b2 || b9 == b3 || b9 == b4 || b9 == b5 || b9 == b7 || b9 == b8 || b9 == 0) {

            b9 = random.nextInt(18);

        }

        r1 = b1 + b4 + b7;
        r2 = b2 + b5 + b8;
        r3 = b3 + b6 + b9;
        r4 = b1 + b2 + b3;
        r5 = b4 + b5 + b6;
        r6 = b7 + b8 + b9;

    }

    public String resposta1() {

        String re1 = String.valueOf(r1);
        return re1;
    }
    public String resposta2() {

        String re2 = String.valueOf(r2);
        return re2;
    }
    public String resposta3() {

        String re3 = String.valueOf(r3);
        return re3;
    }
    public String resposta4() {

        String re4 = String.valueOf(r4);
        return re4;
    }
    public String resposta5() {

        String re5 = String.valueOf(r5);
        return re5;
    }
    public String resposta6() {

        String re6 = String.valueOf(r6);
        return re6;
    }







    public void armazenarPosibilidade(){
        d1 = b1;
        d2 = b2;
        d3 = b3;
        d4 = b4;
        d5 = b5;
        d6 = b6;
        d7 = b7;
        d8 = b8;
        d9 = b9;


    }
    public void comecarJogo() {

        b1 = 0;
        b2 = 0;
        b3 = 0;
        b4 = 0;
        b5 = 0;
        b6 = 0;
        b7 = 0;
        b8 = 0;
        b9 = 0;

    }

    public void validacaoFinal(){

        if (b1 + b4 + b7 == r1){

        }

        if (b2 + b5 + b8 == r2){

        }

        if (b3 + b6 + b8 == r3){

        }

        if (b1 + b2 + b3 == r4){

        }

        if (b4 + b5 + b6 == r5){

        }

        if (b7 + b8 + b9 == r6){

        }

    }
}
