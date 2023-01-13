package com.greedy.section02.assignment;

public class Appliction1 {

	public static void main(String[] args) {
		//대입연산자와 산술 복합 대입 연산자
		int num = 12;

		System.out.println("num: " +num);

		//3증가
		num = num + 3;		//대입연산자의 오른쪽에는 값, 왼쪽에는 공간의 의미이다.
		System.out.println("num: " + num);

		num += 3;		//num + num + 3과 같은 의미임
		System.out.println("num :" + num);

		num -= 5;
		System.out.println("num : " + num);

		num *= 2;
		System.out.println("num : " + num);

		num /= 2;
		System.out.println("num : " + num);


		//주의 ! 산술 복합 대입 연산자의 작성 순서에 유의해야 한다.
		//살술 대입 연잔자 -= 를 =-로 사용하는경우
		// num =- 5;

		num =- 5;
		System.out.println("num : " + num);

	}

}
