
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = new String("Java");
//		String str2 = new String("Java");
//		String str3 = "자바 프로그래밍";
//		String str4 = "자바 프로그래밍";
//		
//		System.out.println(str1);
//		System.out.println(str1);
//		System.out.println(str1);
//		System.out.println(str1);
//		
//	if(str1 == str2)
//		System.out.println("str1과 str2는 동일한 객체를 참조");
//	else
//		System.out.println("str1과 str2는 다른 객체를 참조");
//	if(str3 == str4)
//		System.out.println("str1과 str2는 동일한 객체를 참조");
//	else
//		System.out.println("str1과 str2는 다른 객체를 참조");
		
//		String str1 = new String("Apple");
//		String str2 = new String("apple");
//		String str3 = new String("Banana");
//		int cmp;
//		
//		if(str1.equals(str3)) // 문자열이 같은지 비교
//			System.out.println("두 문자열은 같다");
//		else
//			System.out.println("두 문자열은 다르다");
//		cmp = str1.compareTo(str2);
//		if(cmp == 0)
//			System.out.println("두 문자열은 같다");
//		else if(cmp < 0)
//			System.out.println("사전 앞에 위치하는 문자: " +str1);
//		else
//			System.out.println("사전 앞에 위치하는 문자: " +str2);
//		
//		if(str1.compareToIgnoreCase(str2) == 0)
//			System.out.println("두 문자열은 같다");
//		else
//			System.out.println("두 문자열은 다르다");
		
//		String str1 = "자바";
//		String str2 = "프로그래밍";
//		
//		String str3 = str1.concat(str2);
//		System.out.println(str3);
//		
//		String str4 = "쉬운".concat(str3);
//		System.out.println(str4);
		
//		String str = "JavaProgramming";
//		int num = str.indexOf("a"); // "a"의 위치 반환 
//		int num1 = str.indexOf("a", num + 1); // 첫 "a" 그 다음 "a" 위치 반환 
//		System.out.println(num);
//		System.out.println(num1);
		
//		String str1 = "JavaProgramming";
//		int num = str1.indexOf("Pro"); 
//		int num1 = str1.indexOf("ing");
//		
//		//String str2 = str1.substring(num, num1);
//		//System.out.println(str2);
//		
//		String str3 = str1.substring(num1);
//		System.out.println(str3);
		
//		StringBuilder buf = new StringBuilder("동해물과");
//		
//		buf.append("백두산이");
//		System.out.println(buf.toString());
//		
//		buf.append(12345);
//		System.out.println(buf.toString());
//		
//		buf.delete(1,4);
//		System.out.println(buf.toString());
				
//		int[] arr1 = new int[5];
//		double[] arr2 = new double[7];
//		
//		float[] arr3;
//		arr3 = new float[9];
//		
//		System.out.println("배열 arr1의 길이는 : "+ arr1.length);
//		System.out.println("배열 arr2의 길이는 : "+ arr2.length);
//		System.out.println("배열 arr3의 길이는 : "+ arr3.length);
//		
		
//		int [] arr = new int[3];
//		arr[0] = 100;
//		arr[1] = 50;
//		arr[2] = 60;
//		
//		int sum = arr[0] + arr[1] + arr[2];
//		System.out.println("총점 : "+ sum);
		
//		String[] name = new String[5];
//		
//		name[0] = new String("hong");
//		name[1] = new String("hle");
//		name[2] = new String("paeg");
//		name[3] = new String("kil");
//		name[4] = new String("ton");
//		
//		int sum = 0;
//		for(int i = 0; i < name.length; i++) {
//			System.out.println(name[i]);
//			sum = sum + name[i].length();
//		}
//		System.out.println("총 문자열의 길이 값은 : "+ sum);
		
//		int[] arr1 = new int[3]; // 정수형 0으로 초기화 
//		int[] arr2 = new int[] {1,2,3};
//		double[] arr3 = {1.0,2.0,3.0};
//		double[] arr4 = new double[3]; // 실수형 0.0으로 초기화 
//		StringTest[] arr5 = new StringTest[3]; // 배열로 선언된 객체는 클래스 멤버가 없어도 가능
//										 	   // 객체는 초기값을 null로
//		
//		for(int i = 0; i < arr1.length ; i++) {
//			System.out.print(arr1[i] + " ");
//			System.out.print(arr2[i] + " ");
//			System.out.print(arr3[i] + " ");
//			System.out.print(arr4[i] + " ");
//			System.out.print(arr5[i] + " ");
//			System.out.println();
//		}
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
			
	}
}



