import java.util.Scanner;

public class A04t03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = sc.nextLine();

        String palavraVocal = palavra.replaceAll("[AEIOUaeiou]", "");

        System.out.println("A palavra digitada foi: " + palavra);
        System.out.println("A palavra sem vogais foi: " + palavraVocal);
        sc.close();
    }
}

// Pablo Rodrigues Almeida