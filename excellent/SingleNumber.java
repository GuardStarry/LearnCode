package excellent;


/**
 * Created by Misaka on 16/8/29.
 */
public class SingleNumber {

    public int singleNumberI(int[] A) {
        int num = 0;
        for (int i = 0; i < A.length; i++) {
            num ^= A[i];
        }
        return num;
    }
    public int singleNumberII(int[] A) {
        int ones = 0;//记录只出现过1次的bits
        int twos = 0;//记录只出现过2次的bits
        int threes;
        for (int i = 0; i < A.length; i++) {
            int t = A[i];
            twos |= ones & t;//要在更新ones前面更新twos
            ones ^= t;
            threes = ones & twos;//ones和twos中都为1即出现了3次
            System.out.println("t = " + t + ",twos = " + twos + ",ones = " + ones + ",threes = " + threes);
            ones ^= threes;//抹去出现了3次的bits
            twos ^= threes;
            System.out.println("ones = " + ones + ",twos = " + twos);
            System.out.println("---------------");
        }
        return ones;
    }

    /*******************main**********************/
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] A = {3, 2, 3, 2, 3, 1, 4, 4, 4, 5, 6, 5, 6, 5, 6, 2};
        System.out.println(singleNumber.singleNumberII(A));
    }
}
