package co.g2academy.array;

public class ArrayEnhancedLoop {
    private int[] list = {1,5,6,8,10};

    public int calculateSumAllItem() {
        int sum = 0 ;
        for (int element : list) {
            sum += element;         // calculation
        }
        return sum;
    }

    public int calculationMultiplicationAllItem() {
        int multiple =1;
        for(int element : list) {
            multiple*=element;  //calculation
        }
        return multiple;
    }

    public int averageAllItemOfInteger() {
        return calculateSumAllItem() / list.length;
    }
}
