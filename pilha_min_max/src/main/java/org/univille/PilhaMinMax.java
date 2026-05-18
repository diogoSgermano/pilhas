package org.univille;
import java.util.Stack;

public class PilhaMinMax {

    private Stack<Integer> pilha;
    private Stack<Integer> pilhaMin;
    private Stack<Integer> pilhaMax;

    public PilhaMinMax() {

        pilha = new Stack<>();
        pilhaMin = new Stack<>();
        pilhaMax = new Stack<>();
    }

    public void push(int valor) {

        pilha.push(valor);

        if (pilhaMin.isEmpty() || valor <= pilhaMin.peek()) {
            pilhaMin.push(valor);
        }

        if (pilhaMax.isEmpty() || valor >= pilhaMax.peek()) {
            pilhaMax.push(valor);
        }
    }

    public int pop() {

        if (pilha.isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }

        int removido = pilha.pop();

        if (removido == pilhaMin.peek()) {
            pilhaMin.pop();
        }

        if (removido == pilhaMax.peek()) {
            pilhaMax.pop();
        }

        return removido;
    }

    public int min() {

        if (pilhaMin.isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }

        return pilhaMin.peek();
    }

    public int max() {

        if (pilhaMax.isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }

        return pilhaMax.peek();
    }

    public void imprimirEstado() {

        System.out.println("Pilha: " + pilha);

        if (!pilha.isEmpty()) {
            System.out.println("Min: " + min());
            System.out.println("Max: " + max());
        }

        System.out.println("============================");
    }
}