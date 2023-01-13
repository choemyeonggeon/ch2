package com.greedy.section05.logical;

public class Application02 {

	public static void main(String[] args) {
		/*논리 연산자의 우선순위와 활용
		 * && : 11순위
		 * || " 22순위
		 * */
		
		int x = 3;
		int y = 10;
		
		System.out.println(y >= 5 || x > 0 && x < 2); //우선순위 떄문에 Ture가나옴
		
		/*1. 1부터 100 사이의 값인지 확인
		 * 1 <= 변수 <=100 이렇게는 사용하지 못함
		 * 변수 >= 1 && 변수 <= 100
		 */
		
		int num1 = 55;
		System.out.println("1부터 100 사이인지 확인 : " + (num1 >= 1 && num1 <= 100));		//조건 잘 확인하기,num값이 높을떄 1이초과해서 true값이 나올수가 있음
		
		int num2 = 166;
		System.out.println("1부터 100 사이인지 확인 : " +(num2 >=1 && num2 <= 100));
		
		/*2. 영어 대문자인지 확인
		 * 문자 >=A && 문자 >=Z*/
		char ch1 = 'G';
		System.out.println("영어 대문자인지 확인 :" +(ch1 >= 'A' && ch1 <'Z'));
		
		char ch2 ='g';
		System.out.println("영어 대문자인지 확인 : "  +(ch2 >= 'A' && ch2 <'Z'));
		
		/*3. 대문자 소문자 상관 없이 영문자 'y' 인지 확인
		 *  문자 == 'y' && 문자 == 'y'*/
		
		char ch3 ='y';
		System.out.println("영문자 'y'인지 확인하기 : " +(ch3 == 'y' || ch3 == 'Y'));
		
		//4. 영문자인지 확인
		
		char ch4 ='f';
		System.out.println("영문자인지	 확인 : " + ((ch4 >= 'A' &&  ch4 <= 'Z') ||(ch4 >= 'a' && ch4 <= 'z')));
		
		
		
	
	}

}
