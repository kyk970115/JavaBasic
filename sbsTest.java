// 클래스 정의 
class Sbs {
/*	// 필드 선언 : 데이터 
	String name;
	int number;
	
	// 메소드 선언 : 동작
	void say() {
		System.out.println("안녕하세요");
	} */
	
	int add(int a, int b ) {
		return a + b;
	}
	
	int add(int a) {
		return a + 1;
	}
	
	double add(double a, double b) {
		return a + b;
	}
}
public class sbsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Sbs sbs1 = new Sbs();
		
		sbs1.name = "홍길동";
		sbs1.number = 123456;
		System.out.println(sbs1.name + ":" + sbs1.number);
		
		sbs1.say();
	*/
	
	// 메소드 오버로딩 : 매개변수 개수 및 매개변수 자료형이 다르게 선언 
	Sbs calc = new Sbs(); // 컴포지션 
	int res1 = calc.add(3,5);
	int res2 = calc.add(3);
	double res3 = calc.add(3.0, 5.5);
	
	System.out.println("res1 = " + res1);
	System.out.println("res2 = " + res2);
	System.out.println("res3 = " + res3);
	}
	
}
