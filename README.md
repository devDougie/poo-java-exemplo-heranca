# Exemplo de Herança em Programação Orientada a Objetos (em Java)

Projeto Java simples com o objetivo de relembrar o conceito de **Herança** na Programação Orientada a Objetos (POO).

## Descrição

Este projeto demonstra como uma **superclasse** (`Carro`) pode ser estendida por **subclasses** que herdam seus atributos e métodos, podendo também sobrescrevê-los para adicionar comportamentos específicos.

### Classes incluídas:

- `Carro.java`: superclasse com atributos e métodos comuns a todos os carros.
- `CarroPopular.java`, `CarroEsportivo.java`, `CarroDeLuxo.java`: subclasses que herdam de `Carro` e implementam comportamentos específicos.
- `Teste.java`: classe principal que instancia objetos de cada tipo de carro e chama seus métodos.

O exemplo demonstra também a utilização de **sobrescrita de métodos** e a adição de métodos exclusivos em cada subclasse.

## Objetivo:

Este projeto foi criado para fins de estudo e revisão do conceito de herança em Java. Serve como um exemplo prático e simples de como subclasses podem herdar e sobrescrever métodos da superclasse.

## Como executar

1. Compile os arquivos:
   ```bash
   javac Carro.java CarroPopular.java CarroEsportivo.java CarroDeLuxo.java Teste.java

2. Execute a classe principal:
   ```bash
   javac Teste


