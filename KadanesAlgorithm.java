import java.util.* ;
import java.io.*; 

public class KadanesAlgorithm {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long sum = 0; 
		long max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			sum += arr[i];
			if(sum > max)
				max = sum;
			if(sum < 0)
				sum = 0;
		}
		if(max < 0)
			max = 0;
		return max;
	}

}
