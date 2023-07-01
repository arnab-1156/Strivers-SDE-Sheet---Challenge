import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		int n = permutation.size();
		int ind = -1;
		for(int i = n-2; i >= 0; i--){
			if(permutation.get(i) < permutation.get(i+1)){
				ind = i;
				break;
			}
		}
		if(ind == -1){
			int beg = 0;
			int end = n - 1;
			Collections.reverse(permutation);
		}
		else{
			for(int i = n-1; i > ind; i--){
				if(permutation.get(i) > permutation.get(ind)){
					int temp = permutation.get(i);
				    permutation.set(i, permutation.get(ind));
				    permutation.set(ind, temp);
					break;
				}
			}
			Collections.sort(permutation.subList(ind+1,n));
		}
		return permutation;

	}
}
