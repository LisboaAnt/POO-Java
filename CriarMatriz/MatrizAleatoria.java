
package robopolis;
import java.util.Random;

public class MatrizAleatoria {
    private int[][] matriz;
    private Random random;

    public MatrizAleatoria() {
        matriz = new int[10][10];
        random = new Random();
    }

    public int[][] criarMatrizAleatoria() {
        // Preenche a matriz com 20 valores 1
        for (int i = 0; i < 20; i++) {
            int x;
            int y;
            do {
                x = random.nextInt(10);
                y = random.nextInt(10);
            } while (matriz[x][y] != 0);
            matriz[x][y] = 1;
        }

        // Preenche a matriz com 5 valores -1
        for (int i = 0; i < 5; i++) {
            int x;
            int y;
            do {
                x = random.nextInt(10);
                y = random.nextInt(10);
            } while (matriz[x][y] != 0);
            matriz[x][y] = -1;
        }

        return matriz;
    }

    public void exibirMatriz() {
        // Exibe a matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}