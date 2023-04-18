import java.util.List;
import java.util.Scanner;

public class calculo {
    public static int somaDigitos(int numero){
        int soma = 0;
        while(numero>0){
            soma += numero % 10; //Realiza o somatório dos algarismos, a variável soma le-rá um dígito inserido pelo usuário dividindo por 10 e utilizando o resto da divisão e assim sucessivamente com outros algarismos do inteiro inserido
            numero /= 10;
        }
        return soma;
    } //Cria o método para realizar a soma dos algarismos

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor de S: ");
        int S = scanner.nextInt();
        if (S < 1 || S > 36){
            System.out.println("Erro. S deve ser maior ou igual a 1 e menor ou igual a 36");
        } //Lê o valor de S e verifica se está de acordo com as condições do If
        System.out.println("Insira o valor de A: ");
        int A = scanner.nextInt();
        if (A < 1 || A > 10000){
            System.out.println("Erro. A deve ser maior ou igual a 1 e menor ou igual a 10000");
        } //Lê o valor de A e verifica se está de acordo com as condições do If
        System.out.println("Insira o valor de B: ");
        int B = scanner.nextInt();
        if (B < 1 || B > 10000){
            System.out.println("Erro. B deve ser maior ou igual a 1 e menor ou igual a 10000");
        } //Lê o valor de B e verifica se está de acordo com as condições do If
        int qtd = 0;

        for(int i = A; i <= B; i++){
            if(somaDigitos(i) == S) {
                qtd++;
            } // Chama de volta o método criado acima para executar a soma dos algarismos que são iguais ao número S digitado pelo usuário
        }
        System.out.println(qtd);
    }
}