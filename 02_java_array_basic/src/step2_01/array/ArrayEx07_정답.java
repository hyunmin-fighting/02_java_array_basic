package step2_01.array;

// 210329 17:26 ~ 17:39

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */


public class ArrayEx07_정답 {

	public static void main(String[] args) {
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		int maxNum = 0;
		int index = -1;
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		
		for(int i = 0; i < scores.length; i++) {
			if(maxNum < scores[i]) {
				maxNum = scores[i];	
				index = i;
			}
		}
			System.out.println(hakbuns[index] + "번(" + maxNum + "점)");
		
		
	}
	
}
