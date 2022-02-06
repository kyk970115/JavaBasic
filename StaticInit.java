class Bowl {
	Bowl(int marker) {
		System.out.println("Bowl(" + marker + ")");
	}
	void f1(int marker) {
		System.out.println("f1(" + marker + ")");
	}
}

class Table {
	static Bowl bowl1 = new Bowl(1);	 // 1st
	Table() {	// 3rd
		System.out.println("Tale()");
		bowl2.f1(1);
	}
	void f2(int marker) {	// 4th
		System.out.println("f2(" + marker + ")");
	}
	static Bowl bowl2 = new Bowl(2);	// 2nd
}

class Cupboard {
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	Cupboard() {
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}
	void f3(int marker) {
		System.out.println("f3(" + marker + ")");
	}
	static Bowl bowl5 = new Bowl(5);
}


public class StaticInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("new Cupboard() in main");
		new Cupboard();
		System.out.println("new Cupboard() in main");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);
		}
	
	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();
}
