public class A02t03 {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Erro: informe dois valores.");
            return;
        }

        double valor1 = Double.parseDouble(args[0]);
        double valor2 = Double.parseDouble(args[1]);

        double resto = valor1 % valor2;
        double produto = valor1 * valor2;
        double media = (valor1 + valor2) / 2;

        System.out.println("Resto da divisão: " + resto);
        System.out.println("Produto: " + produto);
        System.out.println("Média: " + media);
    }
}

// Pablo Rodrigues Almeida