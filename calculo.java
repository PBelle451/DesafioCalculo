import java.util.List;
import java.util.Scanner;

public class calculo {
    public static int somaDigitos(int numero){
        int soma = 0;
        while(numero>0){
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor de S: ");
        int S = scanner.nextInt();
        if (S < 1 || S > 36){
            System.out.println("Erro. S deve ser maior ou igual a 1 e menor ou igual a 36");
        }
        System.out.println("Insira o valor de A: ");
        int A = scanner.nextInt();
        if (A < 1 || A > 10000){
            System.out.println("Erro. A deve ser maior ou igual a 1 e menor ou igual a 10000");
        }
        System.out.println("Insira o valor de B: ");
        int B = scanner.nextInt();
        if (B < 1 || B > 10000){
            System.out.println("Erro. B deve ser maior ou igual a 1 e menor ou igual a 10000");
        }
        int qtd = 0;

        for(int i = A; i <= B; i++){
            if(somaDigitos(i) == S) {
                qtd++;
            }
        }
        System.out.println(qtd);
    }
}
