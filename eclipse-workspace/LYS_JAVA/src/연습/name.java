package 연습;

public class name {

	private int a;
	private int b;
	
	// 리턴타입이 없으면 생성자 
	public name(int a, int b) {
		// this가있으면 클래스 안에 있는 변수를 나타냄.
		// this가 없으면 매개변수.
		a = a;
		b = b;
	}
	
	public name(int c) {
		this(c, 3);
	}
	// 리턴타입이있으면 메서
	public void test(int a) {
		System.out.println("aaaa"+ a);
		
		
	}
	
	public static void main(String[] args) {
		name n = new name(3);
		
		n.test(1);
		
		

	}

}
