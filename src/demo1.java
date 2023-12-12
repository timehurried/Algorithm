import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *1. 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现
 */
public class demo1 {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6,7};
        int target=9;
        demo1 as=new demo1();
        System.out.println(Arrays.toString(as.twoSum(nums,target)));

    }

    public  int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();//创建Map集合，用于存储遍历过的数据
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])){//判断target-nums[i]的结果，在Map中是否存在
                return new int[]{map.get(target-nums[i]),i };
            }
           map.put(nums[i],i);//将遍历过的数据存入map
        }
        return new int[0];
    }
}
