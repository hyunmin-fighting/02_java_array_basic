package step2_01.array;

import java.util.Random;

//210329 16:28 ~ 16:42

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */


public class ArrayEx04_정답 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];

		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		Random ran = new Random();
		
		int[] arrayRanNum = new int[5];
		for( int i = 0; i < 5; i++) {
			arrayRanNum[i] = ran.nextInt(100)+1;
			System.out.println(arrayRanNum[i]);
		}
		System.out.println();
		
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
		int sumOfPoint = 0;
		int numOfStudent = 0;
		
		for( int i = 0; i < 5; i++) {
			sumOfPoint += arrayRanNum[i];
			numOfStudent++;
		}
		System.out.println("총점 : " + sumOfPoint);
		System.out.println("평균 : " + sumOfPoint / numOfStudent);
		System.out.println();
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명

		int passNum = 0;
		
		for( int i = 0; i < 5; i++) {
			
			if(arrayRanNum[i] > 60) {
				passNum++;
			}
		}
		System.out.println(passNum + "명");
		System.out.println();
		
		
	}
	
}
