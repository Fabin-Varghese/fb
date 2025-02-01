import java.util.Arrays;
public class RemoveElement {
    public static void main(String args[]) {
    int[] nums = {0,1,2,2,3,0,4,2};
    int val = 2;
    int k = removeElement(nums, val);
    System.out.println("k:" +k);
    }
    private  static int removeElement(int[] nums, int val) 
    {
        int index = 0;
        for(int  i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println("Array values after removing element" + val + "is:" + Arrays.toString(nums));
       return index;
    }
    
}
