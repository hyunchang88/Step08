package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		// Car type 객체의 참조값을 담을수 있는 방3개짜리 배열객체를
		// 생성해서 참조값을 변수에 담아보세요.
		Car[] cars=new Car[3];
		// 배열의 각각의 방에 car 객체의 참조값을 담아보세요.
		// 각각 다른 객체
		cars[0] = new Car();
		cars[1] = new Car();
		cars[2] = new Car();
		
		// 배열에 저장된 객체의 참조값을 이용해서 메소드 호출
		cars[0].drive();
		cars[1].drive();
		cars[2].drive();
		
		Car[] cars2 = new Car[3];
		// 전부 같은 객체
		Car c = new Car();
		cars2[0]=c;
		cars2[1]=c;
		cars2[2]=c;
		
		c.drive();
		cars2[0].drive();
		cars2[1].drive();
		cars2[2].drive();
	}
}
