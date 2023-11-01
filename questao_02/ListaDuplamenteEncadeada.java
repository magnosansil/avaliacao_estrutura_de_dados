package questao_02;

public class ListaDuplamenteEncadeada {
    private Nodo topo;
    private Nodo inicio;

    public void adicionar(double dado) {
        Nodo novoNodo = new Nodo(dado);
        if (topo == null) {
            topo = novoNodo;
            inicio = novoNodo;
        } else {
            novoNodo.anterior = inicio;
            inicio.proximo = novoNodo;
            inicio = novoNodo;
        }
    }

    public void sort() {
        if (topo == null || topo.proximo == null) {
            return;
        }

        boolean trocou;
        do {
            Nodo atual = topo;
            Nodo anterior = null;
            Nodo proximo = topo.proximo;
            trocou = false;

            while (proximo != null) {
                if (atual.dado < proximo.dado) {
                    if (anterior != null) {
                        anterior.proximo = proximo;
                    } else {
                        topo = proximo;
                    }
                    atual.proximo = proximo.proximo;
                    proximo.proximo = atual;
                    proximo.anterior = anterior;
                    atual.anterior = proximo;

                    trocou = true;
                    anterior = proximo;
                    proximo = atual.proximo;
                } else {
                    anterior = atual;
                    atual = proximo;
                    proximo = proximo.proximo;
                }
            }
        } while (trocou);
    }

    public void imprimirLista() {
        Nodo atual = topo;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
