package classes;

/**
 * Classe Média
 * classe responsável por calcular a média e verificar a aprovação de um aluno
 */
public class Media {

    /**
     * Método calcular Media - recebe 4 notas e calcula a média
     * @param n1 double - 1ª nota
     * @param n2 double - 2ª nota
     * @param n3 double - 3ª nota
     * @param n4 double - 4ª nota
     * @return double - média
     */
    public double calcularMedia(double n1, double n2, double n3, double n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }

    /**
     * Método verificarAprovacao - verifica se a média é maior ou igual a 6
     * @param media double - média
     * @return boolean - true se a média for maior ou igual a 6, false caso contrário
     */
    public boolean verificarAprovacao(double media) {
        return media >= 6;
    }
}
