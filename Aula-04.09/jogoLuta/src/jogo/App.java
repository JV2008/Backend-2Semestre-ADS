package jogo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do personagem 1:");
        String nome1 = scanner.nextLine();
        Caracter personagem1 = new Caracter();
        personagem1.name = nome1;
        System.out.println("Personagem criado: " + personagem1.name);

        System.out.println("Digite o nome do personagem 2:");
        String nome2 = scanner.nextLine();
        Caracter personagem2 = new Caracter();
        personagem2.name = nome2;
        System.out.println("Personagem criado: " + personagem2.name);

    int rodada = 1;
while (personagem1.vida > 0 && personagem2.vida > 0) {
    // Sorteia novo ataque e defesa a cada rodada
    int ataqueP1 = personagem1.random.nextInt(11) + 10;
    int defesaP2 = personagem2.random.nextInt(6) + 10;
    int danoP1 = ataqueP1 - defesaP2;
    
    System.out.println(personagem1.name + " ataca " + personagem2.name);
    personagem2.defesa(danoP1);
    System.out.println(personagem2.name + " tem " + personagem2.vida + " de vida restante.");

    if (personagem2.vida <= 0) break;

    int ataqueP2 = personagem2.random.nextInt(11) + 10;
    int defesaP1 = personagem1.random.nextInt(6) + 10;
    int danoP2 = ataqueP2 - defesaP1;
    
    System.out.println(personagem2.name + " ataca " + personagem1.name);
    personagem1.defesa(danoP2);
    System.out.println(personagem1.name + " tem " + personagem1.vida + " de vida restante.");

    rodada++;

        }

        System.out.println("\nFim da batalha!");
        if (personagem1.vida <= 0) {
            System.out.println(personagem2.name + " venceu!");
        } else {
            System.out.println(personagem1.name + " venceu!");
        }

        scanner.close();
    }
}