# LAB-BANCO-DIGITAL-ONE

Este repositório contém a entrega do projeto desenvolvido durante as aulas da [Digital Innovation One (DIO)](https://www.dio.me/). O objetivo do projeto foi implementar um sistema bancário simples utilizando os conceitos de **Programação Orientada a Objetos (POO)** em Java.

## Conceitos de Programação Orientada a Objetos Utilizados

1. **Encapsulamento**:
    - Os atributos das classes, como `Cliente`, `Conta` e `Banco`, foram definidos como `private` ou `protected`, garantindo que seu acesso seja controlado por métodos públicos (`getters` e `setters`).
    - Isso protege os dados e permite maior controle sobre como eles são manipulados.

2. **Herança**:
    - A classe `Conta` foi definida como uma classe abstrata, sendo a base para as classes `ContaCorrente` e `ContaPoupanca`. Ambas herdam os atributos e métodos comuns da classe `Conta`, reutilizando código e promovendo a organização.

3. **Polimorfismo**:
    - A interface `IConta` define métodos que são implementados pelas classes concretas `ContaCorrente` e `ContaPoupanca`. Isso permite que diferentes tipos de contas sejam manipulados de forma uniforme.

4. **Abstração**:
    - A classe `Conta` abstrai o conceito de uma conta bancária, enquanto as classes `ContaCorrente` e `ContaPoupanca` implementam comportamentos específicos para cada tipo de conta.

## Implementação da Classe Banco

O desafio proposto incluiu a implementação da classe `Banco`, que gerencia as contas bancárias. A classe `Banco` foi projetada para:

- Armazenar um conjunto de contas (`Set<Conta>`), garantindo que não haja duplicatas.
- Criar contas correntes e poupanças para os clientes, utilizando os métodos `CriarCorrente` e `CriarPoupanca`.
- Permitir a remoção de contas com o método `apagarConta`.

Essa implementação centraliza a lógica de gerenciamento de contas, promovendo a coesão e facilitando a manutenção do código.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

```tree
src/
├── Main.java
├── banco/
│   ├── Banco.java
│   ├── cliente/
│   │   └── Cliente.java
│   └── conta/
│       ├── Conta.java
│       ├── ContaCorrente.java
│       ├── ContaPoupanca.java
│       └── IConta.java
```

## Como Executar

1. Clone este repositório:

    ```bash
    git clone https://github.com/seu-usuario/lab-banco-digital-one.git
    ```

2. Importe o projeto em sua IDE de preferência.
3. Compile e execute a classe `Main` para testar as funcionalidades do sistema bancário.

## Funcionalidades Implementadas

- Criação de contas correntes e poupanças.
- Depósito, saque e transferência entre contas.
- Impressão de extratos para cada tipo de conta.

Sinta-se à vontade para explorar e modificar o código para aprimorar suas habilidades em Java e POO!
