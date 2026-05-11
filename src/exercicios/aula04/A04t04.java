import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class A04t04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String[]> dicionario = new HashMap<>();
        dicionario.put("Qual o seu prato preferido?", new String[] { "lasanha", "pizza", "churrasco" });
        dicionario.put("Qual sua cor favorita?", new String[] { "azul", "verde", "preto" });
        dicionario.put("O que você gosta de fazer no tempo livre?", new String[] { "ler", "viajar", "dormir" });

        Map<String, String> respostasSucesso = new HashMap<>();
        respostasSucesso.put("Qual o seu prato preferido?", "Eu adoro esse prato!");
        respostasSucesso.put("Qual sua cor favorita?", "Essa cor é muito elegante!");
        respostasSucesso.put("O que você gosta de fazer no tempo livre?", "Isso parece muito relaxante!");
        for (String pergunta : dicionario.keySet()) {
            System.out.println(pergunta);
            String respostaUsuario = scanner.nextLine().toLowerCase();

            boolean encontrou = false;
            for (String palavraChave : dicionario.get(pergunta)) {
                if (respostaUsuario.contains(palavraChave)) {
                    encontrou = true;
                    break;
                }
            }

            if (encontrou) {
                System.out.println(respostasSucesso.get(pergunta));
            } else {
                System.out.println("Disso eu não gosto muito!");
            }
        }

        scanner.close();
    }
}

// Pablo Rodrigues Almeida