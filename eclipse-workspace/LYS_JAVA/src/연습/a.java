package 연습;

import java.util.Scanner;

class Student {
	String name;
	int age;
		
	public Student (String name, int age) {
		this.name = name;
		this.age = age;
	}
}



public class a {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		System.out.println("나이를 입력하세요");
		
		String name = scanner.nextLine();
		int age = scanner.nextInt();
		
		Student student = new Student(name, age);
		
		System.out.println("입려한 이름 : " + student.name);
		System.out.println("입력한 나이 : " + student.age);
		

		
		

	}

}
