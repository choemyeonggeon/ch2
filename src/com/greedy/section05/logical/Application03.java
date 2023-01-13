package com.greedy.section05.logical;

public class Application03 {

	public static void main(String[] args) {
		/*AND 연산과 OR 연산의 특징
		 * 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함
		 * 논리식	|| 논리식 : 앞의 결과가 true이면 뒤를 실행 안함
		 */
		int num1 =10;
		
		int result = (true && ++num1 > 0)? num1 : num1;
		System.out.println("&&실행 확인 : " + result);
		
	
		int num2 = 10;
		int result1 = (true || ++num2 >0)? num2 : num2;
		System.out.println("||실행 확인 : " + result1);
		
	}

}
