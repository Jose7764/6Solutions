package service;

import java.util.Random;

public class logica {

    Random random = new Random();

        int b1,b2,b3;
        int b4,b5,b6;
        int b7,b8,b9;

        int r1,r2,r3,r4,r5,r6;



    public void gerarNumeros(){

        b1 = random.nextInt(50);
        b2 = random.nextInt(50);
        b3 = random.nextInt(50);
        b4 = random.nextInt(50);
        b5 = random.nextInt(50);
        b6 = random.nextInt(50);
        b7 = random.nextInt(50);
        b8 = random.nextInt(50);
        b9 = random.nextInt(50);



    }

    public void gerarRespostas(){

        r1 = b1 + b4;
        r2 = b2 + b5+b8;
    }




}
