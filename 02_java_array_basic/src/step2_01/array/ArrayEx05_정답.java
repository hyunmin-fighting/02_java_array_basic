package step2_01.array;
// 210329 16:42 ~ 17:20
/*
 * # 학생성적관리 프로그램[2단계] : 학생검색
 */

import java.util.Scanner;

public class ArrayEx05_정답 {

	public static void main(String[] args) {
	
		// 인덱스    0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		
		Scanner scan = new Scanner(System.in);
		System.out.print("인덱스 입력 : ");
		int inputedIndex = scan.nextInt();
		System.out.println("성적 : " + arr[inputedIndex] + "점");
		
		
		
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		int searchedIndex = -1;
		System.out.print("성적 입력 : ");
		int inputedPoint = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(inputedPoint == arr[i]) {
				searchedIndex = i;
			}
		}
		System.out.println("검색된 인덱스 : " + searchedIndex);

		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점

		
		int studentNumber;
		int searchedIndex1 = -1;
		
		System.out.print("학번을 입력 : ");
		studentNumber = scan.nextInt();
		
		for(int i = 0; i < hakbuns.length; i++) {
			if(studentNumber == hakbuns[i]) searchedIndex1 = i;
		}
		
		System.out.println("학번 " + studentNumber + "번 학생의 성적은 " + scores[searchedIndex1] + "점 입니다.");
		
		
		scan.close();

	}
	
}
