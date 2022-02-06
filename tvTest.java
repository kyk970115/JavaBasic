
public class tvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;	// t는 객체가 아니고 그냥 변수, '컴포지션' 
		t = new Tv();	// Tv t = new Tv();	// 이제 객체 
		t.channel = 7;	// 객체.속성, 속성값 변경 
		t.channelDown();	// 객체.메소드()
		System.out.println("현재 채널은 " + t.channel + "입니다.");
	}

}


class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelup() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}