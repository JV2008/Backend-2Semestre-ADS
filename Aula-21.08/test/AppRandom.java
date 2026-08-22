package test;

import java.util.Random;

public class AppRandom {

    public static void main(String[] args) throws Exception {
        Random r = new Random();
        for(int i=0; i<3; i++) {

            int numeroAleatorio = r.nextInt(100); // Gera um número aleatório entre 0 e 99
            System.out.println("Número aleatório: " + numeroAleatorio);
        }
    }

}
