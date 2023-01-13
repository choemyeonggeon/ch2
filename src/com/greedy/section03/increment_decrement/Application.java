package com.greedy.section03.increment_decrement;

public class Application {

	public static void main(String[] args) {
		
		
		/*증강연산자
		 * 피연사의 앞 or 뒤에 사용이 가능하다
		 * ++ : 1증가
		 * -- : 1감소
		 */  
		
		int num = 20;
		System.out.println("num : " + num);
		
		num++;
		System.out.println("num : " + num);
		
		++num;
		System.out.println("num : " + num);
		
		num--;
		System.out.println("num : " + num);
		
		--num;
		System.out.println("num : " + num);
		
		/*다른 연산자와 함께 사용할 떄 의미가 달라진다.
		 * ++var : 피연산자와 값을 먼저 1을 증가시킨 후 다른 연산을 진행함
		 * var++ : 다른 연산을 먼저진행하고 난 뒤 마지막에 피연산자의 값을 1 증가시킴
		 * --var : 피연산자의 값을 먼저 감소시킨 후 다른 연산을 진행함
		 * var-- : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 감소시킴
		 */
		
		int firstNum = 20;
		
		int result1 = firstNum++ *3;
		
		System.out.println("result1 : "+ result1);
		System.out.println("firstNum: " + firstNum);
		
		int secondNum = 20;
		
		int result2 = ++secondNum * 3;
		System.out.println("result2 : " + result2);
		System.out.println("secondNum: " + secondNum);
		
		int num1 = 10;
		int adNum = num1++;
		
		System.out.println("adNum : " + adNum);
	
		int num2 = 10;
		int addNum = ++num2;
		
		System.out.println("addNum : " + addNum);
	
	}

}
