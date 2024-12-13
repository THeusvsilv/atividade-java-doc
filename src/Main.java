import classes.Media;

/**
 * Classe Main
 * classe principal do programa
 *
 * @author THeusvsilv
 * @version 1.0
 * @since 2024
 */
public class Main {

    /**
     * Método de teste da classe 'Media'
     * Realiza o cálculo da média e verifica se o aluno foi aprovado
     */
    private static void testMedia() {
        Media media = new Media();
        double n1 = 7.0;
        double n2 = 8.0;
        double n3 = 6.0;
        double n4 = 9.0;
        double mediaCalculada = media.calcularMedia(n1, n2, n3, n4);
        boolean aprovado = media.verificarAprovacao(mediaCalculada);
        System.out.println("Média: " + mediaCalculada);
        System.out.println("Aprovado: " + aprovado);
    }

    /**
     * Método principal
     *
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {
        testMedia();
    }
}
