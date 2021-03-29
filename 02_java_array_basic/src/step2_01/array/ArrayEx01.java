package step2_01.array;

/*
 * 
 * # 배열 ( array ) 
 * 
 *  [ 형식 ]
 *  
 *  1) 자료형[] 배열명 = new 자료형[방의개수];
 *  2) 자료형 배열명[] = new 자료형[방의개수];
 * 
 * 	- '같은 자료형'의 데이터를 '여러개' 저장하기 위한 자료구조
 *  - 인덱스 (index) : 0부터 시작하는 방 번호가 부여된다.
 *  - 배열은 주소변수이다.
 *  - 배열을 크기가 변하지 않는다. 배열을 삭제하여도 배열의 크기는 고정되어있다.
 *  - 배열의 요소를 지우는 것은 배열의 초깃값으로 다시 저장하는 것을 의미한다.
 * 
 * */

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {

		
		// 참고) 일반 변수
		int nVar = 0;
		nVar = 3;
		System.out.println(nVar); // 변수의 값이 출력된다.
		
		int[] arr = null;
		arr = new int[5];
		//int[] arr = new int[5] 와 같은 의미
		System.out.println(arr);  // 배열의 주소(링크)가 출력된다
		
		// 배열은 변수와 다르게 배열 생성시에 초깃값이 셋팅이 되어있다.
		// 정수형태의 배열은 0으로 초기화되고 다른 자료형은 직접 확인해보자.
		System.out.println(arr[0]); // 그 링크의 0번째
		System.out.println(arr[1]); // 그 링크의 1번째
		System.out.println(arr[2]); // 그 링크의 2번째
		System.out.println(arr[3]); // 그 링크의 3번째
		System.out.println(arr[4]); // 그 링크의 4번째
		System.out.println(arr[5]); // 그 링크의 4번째
		
//		System.out.println(arr[5]); <-- Exception Error발생 (java.lang.ArrayIndexOutOfBoundsException : 5)
// 		배열의 범위가 넘어설때 발생하는 에러메세지(메시지가 나오는 이유와 해결법 암기)
		
		
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i=0; i < arr.length; i++ ) { // arr.length : 배열의 크기를 자바가 계산하여 표현
			System.out.println(arr[i]);
		}
		
		System.out.println();
		System.out.println(Arrays.toString(arr)); // (참고) 배열이 익숙해진 후부터 사용.
		arr = null; // 배열 전체 삭제
		

		
	}
}
