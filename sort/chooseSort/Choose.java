package sort.chooseSort;

import java.util.Arrays;

/**
 * Created by Misaka on 16/9/9.
 */
public class Choose {
    public void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int max = array[0];
            int index = 0;
            for (int j = 0; j < array.length - i; j++) {
                if (max < array[j]) {
                    max = array[j];
                    index = j;
                }
            }
            array[index] = array[array.length - 1 - i];
            array[array.length - 1 - i] = max;
        }
    }

    public static void main(String[] args) {
        Choose choose = new Choose();
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        choose.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
