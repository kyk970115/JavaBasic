class Book1 { // (1)
	String title;
	int price;
	/*
	
	int num = 0;
	
	  디폴트 생성자를 사용하지 못할 때
	  1. 생성자의 오버로딩을 할 때에는 디폴트 생성자도 함께 선언해야 
	 
	
	Book() {
		title = "달려라 아비";
		price = 12600;
	}
	
	// 생성자 오버로딩 
	Book(String t, int p) {
		title = t;
		price = p;
	}
	
	void print() {
		System.out.println("제목 = " + title);
		System.out.println("가격 = " + price);
		System.out.println("수량 = " + num);
		System.out.println("합계 = " + price * num);
	}
	*/
}

class Book2 { // (2)
		public String title; 
		private int price; // (3) 은닉화 
		
		public Book2(String title, int price) {
			this.title = title;
			this.price = price;
		}
	
		public int getPrice() { // (4)
			return price;
		}
		
		public void setPrice(int price) { // (5)
			if(price > 0 || price < 15000) { // (6)
				System.out.println("책값이 적당합니다.");
				this.price = 12000;
				return;
			}
			this.price = price;
		}
}
public class userTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Book book1 = new Book();
		book1.print();
		
		Book book2 = new Book("기억전달자",25600); // 	인수(혹은 인자) 
		book2.num = 10;
		book2.print();
		*/
		
	Book1 book1 = new Book1(); // (7)
	book1.title = "달려라 아비"; // (8)
	book1.price = 13000; // (9)
	//System.out.println();
	System.out.printf("%s의 가격은 %d입니다.\n", book1.title, book1.price);
	
	Book2 book2 = new Book2("기억전달자", -20000);
	book2.title = "노인과바다"; // (10) 직접 접근 
	book2.setPrice(50000); // (11) setter를 사용하여 price에 접근 
	int price = book2.getPrice(); // (12)
	//System.out.println();
	System.out.printf("%s의 가격은 %d입니다.\n", book2.title, price); // (13)
	
	}

}
