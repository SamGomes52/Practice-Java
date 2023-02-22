package com.projeto.pilha;

/**
 * Pilha LIFO: Last In, First Out
 */
public class Pilha {
    private No referenciaNoEntradaPilha;

    public Pilha() {
        this.referenciaNoEntradaPilha = null;
    }

    public boolean isEmpty() {
        return referenciaNoEntradaPilha == null? true : false;
    }

    public No top() {
        return referenciaNoEntradaPilha;
    }

    public void push(No novoNo) {
        No auxiliar = referenciaNoEntradaPilha;
        referenciaNoEntradaPilha = novoNo;
        referenciaNoEntradaPilha.setReferenciaNo(auxiliar);
    }

    public No pop() {
        if(!this.isEmpty()) {
            No removido = referenciaNoEntradaPilha;
            referenciaNoEntradaPilha = removido.getReferenciaNo();
            removido.setReferenciaNo(null);
            return removido;
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "-----------------\n" +
                "       Pilha\n" +
                "-----------------\n";

        No noAuxiliar = referenciaNoEntradaPilha;

        while(true) {
            if(noAuxiliar != null) {
                stringRetorno += "[No {dado= " + noAuxiliar.getDado() + " }]\n";
                noAuxiliar = noAuxiliar.getReferenciaNo();
            }
            else {
                break;
            }
        }

        stringRetorno += "-----------------\n";

        return stringRetorno;
    }
}
