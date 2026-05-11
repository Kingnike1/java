import java.util.Scanner;
import java.text.DecimalFormat;

public class A04t02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        System.out.println("Digite um número:");
        int num2 = sc.nextInt();

        System.out.println("Digite qual das operacoes que vc deseja fazer:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.println("5 - Resto da Divisao");
        System.out.println("6 - Potencia");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Soma: " + df.format(num + num2));
                break;
            case 2:
                System.out.println("Subtracao: " + df.format(num - num2));
                break;
            case 3:
                System.out.println("Multiplicacao: " + df.format(num * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Divisao: " + df.format((double) num / num2));
                } else {
                    System.out.println("Erro: Divisao por zero nao e permitida.");
                }
                break;
            case 5:
                if (num2 != 0) {
                    System.out.println("Resto da Divisao: " + df.format((double) (num % num2)));
                } else {
                    System.out.println("Erro: Divisao por zero nao e permitida.");
                }
                break;
            case 6:
                System.out.println("Potencia: " + df.format(Math.pow(num, num2)));
                break;
            default:
                System.out.println("Opcao invalida.");
        }

        sc.close();
    }
}

// Pablo Rodrigues Almeida