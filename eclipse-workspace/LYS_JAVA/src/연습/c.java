package 연습;

import java.util.Scanner;

class Car {
	String model;
	String color;
	int price; 
	
	public Car(String model, String color, int price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	public void showDetails () {
		System.out.println(model);
		System.out.println(color);
		System.out.println(price);
	}
}

public class c {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("차 모델을 입력하세요:");
		String model = scanner.nextLine();
		
		System.out.println("차 색상을 입력하세요: ");
		String color = scanner.nextLine();
		
		System.out.println("차 가격을 입력하세요 ");
		int price = scanner.nextInt();
		
		
		Car car = new Car(model, color, price);

        // 객체의 세부 정보 출력
        car.showDetails();

        // Scanner 닫기
        scanner.close();
		
		

	}



}
