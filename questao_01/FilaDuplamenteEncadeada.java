public class FilaDuplamenteEncadeada {
    private Nodo topo;
    private Nodo inicio;

    public void adicionar(int dado) {
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

    public void removeBase() {
        if (inicio != null) {
            if (topo == inicio) {
                topo = null;
                inicio = null;
            } else {
                inicio = inicio.anterior;
                inicio.proximo = null;
            }
        }
    }

    public static void imprimirFila(FilaDuplamenteEncadeada fila) {
        Nodo atual = fila.topo;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
