import java.util.Scanner;

public class A03ex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura da sua casa em metros:");
        double altura = scanner.nextDouble();

        System.out.println("Digite a largura da sua casa em metros:");
        double largura = scanner.nextDouble();

        System.out.println("A área da sua casa é: " + (altura * largura) + " metros quadrados.");

        int tijolos = (int) (altura * largura * 20);
        System.out.println("A quantidade de tijolos da sua casa é: " + tijolos + " total de tijolos.");


        scanner.close();


    }
}
