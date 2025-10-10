
# **Resumo de Java**

## **Índice**

1. [Variáveis e Tipos](#1-variáveis-e-tipos)
2. [If e Else](#2-if-e-else)
3. [For e While](#3-for-e-while)
4. [Strings e Regex](#4-strings-e-regex)
5. [Data e Hora (API java.time)](#5-data-e-hora-api-javatime)
6. [Coleções e Streams](#6-coleções-e-streams)
7. [POO: Herança, Polimorfismo, Encapsulamento, Classes Abstratas e Interfaces](#7-poo-herança-polimorfismo-encapsulamento-classes-abstratas-e-interfaces)
8. [Packages e Imports](#8-packages-e-imports)
9. [Exceções (try, catch, throw, throws e finally)](#9-exceções-try-catch-throw-throws-e-finally)

---

## **1. Variáveis e Tipos**

### O que são 

Variáveis são **espaços na memória** para guardar valores.
Em Java, cada variável precisa ter um **tipo** definido.

### Tipos primitivos

| Tipo                             | Descrição                              | Exemplo                      |
| -------------------------------- | -------------------------------------- | ---------------------------- |
| `int`                            | número inteiro                         | `int idade = 25;`            |
| `double`                         | número decimal (com ponto)             | `double salario = 3500.75;`  |
| `boolean`                        | verdadeiro/falso                       | `boolean ativo = true;`      |
| `char`                           | um caractere                           | `char letra = 'A';`          |
| `byte`, `short`, `long`, `float` | variações para números menores/maiores | `long populacao = 8000000L;` |

### Tipos não primitivos (objetos)

| Tipo                           | Descrição                             | Exemplo                  |
| ------------------------------ | ------------------------------------- | ------------------------ |
| `String`                       | texto                                 | `String nome = "Maria";` |
| `Integer`, `Double`, `Boolean` | versões “objeto” dos tipos primitivos | `Integer idade = 30;`    |

### Dica:

> Sempre prefira tipos simples no começo (`int`, `double`, `boolean`).
> Use `var` (desde Java 10) para deixar o compilador descobrir o tipo:
>
> ```java
> var nome = "João";
> var idade = 20;
> ```
---

## **2. If e Else**

### Estrutura básica

```java
if (condicao) {
    // faz algo se for verdadeiro
} else {
    // faz algo se for falso
}
```

### Exemplo

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

### If encadeado

```java
if (nota >= 9) {
    System.out.println("Excelente!");
} else if (nota >= 6) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}
```

 **Operador ternário**:

```java
String resultado = (idade >= 18) ? "Adulto" : "Menor";
```

---

## **3. For e While**

### For tradicional

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Número: " + i);
}
```

### For aprimorado (for-each)

```java
String[] nomes = {"Ana", "João", "Maria"};
for (String nome : nomes) {
    System.out.println(nome);
}
```

### While

```java
int contador = 0;
while (contador < 3) {
    System.out.println("Contando: " + contador);
    contador++;
}
```

### Do-While

Executa **pelo menos uma vez**:

```java
int numero = 0;
do {
    System.out.println("Número: " + numero);
    numero++;
} while (numero < 3);
```

---

## **4. Strings e Regex**

### Trabalhando com Strings

Strings são **objetos imutáveis** (não mudam depois de criadas).

```java
String nome = "Java";
System.out.println(nome.length()); // 4
System.out.println(nome.toUpperCase()); // JAVA
System.out.println(nome.toLowerCase()); // java
System.out.println(nome.charAt(1)); // a
System.out.println(nome.equals("Java")); // true
```

### Comparações

* `==` compara **endereços na memória** (evite!)
* `.equals()` compara **valores**

```java
String a = "Oi";
String b = new String("Oi");
System.out.println(a == b);      // false
System.out.println(a.equals(b)); // true
```

### Regex (Expressões Regulares)

Regex é usado pra **buscar padrões** em textos.

```java
String email = "teste@gmail.com";
boolean valido = email.matches("^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$");
System.out.println(valido); // true
```

Exemplos de regex úteis:

| Padrão                 | Descrição                    |
| ---------------------- | ---------------------------- |
| `[0-9]+`               | apenas números               |
| `[A-Za-z]+`            | apenas letras                |
| `\\d{2}/\\d{2}/\\d{4}` | formato de data (dd/mm/aaaa) |

---

## **5. Data e Hora (API java.time)**

Desde o Java 8, usamos o pacote **`java.time`** — moderno e fácil de usar.

```java
import java.time.*;

LocalDate hoje = LocalDate.now();
LocalTime agora = LocalTime.now();
LocalDateTime momento = LocalDateTime.now();

System.out.println(hoje); // 2025-10-06
System.out.println(agora); // 14:35:22
```

### Criar datas específicas

```java
LocalDate data = LocalDate.of(2025, 12, 25);
```

### Adicionar ou subtrair tempo

```java
LocalDate amanha = hoje.plusDays(1);
LocalDate semanaPassada = hoje.minusWeeks(1);
```

### Formatar datas

```java
import java.time.format.DateTimeFormatter;

DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
System.out.println(hoje.format(fmt)); // 06/10/2025
```

---

##  **6. Coleções e Streams**

### List (lista ordenada)

```java
import java.util.*;

List<String> nomes = new ArrayList<>();
nomes.add("Ana");
nomes.add("João");
nomes.add("Maria");

System.out.println(nomes.get(1)); // João
System.out.println(nomes.size()); // 3
```

### Set (sem elementos repetidos)

```java
Set<Integer> numeros = new HashSet<>();
numeros.add(10);
numeros.add(20);
numeros.add(10); // Ignorado
System.out.println(numeros); // [10, 20]
```

### Map (chave → valor)

```java
Map<String, Integer> idades = new HashMap<>();
idades.put("Ana", 20);
idades.put("João", 25);
System.out.println(idades.get("João")); // 25
```

---

###  Streams (maneira moderna de trabalhar com coleções)

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

numeros.stream()
    .filter(n -> n % 2 == 0) // mantém apenas pares
    .map(n -> n * 10)        // multiplica por 10
    .forEach(System.out::println);
```

Saída:

```
20
40
```

 Streams servem pra **filtrar, mapear e transformar listas** de forma rápida e funcional.

---
Perfeito 👍
Aqui está seu **README.md atualizado**, combinando o conteúdo que você já tinha com a nova seção sobre **Herança, Polimorfismo, Encapsulamento, Classes Abstratas e Interfaces** — seguindo o mesmo estilo e formatação (títulos, exemplos e blocos de código em Java):

---

## **7. POO: Herança, Polimorfismo, Encapsulamento, Classes Abstratas e Interfaces**

### **Herança**

A **herança** permite que uma classe (filha) **herde atributos e métodos** de outra (pai).
Evita repetição de código e facilita a manutenção.

```java
class Animal {
    void emitirSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    void emitirSom() {
        System.out.println("Au au!");
    }
}
```

> `Cachorro` herda de `Animal`, mas redefine o método `emitirSom()`.

---

### **Polimorfismo**

O **polimorfismo** permite que um mesmo método tenha **diferentes comportamentos** dependendo do objeto que o executa.

```java
Animal a1 = new Cachorro();
Animal a2 = new Gato();

a1.emitirSom(); // Au au!
a2.emitirSom(); // Miau!
```

> O método chamado depende do **tipo real** do objeto, não apenas do tipo da variável.

---

### **Encapsulamento**

O **encapsulamento** protege os dados internos da classe, controlando o acesso com **getters e setters**.

```java
class Pessoa {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
```

> O atributo `nome` é privado e só pode ser acessado de forma controlada.

---

### **Classes Abstratas**

Uma **classe abstrata** serve como **modelo base** para outras classes.
Ela **não pode ser instanciada** e pode ter **métodos abstratos**, que **devem ser implementados** pelas subclasses.

```java
abstract class Forma {
    abstract double calcularArea();
}

class Quadrado extends Forma {
    double lado;
    Quadrado(double lado) { this.lado = lado; }

    double calcularArea() {
        return lado * lado;
    }
}
```

> `Forma` define o contrato, e `Quadrado` implementa o comportamento.

---

### **Interface**

Uma **interface** define um **conjunto de métodos obrigatórios**, sem implementação.
Classes que a implementam **devem fornecer o comportamento**.

```java
interface Imprimivel {
    void imprimir();
}

class Relatorio implements Imprimivel {
    public void imprimir() {
        System.out.println("Imprimindo relatório...");
    }
}
```

> Interfaces são ideais quando várias classes precisam **seguir o mesmo padrão de comportamento**.

---

### **Resumo Geral**

| Conceito            | O que é                                 | Palavra-chave | Exemplo                   |
| ------------------- | --------------------------------------- | ------------- | ------------------------- |
| **Herança**         | Reaproveita código de outra classe      | `extends`     | `class Filho extends Pai` |
| **Polimorfismo**    | Mesmo método, comportamentos diferentes | `@Override`   | `a.emitirSom()`           |
| **Encapsulamento**  | Protege dados internos                  | `private`     | `getNome()`               |
| **Classe Abstrata** | Modelo com métodos obrigatórios         | `abstract`    | `abstract class Forma`    |
| **Interface**       | Contrato de métodos sem implementação   | `implements`  | `implements Imprimivel`   |

---


## **8. Packages e Imports**

### **O que são Packages**

Um **package** (pacote) serve para **organizar classes e arquivos** em grupos lógicos.
Funciona como uma **pasta** dentro do projeto Java.

* Evita conflitos de nomes
* Facilita manutenção e modularização
* É declarado no topo do arquivo Java

Estrutura de pastas:

```
src/
 ├── br/
 │   └── com/
 │       └── exemplo/
 │           ├── modelo/
 │           │   └── Pessoa.java
 │           └── app/
 │               └── Main.java
```

#### `Pessoa.java`

```java
package br.com.exemplo.modelo;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
```

#### `Main.java`

```java
package br.com.exemplo.app;

import br.com.exemplo.modelo.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria");
        p1.apresentar();
    }
}
```

**Saída:**

```
Olá, meu nome é Maria
```

---

### **Imports**

O `import` traz classes externas (de outros pacotes ou bibliotecas) para o arquivo atual.

```java
import java.util.List;
import java.util.ArrayList;

public class ExemploImport {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("João");
        System.out.println(nomes);
    }
}
```

> Também é possível importar tudo de um pacote:
>
> ```java
> import java.util.*;
> ```
>
> ⚠ Mas prefira importar apenas o necessário.

---

### **Regras Importantes**

* O nome do package deve refletir a **estrutura de pastas**.
* O nome do arquivo `.java` deve ser igual ao nome da **classe pública**.
* O **Java importa automaticamente** o pacote `java.lang` (ex: `String`, `Math`, `System`).

---

### **Resumo Rápido**

| Conceito       | Descrição                        | Exemplo                          |
| -------------- | -------------------------------- | -------------------------------- |
| **package**    | Organização de classes           | `package br.com.projeto.modelo;` |
| **import**     | Traz classes externas            | `import java.util.List;`         |
| **estrutura**  | Pastas → pacotes                 | `src/br/com/app/Main.java`       |
| **automático** | `java.lang.*` é sempre importado | `String nome = "João";`          |

---

> **Dica:** mantenha pacotes organizados (`br.com.empresa.projeto`) e classes separadas — isso facilita o crescimento do projeto e o trabalho em equipe.

---
Perfeito 👍 — entendido.
A partir de agora os **títulos virão sem emojis**, mantendo o mesmo formato limpo do seu README.

Aqui está a **versão ajustada da seção 9 (sem emojis nos títulos)** — pronta pra você colar direto:

---

## **9. Exceções (try, catch, throw, throws e finally)**

### O que são Exceções

**Exceções** são erros que ocorrem **em tempo de execução** e podem ser **tratados** para evitar que o programa pare.
Elas ajudam a controlar falhas, como divisão por zero, índices inválidos ou arquivos inexistentes.

---

### Blocos try e catch

O bloco `try` contém o código que pode gerar erro.
O bloco `catch` captura e trata a exceção.

```java
try {
    int resultado = 10 / 0;
    System.out.println(resultado);
} catch (ArithmeticException e) {
    System.out.println("Erro: divisão por zero!");
}
```

**Saída:**

```
Erro: divisão por zero!
```

---

### Bloco finally

O bloco `finally` **sempre é executado**, mesmo se ocorrer uma exceção.
É usado para **fechar arquivos, conexões ou liberar recursos**.

```java
try {
    int[] numeros = {1, 2, 3};
    System.out.println(numeros[5]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Índice inválido!");
} finally {
    System.out.println("Encerrando execução...");
}
```

**Saída:**

```
Índice inválido!
Encerrando execução...
```

---

### Lançando Exceções (throw)

Você pode **lançar exceções manualmente** com `throw`.

```java
public class Validador {
    public static void validarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade mínima é 18 anos!");
        }
        System.out.println("Idade válida!");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Validador.validarIdade(16);
    }
}
```

**Saída:**

```
Exception in thread "main" java.lang.IllegalArgumentException: Idade mínima é 18 anos!
```

---

### Declarando Exceções (throws)

Se um método **pode gerar uma exceção**, declare isso com `throws`.
Quem chamar o método decide se vai tratar ou não.

```java
import java.io.*;

public class Arquivo {
    public static void abrirArquivo(String nome) throws IOException {
        FileReader fr = new FileReader(nome);
        fr.close();
    }

    public static void main(String[] args) {
        try {
            abrirArquivo("teste.txt");
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado!");
        }
    }
}
```

---

### Tipos de Exceções

| Tipo             | Descrição                                                                    | Exemplo                                   |
| ---------------- | ---------------------------------------------------------------------------- | ----------------------------------------- |
| **Checked**      | Devem ser tratadas ou declaradas (`IOException`, `SQLException`)             | Leitura de arquivo                        |
| **Unchecked**    | Ocorrem em tempo de execução (`NullPointerException`, `ArithmeticException`) | Divisão por zero                          |
| **Customizadas** | Criadas pelo programador                                                     | `class MinhaExcecao extends Exception {}` |

---

### Criando Exceções Personalizadas

```java
class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String msg) {
        super(msg);
    }
}

public class Teste {
    public static void main(String[] args) {
        try {
            validar(15);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void validar(int idade) throws IdadeInvalidaException {
        if (idade < 18) throw new IdadeInvalidaException("Menor de idade não permitido!");
    }
}
```

**Saída:**

```
Erro: Menor de idade não permitido!
```

---

### Resumo Rápido

| Palavra-chave | Função                                   | Exemplo                         |
| ------------- | ---------------------------------------- | ------------------------------- |
| `try`         | Bloco que pode gerar erro                | `try { ... }`                   |
| `catch`       | Captura e trata o erro                   | `catch (Exception e)`           |
| `finally`     | Sempre executa, com ou sem erro          | `finally { ... }`               |
| `throw`       | Lança exceção manualmente                | `throw new Exception("Erro!")`  |
| `throws`      | Declara que o método pode lançar exceção | `void ler() throws IOException` |

---

### Exemplo completo

```java
public class ExemploExcecoes {
    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Finalizando o programa...");
        }
    }

    static int dividir(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divisão por zero não permitida!");
        return a / b;
    }
}
```

**Saída:**

```
Erro: Divisão por zero não permitida!
Finalizando o programa...
```

---
