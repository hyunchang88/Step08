package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		
		// 정수값을 배열로 관리 하고 싶다면...
		int[] nums = {10, 20, 30, 40, 50};
		// 실수값을 배열로 관리 하고 싶다면...
		double[] nums2 = {10.1, 10.2, 10.3, 10.4, 10.5};
		// String type 데이터를 배열로 관리 하고 싶다면...
		String[] names = {"kim", "lee", "park", "huh", "han"};
		
		// int type 을 담을수 있는 방 5개짜리 배열객체 생성
		int[] nums3 = new int[5];
		// 각각의 인덱스를 참조해서 대입연산자로 값 대입하기.
		nums3[0] = 10;
		nums3[1] = 20;
		nums3[2] = 30;
		// sting type 을 담을 수 있는 방 5개짜리 배열객체 생성
		String[] names2 = new String[5];
		// 각각의 인덱스를 참조해서 대입연산자로 String type data 대입하기
		names2[0] = "kim";
		names2[1] = "lee";
		names2[2] = "park";
	}
}
