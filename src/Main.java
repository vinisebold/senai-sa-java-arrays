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

        for (int i = 0; i < qntdVendedores; i++) {
            System.out.print("\nInforme o nome do vendedor " + (i + 1) + ": ");
            nomesVendedores[i] = sc.next();
            System.out.println("\nDigite o valor de vendas de " + nomesVendedores[i]);
            for (int j = 0; j < 5; j++) {
                System.out.print("Dia " + (j + 1) + ": ");
                qntdVendas[i][j] = sc.nextDouble();
            }
        }
    }
}