import java.util.Scanner; // Scanner는 사용자가 직접 키보드로 입력할 수 있는 클래
import java.util.Arrays;
public class Ex01 {
	public static void main(String[] args)
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * int score = 50; if(score > 60) { System.out.println("참입니다."); } else {
	 * System.out.println("거짓입니다."); }
	 * 
	 * }
	 */

	/*
	 * { int x = 0; //System.out.printf("x=%d입니다.", x); if(x == 0)
	 * System.out.println("x==0"); if(x != 0) System.out.println("x!=0"); if(!(x ==
	 * 0)) System.out.println("!(x==0)"); if(!(x != 0))
	 * System.out.println("!(x!=0)"); }
	 */
	
	/*{
		int x = 1;
		//System.out.printf("x=%d입니다.", x);
		if(x == 0) System.out.println("x==0");
		if(x != 0) System.out.println("x!=0");
		if(!(x == 0)) System.out.println("!(x==0)");
		if(!(x != 0)) System.out.println("!(x!=0)");
		
		System.out.print("숫자를 입력해주세요");
		Scanner  scanner = new Scanner(System.in);
		int input = scanner.nextInt(); // 객체.메소드
		
	if(input == 0)
	{
		System.out.println("밉력하신 숫자는 0입니다.");
	}
	else
	{
		System.out.println("입력하신 숫자는 0이 아닙니다.");
	}
		}*/

//{
//	int number = 0;
//	char grade = ' ';
//	
//	System.out.print("점수를 입력하세요");
//	Scanner scanner = new Scanner(System.in);
//	number = scanner.nextInt();
//	
//	System.out.println("당신의 점수는" +number + "점 입니다");
//	
//	if(number >= 90)
//	{
//		grade = 'A';
//	}
//	
//	else if(number >= 80)
//	{
//	grade = 'B';
//	}
//	else if(number>=70)
//	{
//		grade = 'C';
//	}
//	else
//	{
//	grade = 'D'	;
//	}
//System.out.println("당신의 학점은" + grade + "입니다");
//}

/*{
	System.out.print("월을 입력하세요");
	Scanner scanner = new Scanner(System.in);
	int month = scanner.nextInt();
	
	switch(month)
	{
	case 3:
	case 4:
	case 5:
		System.out.println("현재 계절은 봄입니다.");
		break;
	case 6: case 7: case 8:
		System.out.println("현재 계절은 여름입니다.");
		break;
	case 9: case 10: case 11:
		System.out.println("현재 계절은 가을입니다.");
		break;
	case 12: case 1: case 2:
		System.out.println("현재 계절은 겨울입니다.");
		break;
		
	}*/

/*{
	int sum = 0;
	
	for(int i = 1; i <= 10; ++i)
	{
		sum = sum + i;
	}
			System.out.println(sum);
	
}
}*/
/*{
	for(int k=1; k <= 5; k++)
	{
		for(int i =1; i <= 10; i++)
	{
			System.out.print("*");
	}
	System.out.println();
	}
}*/

/*{
for(int i=1; i <= 5; i++) {
	for(int k=1; k <= i; k++){
	System.out.print("*");
}
	System.out.println();
}
}*/

//Scanner 이용하여 정수 입력 (단 정수는 2~9사이 정수 하나만) 
//입력한 정수를 받아 해당 구구단 
	
/*	{
int[] arr1 = new int[10];
int[] arr2 = new int[10];

int[] arr3 = {1,2,3,4,5}; // arr[0] = 1
char[] arr4 = {'A','B','C'};

for(int i=0; i < arr1.length; i++) {
	arr1[i] = i + 1; //1~10 숫자를 배에 저장 
 }
for(int i=0; i < arr1.length; i++) {
	arr2[i] = i + 1; //1~10 숫자를 배에 저장 
 }
System.out.println(Arrays.toString(arr1));
System.out.println(Arrays.toString(arr2));
System.out.println(arr3);
System.out.println(arr4);
	}*/

	/*{
		int sum = 0;
		float avg = 0f;
		
		int[] score = {80,50,65,71,100};
		for(int i = 0; i < score.length; i++) {
			sum += score[i]; // sum = sum + score[i] 
		}
		avg = sum / (float)score.length; //형변환 
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}*/
	
	/*{
		int[] score = {100, 80, 50, 60, 30, 55, 29};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
		} else if(score[i] < min) {
			min = score[i];
		}
	
		}
	System.out.println("max : " + max);
	System.out.println("min : " + min);
	}*/

	{
		int[] ball = new int[45];
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		
		int tmp = 0;
		int j = 0;	// 6개의 숫자를 얻어옴
		
		for(int i =0; i < 6; i++) {
			j = (int)(Math.random() * 45);	// 0 ~ 44 범위의 임의의 숫자 얻음
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;	// 각 값을 동시에 바꿀 수 없어서 tmp를 매개체처럼 사용하여 교환 
		}
		
		for(int i =0; i < 6; i++) {
			System.out.println("뽑힌 숫자는 :" +ball[i]);
		}
	}

}



