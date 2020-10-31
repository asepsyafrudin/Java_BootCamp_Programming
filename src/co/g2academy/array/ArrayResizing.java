package co.g2academy.array;

public class ArrayResizing {
    public int[] resize(int[] initialArray, int n) {
        //create new array
        int[] resizeArray = new int[n];
        //Manual Array
//        for(int i = 0 ; i<initialArray.length ;  i++){
//            resizeArray[i] = initialArray[i];
//        }

        //Menngunakan Array Copy
        System.arraycopy(initialArray, 0, resizeArray, 0, initialArray.length);

        return resizeArray;
    }
}
