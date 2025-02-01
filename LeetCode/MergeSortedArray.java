package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
     /**
      * 
       int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
      */   
      
      int[] nums1 = {0};
    int[] nums2 = {1};
        int m = 0;
        int n = 1;

        merge(nums1, m, nums2, n);

    }
 
    

    public  static void merge(int[] nums1, int m, int[] nums2, int n) {

        int l = m-1;
        int r = n-1;
       for(int i = (m+n)-1; i >= 0; i--) {
       int e = 0;

        if(l < 0) {
            e = nums2[r];
            r--;
        }

        else if( r < 0) {
            e = nums1[l];
            l--;
        }

        else if(nums2[r] >= nums1[l]) {
    //System.out.println("inserting at" +i + "=" + nums2[r]);
          e = nums2[r];
           r--;
        }
        else {
          //  System.out.println("inserting at" +i + "=" + nums1[l]);
            e = nums1[l];
            l--;
        }

        nums1[i] = e;
       

       }

       System.out.println("t:"+Arrays.toString(nums1));

    }

  
}
