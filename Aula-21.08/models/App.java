package models;

import java.util.*;
import models.Carro;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro c1 = new Carro();

        System.out.println("Digite a cor do carro: ");
        c1.setCor(sc.next());

        System.out.println(c1);

    }
}
