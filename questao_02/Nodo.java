package questao_02;

public class Nodo {
    double dado;
    Nodo proximo;
    Nodo anterior;

    Nodo(double dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }

}
