import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class PascalsTriangle {

	public static ArrayList<Long> printRow(int i){
			ArrayList<Long> a1 = new ArrayList<>();
			long num = 1;
			a1.add(num);
			for(int j = 1; j < i; j++){
				num = num * ((long)i - (long)j);
				num = num / (long)j;
				a1.add(num);
			}
			return a1;
		}
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                // Write your code here.
		ArrayList<ArrayList<Long>> graph = new ArrayList<>(n);
		for(int i = 1; i <= n; i++){
			graph.add(printRow(i));
		}
		return graph;
	}
}
