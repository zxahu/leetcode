/**
 * Created by zxahu on 2016/3/27.
 */
public class CountingBits_338 {

    /*有下列递推公式：
    * num[i] = num[i>>1] + n&1  equals to num[i] = num[i/2] + n&1
    * exp. num[5(101)] = num[2(10)] + 5&1(101&1) = 2
    *      num[6(110)] = num[3(11)] + 6&1(110&1) = 2
    * */
    public int[] countBits(int num) {
        int i;
        int[] nums = new int[num+1];
        for(i=1; i<= num; i++){
            nums[i] = nums[i/2] + (i&1);
        }
        return nums;
    }

    public static void main(String args[]){
        CountingBits_338 test = new CountingBits_338();
        int[] nums = test.countBits(10);
        for(int i=0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
