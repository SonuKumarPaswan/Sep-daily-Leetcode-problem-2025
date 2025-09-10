import java.util.HashMap;

public class MajorityEle {
    public static int majorityElem(int nums[]) {
        int res = 0;
        int majority = 0;
        for (int n : nums) {
            if (majority == 0) {
                res = n;
            }
            majority += n == res ? 1 : -1;
        }
        return res;
    }

    // using hashmap
    public static int majorityEle(int nums[]) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2)
                return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElem(nums));
        System.out.println(majorityEle(nums));
    }
}