package co.g2academy.array;

public class ArrayTwoDimension {
    private int[][] twoDim = new int [4][];
    private int[][] nonRectangular  = new int [4][];

    public ArrayTwoDimension() {
        twoDim[0] = new int[5];
        twoDim[1] = new int[5];

        nonRectangular[0] = new int[2];
        nonRectangular[1] = new int[4];
        nonRectangular[2] = new int[6];
        nonRectangular[3] = new int[8];

    }

    public int[][] getTwoDim() {
        return twoDim;
    }

    public int[][] getNonRectangular() {
        return nonRectangular;
    }
}
