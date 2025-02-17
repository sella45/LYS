package 연습;

import java.util.Scanner;

class Book {
	String title;
	String author;
	int price;
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
}


public class b {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("책 제목을 입력하세요 :");
		String title = scanner.nextLine();
		
		System.out.println("저자를 입력하세요 :");
		String author = scanner.nextLine();
		
		System.out.println("가격을 입력하세요 : ");
		int price = scanner.nextInt();
		
		Book book = new Book(title, author, price);
		
		System.out.println("입력한 책 제목:" + book.title);
		System.out.println("입력한 책 저자 :" + book.author);
		System.out.println("입력한 책 가격:" + book.price);
		
		

	}

}
