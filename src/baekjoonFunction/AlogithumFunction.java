package baekjoonFunction;

public class AlogithumFunction {
	public static void main(String[] args) {
		
		int index = 10000; // 1~10000까지의 수
		boolean[] nums = new boolean[index]; // 셀프 넘버를 구분할 배열 선언
		
		for(int i=0; i<nums.length; i++) {

			if(add(i+1) < index+1){
				nums[add(i+1)-1] = true; // 셀프 넘버가 아니면 true를 대입
			}
		}
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == false)
				System.out.println(i+1);
		}
	}
	
	static int add(int n) {
		
		String str = Integer.toString(n);
		
		for(int i=0; i<str.length(); i++) {
			n += Integer.parseInt(str.substring(i, i+1));
		}
		return n;
	}
}
