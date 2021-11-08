package strings;

import java.util.Scanner;

public class FindAlphabat {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.next();

		caseOne(word);

	}
	//case 1
	public static void caseOne(String word){
		for(char i='a'; i<='z'; i++){
			System.out.print(word.indexOf(i)+" ");
		}
	}
}	