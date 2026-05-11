import javax.swing.JOptionPane;

public class A03ex03 {
    public static void main(String[] args) {
        String larguraStr = JOptionPane.showInputDialog(null, "Digite a largura da parede (em metros)",
                "Pablo Rodrigues Almeida", JOptionPane.INFORMATION_MESSAGE);
        double largura = Double.parseDouble(larguraStr);

        String alturaStr = JOptionPane.showInputDialog(null, "Digite a altura da parede (em metros)",
                "Pablo Rodrigues Almeida", JOptionPane.INFORMATION_MESSAGE);
        double altura = Double.parseDouble(alturaStr);

        double area = largura * altura;
        int tijolos = (int) (area * 20);

        String classificacao;
        if (area < 10) {
            classificacao = "Pequena";
        } else if (area < 50) {
            classificacao = "Média";
        } else {
            classificacao = "Grande";
        }

        JOptionPane.showMessageDialog(null,
                "Area da parede: " + area + " metros quadrados\nQuantidade de tijolos: " + tijolos + "\nClassificação: "
                        + classificacao,
                "Pablo Rodrigues Almeida", JOptionPane.INFORMATION_MESSAGE);
    }
}
