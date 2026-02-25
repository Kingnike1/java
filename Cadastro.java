import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        String email;
        String senha;

        // 🔹 NOME
        while (true) {
            System.out.print("Digite seu nome completo: ");
            nome = scanner.nextLine();

            if (nome.matches("[a-zA-ZÀ-ÿ ]{3,}")) {
                break;
            } else {
                System.out.println("Nome inválido! Use apenas letras e no mínimo 3 caracteres.");
            }
        }

        // 🔹 IDADE
        while (true) {
            System.out.print("Digite sua idade: ");

            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();

                if (idade >= 0 && idade <= 120) {
                    break;
                } else {
                    System.out.println("Idade inválida!");
                }
            } else {
                System.out.println("Digite apenas números!");
                scanner.next(); // limpa entrada inválida
            }
        }

        scanner.nextLine(); // limpa ENTER

        // 🔹 EMAIL
        while (true) {
            System.out.print("Digite seu email: ");
            email = scanner.nextLine();

            if (email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
                break;
            } else {
                System.out.println("Email inválido!");
            }
        }

        // 🔹 SENHA
        while (true) {
            System.out.print("Digite sua senha (mínimo 6 caracteres): ");
            senha = scanner.nextLine();

            if (senha.length() >= 6) {
                break;
            } else {
                System.out.println("Senha muito curta!");
            }
        }

        // ✅ RESULTADO FINAL
        System.out.println("\n--- CADASTRO REALIZADO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + "*".repeat(senha.length()));

        scanner.close();
    }
}