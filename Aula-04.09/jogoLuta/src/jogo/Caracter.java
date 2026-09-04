package jogo;

import java.util.Random;


public class Caracter {
    Random random = new Random();

    String name;
    int vida = 100;
    int ataque = random.nextInt(11) + 10;
    int defesa = random.nextInt(6) + 10;





    public void defesa(int dano) {
        vida -= dano;
}

}
