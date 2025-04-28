import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicializa scanner
        Scanner sc = new Scanner(System.in);

        //Entrada de dados sobre os vendedores
        System.out.println("Qual o número de vendedores?");
        int qntdVendedores = sc.nextInt();

        //Declaração do vetor
        String[] nomesVendedores = new String[qntdVendedores];

        for (int i = 0; i < qntdVendedores; i++) {
            System.out.println("Qual o nome do vendedor " + (i + 1));
            nomesVendedores[i] = sc.next();
        }
        for (int j = 0; j < nomesVendedores.length; j++) {
            System.out.println("Nome[" + (j + 1) + "] " + nomesVendedores[j]);
        }
    }
}
