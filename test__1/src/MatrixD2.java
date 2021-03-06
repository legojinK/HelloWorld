public class MatrixD2 {

    final int RANGE = 10;
    final int DIM = 2;

    private int[][] mat;

    public void initMatrix () {
        mat = new int[DIM][DIM];

        System.out.println("행렬 생성");

        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                mat[i][j] = (int) (Math.random() * RANGE);
            }
        }
    }

    public void printMatrix () {

        for (int i = 0; i < DIM; i++) {

            for (int j = 0; j < DIM; j++) {
                System.out.printf("%3d", mat[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}

