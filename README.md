
# **Resumo de Java**

## **Índice**

1. [Variáveis e Tipos](#1-variáveis-e-tipos)
2. [If e Else](#2-if-e-else)
3. [For e While](#3-for-e-while)
4. [Strings e Regex](#4-strings-e-regex)
5. [Data e Hora (API java.time)](#5-data-e-hora-api-javatime)
6. [Coleções e Streams](#6-coleções-e-streams)

---

##**1. Variáveis e Tipos**

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

## **Conclusão**

> Dominar Java é sobre **entender o raciocínio**, não decorar tudo.
> Pratique cada conceito em **mini projetos** (calculadora, agenda, lista de tarefas...).
> Quanto mais você pratica, mais natural o código fica! 🚀

---
