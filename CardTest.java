
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Card.width = " + Card.width);	// Card를 쓰면 클래스의 변수 뱐동   
		System.out.println("Card.length = " + Card.height);	// c1을 쓰면 객체의 변수 변동
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + "," + c1.number
				+ "이며, 크기는 (" +c1.width + "," + c1.height + ")");
		
		System.out.println("c2은 " + c2.kind + "," + c2.number
				+ "이며, 크기는 (" +c2.width + "," + c2.height + ")");
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");	// 객체는 클래스의 속성값을 접근한다.
		c1.width = 50;
		c1.height = 80;	// 객체 c1, c2가 같은 클래스를 공유한다. // Card c1 (or) c2 = new Card()
		
		System.out.println("c1은 " + c1.kind + "," + c1.number
				+ "이며, 크기는 (" +c1.width + "," + c1.height + ")");
		
		System.out.println("c2은 " + c2.kind + "," + c2.number
				+ "이며, 크기는 (" +c2.width + "," + c2.height + ")");	// c1, c2가 같은 클래스이므로 값이 같음 
	}

}
class Card {
	String kind;	// 인스턴스 변수(객체의 속성, 개별)
	int number;
	static int width = 100;
	static int height = 250;
}