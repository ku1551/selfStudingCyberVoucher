package baekjoonFunction;

public class Test {		
		public static long sum(int[] a){
			long sum = 0;
			
			for(int i=0; i<a.length; i++){
				sum += a[i];
			}
			
			return sum;
		}
		public static void main(String[] args) {
			
			int[] a = new int[3];
			
			for(int i=0; i<a.length; i++){
				a[i] = i;
			}
			
			long result = sum(a);
			System.out.println(result);
		}
}
