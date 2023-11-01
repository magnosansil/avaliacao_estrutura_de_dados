class Main {
    public static void main(String[] args) {
        FilaDuplamenteEncadeada fila = new FilaDuplamenteEncadeada();
        fila.adicionar(1);
        fila.adicionar(2);
        fila.adicionar(3);

        System.out.println("Elementos da fila após adição:");
        FilaDuplamenteEncadeada.imprimirFila(fila);

        fila.removeBase(); 
        System.out.println("Elementos da fila após a primeira remoção:");
        FilaDuplamenteEncadeada.imprimirFila(fila);

        fila.removeBase();
        System.out.println("Elementos da fila após a segunda remoção:");
        FilaDuplamenteEncadeada.imprimirFila(fila);
    }

    
}
