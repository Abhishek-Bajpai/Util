package bajpai.edu.testskills;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCodeProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2, 7, 11, 15};
		int target = 22;
		int[] result = twoSum(nums, target);
		
		System.out.print(Arrays.toString(result));
		
	}

	public static int[] twoSum(int[] nums, int target) {
	    if(nums==null || nums.length<2)
	        return new int[]{0,0};
	 
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i=0; i<nums.length; i++){
	        if(map.containsKey(nums[i])){
	            return new int[]{map.get(nums[i]), i};
	        }else{
	            map.put(target-nums[i], i);
	        }
            
	    }
	 
	    
	    return new int[]{0,0};
	}
	
}
