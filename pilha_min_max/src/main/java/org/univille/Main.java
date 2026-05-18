    package org.univille;
public class Main {

    public static void main(String[] args) {

        PilhaMinMax pilha = new PilhaMinMax();

        System.out.println("Inserindo elementos...");

        pilha.push(15);

        pilha.imprimirEstado();

        pilha.push(2);
        pilha.imprimirEstado();

        pilha.push(20);
        pilha.imprimirEstado();

        pilha.push(8);
        pilha.imprimirEstado();

        pilha.push(30);
        pilha.imprimirEstado();

        System.out.println("Removendo elementos...");

        pilha.pop();
        pilha.imprimirEstado();

        pilha.pop();
        pilha.imprimirEstado();

        pilha.pop();
        pilha.imprimirEstado();
    }
}

