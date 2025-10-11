import java.util.Random;

public class Main {
    private static final int minI = 2;
    private static final int maxI = 22;

    private static final float minX = -7.0f;
    private static final float maxX = 5.0f;

    private static final int rowW = 11;
    private static final int columnsW = 14;

    public static void main(String[] args) {
        int[] I = new int[(maxI - minI) / 2 + 1];
        I = arrayI(I, minI, maxI);
        printArrayI(I);

        float[] X = new float[(14)];
        X = arrayX(X, minX, maxX);
        printArrayX(X);

        double[][] W = new double[rowW][columnsW];
        W = arrayW(W, I, X);
        printArrayW(W);


    }


    private static int[] arrayI(int arrI[], int minI, int maxI) {
        int i1 = 0;
        for (int valueI = maxI; valueI >= minI; valueI--) {
            if (valueI % 2 == 0) {
                arrI[i1] = valueI;
                i1++;
            }

        }
        return arrI;
    }

    private static void printArrayI(int arrayI[]) {
        System.out.println("First array: ");
        for (int value1 : arrayI) {
            System.out.printf(value1 + " ");
        }
        System.out.println();
    }

    private static float[] arrayX(float arrX[], float minX, float maxX) {
        Random rd = new Random();
        for (int i2 = 0; i2 < 14; i2++) {
            arrX[i2] = minX + rd.nextFloat() * (maxX - minX);
        }
        return arrX;
    }

    private static void printArrayX(float arrayX[]) {
        System.out.println("Second array: ");
        for (float value2 : arrayX) {
            System.out.format("%.2f ", value2);
        }
        System.out.println();
    }


    private static double[][] arrayW(double[][] arrW, int I[], float X[]) {
        for (int i = 0; i < rowW; i++) {
            for (int j = 0; j < columnsW; j++) {
                double x1 = X[j];
                switch (I[i]) {
                    case 16:
                        arrW[i][j] = Math.pow((2 * Math.pow(Math.E, Math.log(Math.abs(x1)))), (Math.pow(Math.E, Math.pow((4 / x1), x1))));
                        break;
                    case 6, 8, 10, 12, 18:
                        arrW[i][j] = (Math.cos(Math.PI / x1)) / (2);
                        break;
                    default:
                        arrW[i][j] = Math.pow(Math.pow(Math.E, Math.pow(Math.E, Math.log(Math.abs(x1)))), 1 / 3);
                        break;
                }


            }
        }
        return arrW;
    }

    private static void printArrayW(double[][] arrW) {
        System.out.println("Third array: ");
        for (double[] w_i : arrW) {
            for (double w_j : w_i) {
                System.out.format(" %.2f ", w_j);
            }
            System.out.println();
        }
    }

}
