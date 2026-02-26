import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double altura;

        // VALIDAÇÃO DO NOME
        while (true) {
            System.out.print("Digite seu nickname: ");
            nome = scanner.nextLine();

            // verifica se contém apenas letras e espaço
            if (nome.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Nome inválido! Digite apenas letras.");
            }
        }

        // VALIDAÇÃO DA IDADE
        while (true) {
            System.out.print("Digite sua idade: ");

            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                break;
            } else {
                System.out.println("Idade inválida! Digite apenas números.");
                scanner.next(); // limpa o erro
            }
        }
        // VALIDAÇÃO DA ALTURA
        while (true) {
            System.out.print("Digite sua altura (em metros): ");

            if (scanner.hasNextDouble()) {
                altura = scanner.nextDouble();
                break;
            } else {
                System.out.println("Altura inválida! Digite um número decimal.");
                scanner.next(); // limpa o erro
            }
        }
        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos e sua altura é " + altura + " metros.");

        scanner.close();
    }
}
