
public class tvTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv(); // t1 객체 생성 
		Tv t2 = new Tv(); // t2 객체 생성 
		System.out.println("t1의 channel의 값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel의 값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel의 값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel의 값은 " + t2.channel + "입니다.");
	
	}
}

/*
 * class Tv { String color; boolean power; int channel; // 0으로 초기화
 * 
 * void power() { power = !power; } void channelup() { ++channel; } void
 * channelDown() { --channel; } }
 */