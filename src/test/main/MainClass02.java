package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		int[] nums = new int[3];
		// 배열객체에는 방의 갯수를 가지고 있는 length 라는 필드가 있다.
		int a = nums.length; // 3 이 참조된다.
		
		// 각각의 방에 11,12,13 을 저장해보세요.
		nums[0] = 11;
		nums[1] = 12;
		nums[2] = 13;
		
		// 각각의 방에 저장된 값을 a1, a2, a3 라는 변수에 담아 보세요.
		int a1 = nums[0];
		int a2 = nums[1];
		int a3 = nums[2];
		
		// ArrayIndexOutOfBoundsException 발생
		// int a4 = nums[3];
		
		
		int[] nums2 = null;
		// NullPointerException 발생
		// nums2 에는 참조값이 없다.
		int b = nums2.length;
		
	}
}
