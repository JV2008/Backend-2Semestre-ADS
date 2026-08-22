# ☕ Aula 03 — Classes Java

> Material de estudo sobre **pacotes, String, Random, JOptionPane e classes estáticas** em Java.

---

## 📚 Conteúdo da Aula

* [Pacotes](#-pacotes)
* [String](#-string)

  * [Criando Strings](#criando-strings)
  * [Métodos da classe String](#métodos-da-classe-string)
  * [Imutabilidade](#imutabilidade)
  * [Concatenação](#concatenação-de-strings)
  * [Comparação](#comparação-entre-strings)
* [Random](#-random)

  * [Criando um Random](#criando-um-objeto-random)
  * [Métodos](#principais-métodos)
  * [Seed](#seed)
* [JOptionPane](#-joptionpane)

  * [Entrada de dados](#showinputdialog)
  * [Exibição de mensagens](#showmessagedialog)
* [Classes Estáticas](#-classes-estáticas)

---

# 📦 Pacotes

As classes da biblioteca Java são organizadas em **pacotes**.

Um pacote é um grupo de classes relacionadas.

A biblioteca padrão do Java possui diversos pacotes, organizados em uma estrutura hierárquica.

### Exemplos

```text
java
├── lang
├── util
├── io
├── math
└── swing
```

Algumas classes conhecidas:

| Classe        | Pacote        |
| ------------- | ------------- |
| `String`      | `java.lang`   |
| `Scanner`     | `java.util`   |
| `Random`      | `java.util`   |
| `JOptionPane` | `javax.swing` |

## Importando classes

Para utilizar uma classe de outro pacote, podemos utilizar `import`.

```java
import java.util.Scanner;
```

Também podemos importar todas as classes de um pacote:

```java
import java.util.*;
```

> ⚠️ O uso de `*` importa todas as classes daquele pacote, mas não importa classes de subpacotes.

---

# 🔤 String

## Introdução

Uma `String` representa uma sequência de caracteres.

Ela pode conter:

* Letras
* Números
* Caracteres especiais
* Espaços

Diferentemente de tipos como `int`, `double` e `boolean`, `String` **não é um tipo primitivo**.

Ela é uma **classe**.

```java
String nome = "João";
```

Portanto:

```text
String → classe
nome   → referência para um objeto String
```

A classe `String` pertence ao pacote:

```text
java.lang
```

Como `java.lang` é importado automaticamente pelo Java, não precisamos escrever:

```java
import java.lang.String;
```

---

## Criando Strings

É possível criar uma String utilizando `new`:

```java
String str = new String("Hello world!");
```

Porém, essa não é a forma mais comum.

A maneira mais utilizada é através de um **literal de String**:

```java
String str = "Hello world!";
```

---

# 🔧 Métodos da classe String

A classe `String` possui diversos métodos para trabalhar com textos.

---

## `length()`

Retorna a quantidade de caracteres da String.

```java
String nome = "Joao";

System.out.println(nome.length());
```

Resultado:

```text
4
```

### Importante

Os índices começam em `0`.

Por exemplo:

```java
String str = "Hello";
```

| Caractere |  H |  e |  l |  l |  o |
| --------- | -: | -: | -: | -: | -: |
| Índice    |  0 |  1 |  2 |  3 |  4 |

O último índice sempre será:

```java
str.length() - 1
```

---

## `indexOf()`

Localiza a posição de determinado caractere ou texto.

```java
String str = "Hello, World";

System.out.println(str.indexOf("W"));
```

Resultado:

```text
7
```

A contagem começa sempre em `0`.

---

## `charAt()`

Retorna o caractere localizado em determinado índice.

```java
String str = "Hello";

System.out.println(str.charAt(0));
```

Resultado:

```text
H
```

Outro exemplo:

```java
System.out.println(str.charAt(4));
```

Resultado:

```text
o
```

---

## `substring()`

Permite extrair uma parte de uma String.

### Com índice inicial

```java
String str = "Hello World";

String parte = str.substring(6);

System.out.println(parte);
```

Resultado:

```text
World
```

### Com início e fim

```java
String str = "Hello World";

String parte = str.substring(0, 5);

System.out.println(parte);
```

Resultado:

```text
Hello
```

> ⚠️ O índice final não é incluído.

---

## `replace()`

Substitui ocorrências de determinado caractere ou sequência.

```java
String str = "banana";

str = str.replace('a', 'o');

System.out.println(str);
```

Resultado:

```text
bonono
```

Sintaxe:

```java
replace(char oldChar, char newChar)
```

---

## `replaceFirst()`

Substitui apenas a **primeira ocorrência** encontrada.

```java
String str = "banana";

str = str.replaceFirst("a", "o");

System.out.println(str);
```

Resultado:

```text
bonana
```

---

# 🔒 Imutabilidade

Uma característica muito importante da classe `String` é sua **imutabilidade**.

Isso significa que, depois que um objeto `String` é criado, seu conteúdo não pode ser alterado.

Por exemplo:

```java
String nome = "Joao";

nome.toUpperCase();
```

Isso **não altera** a String original.

Para armazenar o resultado:

```java
nome = nome.toUpperCase();
```

Agora:

```text
JOAO
```

### Por que isso é importante?

Quando fazemos:

```java
String str1 = "Hello";
String str2 = "Hello";
```

O Java pode reutilizar a mesma String armazenada na memória, pois Strings são imutáveis.

Esse mecanismo está relacionado ao **String Pool**.

---

# ➕ Concatenação de Strings

Concatenação significa **juntar Strings**.

Existem duas formas principais.

## Operador `+`

```java
String nome = "Joao";
String sobrenome = "Victor";

String completo = nome + " " + sobrenome;

System.out.println(completo);
```

Resultado:

```text
Joao Victor
```

O operador `+` também permite concatenar outros tipos:

```java
int idade = 18;

System.out.println("Idade: " + idade);
```

Resultado:

```text
Idade: 18
```

---

## Método `concat()`

Também podemos utilizar:

```java
String nome = "Joao";

nome = nome.concat(" Victor");

System.out.println(nome);
```

Resultado:

```text
Joao Victor
```

### Diferença

O operador `+` é mais flexível:

```java
"Idade: " + 18
```

Já `concat()` trabalha diretamente com Strings:

```java
"Joao".concat(" Victor")
```

---

# ⚖️ Comparação entre Strings

## `equals()`

Para comparar o conteúdo de duas Strings, utilizamos `equals()`.

```java
String a = "Java";
String b = "Java";

System.out.println(a.equals(b));
```

Resultado:

```text
true
```

Se os conteúdos forem diferentes:

```java
System.out.println("Java".equals("Python"));
```

Resultado:

```text
false
```

### ⚠️ Não confundir com `==`

Para comparar o **conteúdo** de Strings, normalmente devemos utilizar:

```java
str1.equals(str2)
```

e não:

```java
str1 == str2
```

O `==` compara referências de objetos, enquanto `equals()` verifica o conteúdo.

---

## `compareTo()`

Compara duas Strings lexicograficamente.

```java
System.out.println("car".compareTo("car"));
```

Retorna:

```text
0
```

Quando as Strings são diferentes, o resultado será maior ou menor que zero.

```java
"computer".compareTo("comparison");
```

Resultado:

```text
> 0
```

E:

```java
"cab".compareTo("car");
```

Resultado:

```text
< 0
```

### Resumo

```text
0     → Strings iguais
< 0   → primeira String vem antes
> 0   → primeira String vem depois
```

---

# 🎲 Random

A classe `Random` permite gerar valores pseudoaleatórios.

Ela pertence ao pacote:

```java
java.util
```

Por isso precisamos importar:

```java
import java.util.Random;
```

## Onde podemos utilizar números aleatórios?

Alguns exemplos:

* 🎮 Jogos
* 🧪 Testes de software
* 📊 Simulações
* 🔐 Segurança e geração de valores aleatórios
* 🎲 Sorteios
* 🃏 Sistemas de cartas e dados

---

# Criando um objeto Random

```java
Random r = new Random();
```

Depois podemos utilizar seus métodos.

---

## `nextInt()`

Gera um número inteiro.

```java
int numero = r.nextInt();
```

Sem parâmetro, pode gerar diferentes valores dentro do intervalo de `int`.

---

## `nextInt(int bound)`

Podemos determinar um limite.

```java
int numeroAleatorio = r.nextInt(100);
```

Isso gera:

```text
0 até 99
```

### Regra importante

```java
nextInt(n)
```

gera:

```text
0 ≤ número < n
```

Portanto:

```java
r.nextInt(10);
```

pode gerar:

```text
0, 1, 2, 3, 4, 5, 6, 7, 8, 9
```

### Exemplo

```java
import java.util.Random;

public class AppRandom {

    public static void main(String[] args) {

        Random r = new Random();

        int numeroAleatorio = r.nextInt(100);

        System.out.println("Número aleatório: " + numeroAleatorio);
    }
}
```

---

## Outros métodos

A classe `Random` possui métodos para diferentes tipos:

```java
nextInt()
nextLong()
nextFloat()
nextDouble()
nextBoolean()
```

Exemplos:

```java
Random r = new Random();

int numero = r.nextInt(100);

double decimal = r.nextDouble();

boolean resposta = r.nextBoolean();
```

> ⚠️ Os valores gerados por `Random` são **pseudoaleatórios**, não devem ser considerados adequados para necessidades criptográficas.

---

# 🌱 Seed

Uma `seed` (semente) permite controlar a sequência pseudoaleatória.

```java
Random r = new Random(10);
```

Ao utilizar a mesma seed, a sequência gerada será reproduzível.

Exemplo:

```java
Random r1 = new Random(10);
Random r2 = new Random(10);
```

As duas instâncias produzirão a mesma sequência de valores, desde que os mesmos métodos sejam chamados na mesma ordem.

Também podemos utilizar:

```java
r.setSeed(10);
```

---

# 🖥️ JOptionPane

`JOptionPane` é uma classe da biblioteca `javax.swing` utilizada para criar **caixas de diálogo**.

Ela permite:

* Exibir mensagens
* Solicitar dados
* Criar perguntas
* Apresentar opções ao usuário
* Criar interações simples com interface gráfica

Para utilizá-la:

```java
import javax.swing.JOptionPane;
```

---

# ⌨️ `showInputDialog()`

Utilizado para solicitar uma entrada do usuário.

Exemplo:

```java
String mensagem = JOptionPane.showInputDialog("Digite uma mensagem:");

System.out.println(mensagem);
```

O usuário digita algo e o valor retornado é armazenado na variável.

### Exemplo

```java
import javax.swing.JOptionPane;

public class OpcaoJ {

    public static void main(String[] args) {

        String mensagem =
                JOptionPane.showInputDialog("Digite uma mensagem:");

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
```

### Fluxo

```text
showInputDialog()
       ↓
Usuário digita
       ↓
String recebe o valor
       ↓
showMessageDialog()
       ↓
Mensagem é exibida
```

---

# 💬 `showMessageDialog()`

Utilizado para exibir uma mensagem.

```java
JOptionPane.showMessageDialog(
    null,
    "Olá, mundo!"
);
```

Também podemos especificar um título e o tipo da mensagem:

```java
JOptionPane.showMessageDialog(
    null,
    "Mensagem informativa",
    "Título",
    JOptionPane.INFORMATION_MESSAGE
);
```

---

# 🧩 Exemplo completo com JOptionPane

```java
import javax.swing.JOptionPane;

public class Exemplo {

    public static void main(String[] args) {

        String nome =
                JOptionPane.showInputDialog("Digite seu nome:");

        JOptionPane.showMessageDialog(
                null,
                "Olá, " + nome + "!"
        );
    }
}
```

### Resultado

O programa solicita:

```text
Digite seu nome:
```

Se o usuário digitar:

```text
João
```

Será exibido:

```text
Olá, João!
```

---

# 📚 Principais conceitos aprendidos

| Conceito              | Descrição                                  |
| --------------------- | ------------------------------------------ |
| `package`             | Organiza classes em pacotes                |
| `import`              | Permite utilizar classes de outros pacotes |
| `String`              | Classe utilizada para representar textos   |
| `length()`            | Retorna o tamanho de uma String            |
| `indexOf()`           | Localiza um caractere ou sequência         |
| `charAt()`            | Retorna um caractere pelo índice           |
| `substring()`         | Extrai parte de uma String                 |
| `replace()`           | Substitui ocorrências                      |
| `replaceFirst()`      | Substitui a primeira ocorrência            |
| `equals()`            | Compara o conteúdo de Strings              |
| `compareTo()`         | Compara Strings lexicograficamente         |
| `Random`              | Gera valores pseudoaleatórios              |
| `nextInt()`           | Gera números inteiros aleatórios           |
| `seed`                | Permite reproduzir uma sequência aleatória |
| `JOptionPane`         | Cria caixas de diálogo                     |
| `showInputDialog()`   | Solicita entrada do usuário                |
| `showMessageDialog()` | Exibe mensagens                            |

---

# 🧠 Resumo

Nesta aula foram estudadas algumas classes importantes da biblioteca padrão do Java.

### 📦 Pacotes

Organizam classes relacionadas:

```java
import java.util.Random;
```

### 🔤 String

Trabalha com textos:

```java
String nome = "Joao";
```

### 🎲 Random

Gera valores pseudoaleatórios:

```java
Random r = new Random();

int numero = r.nextInt(100);
```

### 🖥️ JOptionPane

Permite interação gráfica simples:

```java
String texto =
    JOptionPane.showInputDialog("Digite algo:");

JOptionPane.showMessageDialog(null, texto);
```

---

# 🔗 Documentação

### Java 17 — String

[Java Development Kit Version 17 API Specification — String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html)

### Java 17 — JOptionPane

[Java Development Kit Version 17 API Specification — JOptionPane](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/swing/JOptionPane.html)

---

# 🚀 Próximos estudos

Depois desta aula, é importante praticar principalmente:

* Criação e manipulação de `String`
* Índices de Strings
* `equals()` vs `==`
* Concatenação
* Geração de números aleatórios
* `Random` + intervalos
* Entrada de dados com `JOptionPane`
* Organização de classes utilizando pacotes
* Conceito de objetos e métodos
