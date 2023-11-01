package questao_02;

class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.adicionar(5.3);
        lista.adicionar(2.1);
        lista.adicionar(8);
        lista.adicionar(1.6);

        System.out.println("Lista não ordenada:");
        lista.imprimirLista();

        lista.sort();

        System.out.println("Lista ordenada de forma decrescente:");
        lista.imprimirLista();
    }
}