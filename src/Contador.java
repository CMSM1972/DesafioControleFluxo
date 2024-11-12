import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        try (terminal) {
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();
            // Verifica se o primeiro parâmetro é maior que o segundo
            if (parametroUm > parametroDois) {
                throw new parametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }
            contar(parametroUm, parametroDois);
        } catch (parametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) {
        // Contagem de parametroUm até parametroDois
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

