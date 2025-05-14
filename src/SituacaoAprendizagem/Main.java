package SituacaoAprendizagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Inicializa scanner
        Scanner sc = new Scanner(System.in);

        //Entrada de dados sobre os vendedores
        System.out.print("\nInforme o número de vendedores: ");
        int qntdVendedores = sc.nextInt();

        //Declaração do vetor
        String[] nomesVendedores = new String[qntdVendedores];
        Double[][] qntdVendas = new Double[qntdVendedores][5];
        Double[] somaVendas = new Double[qntdVendedores];

        // Laço de repetição para entrada de dados
        for (int i = 0; i < qntdVendedores; i++) {
            System.out.print("\nInforme o nome do vendedor " + (i + 1) + ": ");
            nomesVendedores[i] = sc.next();
            System.out.println("\nDigite o valor de vendas de " + nomesVendedores[i]);
            somaVendas[i] = 0.0;
            for (int j = 0; j < 5; j++) {
                System.out.print("Dia " + (j + 1) + ": ");
                qntdVendas[i][j] = sc.nextDouble();
                somaVendas[i] += qntdVendas[i][j];
            }
        }

        // Encontrar a vendedora com maior valor de vendas
        double maiorVenda = somaVendas[0];
        int indiceVendedor = 0;

        // Laço para encontrar melhor vendedora
        for (int j = 1; j < qntdVendedores; j++) {
            if (somaVendas[j] > maiorVenda) {
                maiorVenda = somaVendas[j];
                indiceVendedor = j;
            }
        }

        // Relatório inicio
        System.out.println("\n==================================================================");
        System.out.println("                RELATÓRIO DE VENDAS SEMANAIS");
        System.out.println("==================================================================");
        System.out.printf("| %-16s | %-13s | %-13s | %-8s%n", "Vendedor", "Total Vendido", "Classificação", "Bônus       |");
        System.out.println("+----------------------------------------------------------------+");

        // Laço de repetição para relatório
        for (int a = 0; a < qntdVendedores; a++) {
            if (somaVendas[a] >= 5000.0) {
                System.out.printf("| %-16s | R$ %10.2f | %-13s | R$ %8.2f |\n", nomesVendedores[a], somaVendas[a], "Excelente", somaVendas[a] * 0.1);
            } else if (somaVendas[a] > 3000.0 && somaVendas[a] < 4999.99) {
                System.out.printf("| %-16s | R$ %10.2f | %-13s | R$ %8.2f |\n", nomesVendedores[a], somaVendas[a], "Bom", somaVendas[a] * 0.05);
            } else {
                System.out.printf("| %-16s | R$ %10.2f | %-13s | R$ %8s |\n", nomesVendedores[a], somaVendas[a], "Regular", "0,00");
            }
        }

        // Relatório melhor vendedora
        System.out.println("+----------------------------------------------------------------+");
        System.out.println("MELHOR VENDEDOR DA SEMANA: " + nomesVendedores[indiceVendedor] + " (R$ " + maiorVenda + ")");
        System.out.println("==================================================================");
    }
}
