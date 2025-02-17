package 연습;

import java.io.Closeable;
import java.util.Scanner;

// 다음 코드를 완성해서 Persom클래스의 객체를 생성하고 
// 객체의 name과 age를 출력하는 프로그램을 작성하시오 

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}





public class Mian {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("이름 : ");
    	System.out.println("나이 :");
    	
    	String name = scanner.nextLine();
    	int age = scanner.nextInt();
    	
    	Person person1 = new Person(name, age);
    	
    	System.out.println("입력한 이름:" + person1.name);
    	System.out.println("입력한 나이:" + person1.age);
    	
    	
    	scanner.close();
    
    }
      
}
