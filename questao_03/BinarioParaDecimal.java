package questao_03;

import java.util.Stack;

class BinarioParaDecimal {
    public static String decToBin(String data) {
        try {
            int decimal = Integer.parseInt(data);
            if (decimal == 0) {
                return "0";
            }

            Stack<Integer> pilhaBinaria = new Stack<>();

            while (decimal > 0) {
                pilhaBinaria.push(decimal % 2);
                decimal /= 2;
            }

            StringBuilder stringBinaria = new StringBuilder();
            while (!pilhaBinaria.isEmpty()) {
                stringBinaria.append(pilhaBinaria.pop());
            }

            return stringBinaria.toString();
        } catch (NumberFormatException e) {
            return "Número inválido";
        }
    }

    public static void main(String[] args) {
        String numeroDecimal = "10"; 
        String representacaoBinario = decToBin(numeroDecimal);
        System.out.println("Representação binária de " + numeroDecimal + ": " + representacaoBinario);
    }
}
