package algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Mahesh Gaonkar
 *
 */
public class TwoSumSolution {

	public static int[] twoSum(int[] nums, int target){
		if(nums == null)
			throw new NullPointerException("nums[] array can't be null.");
		else if(nums.length == 0)
			throw new IllegalArgumentException("nums[] array can't be zero size.");
		else{
			 Map<Integer, Integer> map = new HashMap<>();
			    for(int i = 0; i < nums.length; i++) {
			        int complement = target - nums[i];
			        if (map.containsKey(complement)) {
			            return new int[] { map.get(complement), i };
			        }
			        map.put(nums[i], i);
			    }
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args) {
		try{
			//test Case : two sum is found
			int[] nums = {2,7,11,5};
			int target = 9;
			int[] output = twoSum(nums, target);
			System.out.println("[" + output[0] + ", " + output[1] + "]");
			
			//test Case : two sum is not found
			target = 17;
			int[] output2 = twoSum(nums, target);
			System.out.println("[" + output2[0] + ", " + output2[1] + "]");
		}catch(NullPointerException ex){
			System.err.println(ex.getMessage());
		}catch(IllegalArgumentException ex){
			System.err.println(ex.getMessage());
		}catch(Exception ex){
			System.err.println(ex.getMessage());
		}
	}

}
