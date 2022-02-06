class Cup {
	Cup(int marker) {
		System.out.println("Cup(" + marker + ")");
	}
	void f(int marker) {
		System.out.println("f(" + marker +")");
	}
}
class Cups {
	static Cup cup1;
	static Cup cup2;
	static {	// 블록 초기
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups() {	// 생성자
		System.out.println("Cups()");
	}
}
public class FinalStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main()");
		Cups.cup1.f(99);
	}

}
