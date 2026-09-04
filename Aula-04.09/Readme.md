![senai_logo](images/logo.png)

# Correção Lista de exercícios 02: POO

Profº.: Cainã Antunes Silva  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___



1. **Jogo de Luta**
    <br>
    >**Contexto:** Desenvolva um jogo simples onde os jogadores podem controlar personagens e lutar entre si.
    
    **Descrição:**
    ```mermaid
        classDiagram
        class Character{
            - name : string
            - life : int
            - attack : int
            - defense : int
            + defense (int opponentAttack): void
        }
    ```
    
    **Instruções:**
    * Implemente um construtor na classe `Character` que inicialize o nome e a vida do personagem (a vida inicia sempre com 100), e gere valores aleatórios para os atributos ataque (entre 20 e 30) e defesa (entre 10 e 15).
    * Implemente o método de defesa, que receberá a força de ataque do oponente, calculará o dano e atualizará a vida do personagem. O dano será dado pela subtração do poder de ataque do oponente pelo poder de defesa do objeto atacado.
    * Dentro do método main,instancie dois personagens, passando seus nomes como parâmetros para o construtor da classe `Character`.
    * Crie um loop que faça com que os personagens lutem entre si, chamando o método `defense` de um personagem e passando como parâmetro a força de ataque do outro personagem. Repita o processo até que a vida de um dos personagens chegue a zero, então indique o vencedor.