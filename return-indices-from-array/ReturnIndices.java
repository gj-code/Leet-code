import java.util.Scanner;

public class ReturnIndices {
    public static void main(String[] args){
        System.out.println(" Please provide an array of integers: ");

        int[] arr = {2, 4, 5};
        int target = 9;

       int[] indices = twoSum(arr, target);
       System.out.println("Indices: [" + indices[0] + ", " + indices[1] + "]");


    }

        public static int[] twoSum(int[] nums, int target) {
            for(int i = 0; i < nums.length; i ++) {
                for(int j = i + 1; j <= nums.length - 1; j++){
                    if(nums[i] + nums[j] == target){
                        // System.out.println("[" + i + "," + j + "]");
                        return new int[] { i, j };
                    }
                }
            }
            return new int[] { -1, -1 };
    }
}