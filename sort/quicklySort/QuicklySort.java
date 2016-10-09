package sort.quicklySort;

import java.util.Arrays;

/**
 * Created by Misaka on 16/8/30.
 */
public class QuicklySort {
    int count;
    public void quicklySort(int[] array, int low, int height) {
        if (low >= height) {
            return;
        }
        int lIndex = low;
        int hIndex = height;
        int key = array[low];
        while (lIndex < hIndex) {
            while (array[hIndex] > key && lIndex < hIndex) {
                hIndex--;
            }
            array[lIndex] = array[hIndex];
            while (array[lIndex] < key && lIndex < hIndex) {
                lIndex++;
            }
            array[hIndex] = array[lIndex];
        }
        array[lIndex] = key;
        count++;
        quicklySort(array, low, lIndex);
        quicklySort(array, hIndex + 1, height);
    }

    public static void main(String[] args) {
        QuicklySort quicklySort = new QuicklySort();
        int[] array = {1,2,3,4,5,6,7,8,9};
        quicklySort.quicklySort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
        System.out.println(quicklySort.count);
    }

}
