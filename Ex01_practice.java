import java.util.Scanner;

//Scanner 이용하여 정수 입력 (단 정수는 2~9사이 정수 하나만) 
//입력한 정수를 받아 해당 구구단 

public class Ex01_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("2~9 사이의 정수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(num + "x" + i + "=" + num * i);
	}

}
}
