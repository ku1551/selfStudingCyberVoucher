package strings;

import java.util.Scanner;

public class RepeatString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		exceptions(T, 1000);
		
		for(int i=0; i<T; i++){
			
			int R = sc.nextInt();
			String text = sc.next();
			
			exceptions(R, 8);
			
			for(int j=0; j < text.length(); j++){
				for(int k=0; k < R; k++){
					System.out.print(text.charAt(j));
				}	
			}
			System.out.println();
		}
	}
	
	public static int exceptions(int num, int max){
		if(num < 1){
			num = 1;
		}else if(num > max){
			num = max;
		}
		return num;
	}
}
