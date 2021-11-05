package baekjoonFunction;

import java.util.Scanner;

public class AlgoRithsm {
	public static void main(String[] args) {
		
		/*How to add 0 to 100 shortest way */
		
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.next());
		int result =0;
		switch(num) {
			case(0) : result = (100*50)+50;
					  break;
			case(1) : for(int i=0; i<=100; i++){
						result += i;			
			          };
					  break;
		}
		
		System.out.println(result);
		
		
	}

}
