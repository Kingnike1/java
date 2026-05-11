import java.util.Scanner;

public class A04t01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro inicial: ");
        int num = sc.nextInt();

        System.out.print("Digite um número inteiro final: ");
        int num2 = sc.nextInt();

        while (num2 >= num) {
            System.out.println("valor de c=" + num2);
            num2--;
        }

        sc.close();
    }
}
// Pablo Rodrigues Almeida