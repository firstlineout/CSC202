import java.util.ArrayList;
import java.util.Arrays;

public class GenerateSubsets {

	public static String subsets(int n) {
		
		int[] s = new int[n];
		
		ArrayList<String> p = new ArrayList<String>();
		
		String permutations = "";
		
		int factorial = 1;
		
		for (int i = 1; i <= n; i++)
			factorial = factorial * i;
		
		if (n <= 1) {
			
			return "" + n;
			}
		
		for (int i = 0; i < n; i++) {
			
			s[i] = i + 1;
		}
		
		
			while(p.size() < factorial-1) {

					String temp = Arrays.toString(s);
					p.add(0, temp);
				
					int a = s[0];
					int b = s[1];
					int c = s[s.length-1];

					s[0] = b;
					s[1] = a;
					
					temp = Arrays.toString(s);
					p.add(0, temp);
			
					s[0] = c;
					s[s.length-1] = b;
			}
			
		for (int i = 0; i < factorial; i++) {
			
			permutations = permutations + p.get(i) + ", ";
		}
		
		return permutations + '\n' + subsets(n-1);
	}	
	
	public static void main(String[] args) {

		System.out.print(subsets(4));
	}
}
