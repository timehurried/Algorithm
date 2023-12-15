import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 26. 删除有序数组中的重复项
 */
public class demo2 {

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 2, 2, 2, 3};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(removeDuplicates(a));
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int b = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != nums[b]) { //两边不相等时
                b++;
                nums[b] = nums[i];//nums[1] =nums[4]

            }

        }

        return b + 1;
    }

}
