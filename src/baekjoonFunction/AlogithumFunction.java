package baekjoonFunction;

public class AlogithumFunction {
	public static void main(String[] args) {
		
		int index = 10000; // 1~10000������ ��
		boolean[] nums = new boolean[index]; // ���� �ѹ��� ������ �迭 ����
		
		for(int i=0; i<nums.length; i++) {

			if(add(i+1) < index+1){
				nums[add(i+1)-1] = true; // ���� �ѹ��� �ƴϸ� true�� ����
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
