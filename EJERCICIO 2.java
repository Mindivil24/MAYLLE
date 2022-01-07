public class matri {
    public static void main(String[] args) {
        int[][] matriz = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
