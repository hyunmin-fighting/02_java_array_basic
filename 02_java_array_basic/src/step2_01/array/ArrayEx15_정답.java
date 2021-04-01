package step2_01.array;
import java.util.Arrays;
//210331 22:24 ~ 210401 13:40
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임
 * 
 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
 *    back에 모든 수가 채워지면 게임은 종료된다.
 * 예)
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * 입력1 : 2
 * 입력2 : 4
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 0, 0, 0, 0, 0]
 * 
 * 입력1 : 5
 * 입력2 : 7
 * 
ㅈ * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 2, 0, 2, 0, 0]
 * 
 */

public class ArrayEx15_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		int temp = 0;
		int tempRan = 0;
		int cnt  = 0;
		
		// 셔플 구현(Shuffle) : 배열의 요소들을 무작위로 섞음
		while (cnt < 1000) {			
			tempRan = ran.nextInt(9);   //0~8 까지의 랜덤수를 temRan에 입력
			temp = front[0]; 			// temp에 front 0번 인덱스값 입력
			front[0] = front[tempRan];	//	front 0번 인덱스에 front random인덱스값 입력
			front[tempRan] = temp;		//	front random 인덱스에 front 0qjs
			cnt++;
		}
			
		for (int i=0; i<10; i++) {
			System.out.print(front[i] + " ");
		}
		System.out.println();
		for (int i=0; i<10; i++) {
			System.out.print(back[i] + " ");
		}
		System.out.println();
			
		
		int val1 = 0;
		int val2 = 0;
		boolean isRun = true;
		int num = 1;

		
		while(isRun) {
		
			System.out.print("입력1 : ");
			int input1 = scan.nextInt();
			System.out.print("입력2 : ");
			int input2 = scan.nextInt();
		
			for(int i=0; i<front.length; i++) {
				val1 = front[input1];
				val2 = front[input2];		
			}
			if(val1 == val2 && input1 != input2) {
				back[input1] = num;
				back[input2] = num;
				num++;
			}

			System.out.println(Arrays.toString(back));
			
			int checkNum = 1;
			for(int i=0; i<back.length; i++) {
				checkNum *= back[i];
			}
			
			if(checkNum != 0) {
				isRun = false;
				System.out.println("종료");
			}	
		}
		
		scan.close();
			
	}
	
}
