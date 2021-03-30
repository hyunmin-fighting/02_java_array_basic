package step2_01.array;
import java.util.Arrays;
//210330 17:16 ~ 20:19
import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

public class ArrayEx14_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		int player = 0;
		boolean isRun = true;
		int inputNum = 0;
		
		
		System.out.println("현재 캐릭터(2)의 위치를 아래에서 확인하세요!");
		System.out.println(Arrays.toString(game));
		System.out.println();
		
		while(isRun) {
			
			System.out.println("이동 명령을 주세요. (1):왼쪽1칸 / (2):오른쪽1칸");
			inputNum = scan.nextInt();
			
			if(inputNum == 1) {
				for (int i=0; i<7; i++) { 
					if (game[i] == 2) {    // game배열을 0번 인덱스부터 뒤져서 캐릭터 위치를 찾는다.
						player = i;        // 캐릭터 위치 인덱스를 플레이어에 입력한다.
						
						if(i != 0) {
							game[i]=0;			//	원래 캐릭터위치에는 0을 입력한다.(인덱스가 0이 아닌경우)
							game[i-1] = 2;		// 캐릭터위치를 좌측으로 1칸 이동한다.
							System.out.println(Arrays.toString(game));
						}		
						else{
							System.out.println("캐릭터가 -1번위치로 이동하여 종료합니다.");
							System.out.println(Arrays.toString(game));
							isRun = false; 				
						}
					}
				}
			}
			
			
			else if(inputNum == 2) {
				for (int i=6; i>=0; i--) { 
					if (game[i] == 2) {    // game배열을 0번 인덱스부터 뒤져서 캐릭터 위치를 찾는다.
						player = i;        // 캐릭터 위치 인덱스를 플레이어에 입력한다.
						
						if(i != 6) {
							game[i]=0;			//	원래 캐릭터위치에는 0을 입력한다.(인덱스가 0이 아닌경우)
							game[i+1] = 2;		// 캐릭터위치를 우측으로 1칸 이동한다.
							System.out.println(Arrays.toString(game));
						}		
						else{
							System.out.println("캐릭터가 7번위치로 이동하여 종료합니다.");
							System.out.println(Arrays.toString(game));
							isRun = false; 				
						}
					}
				}
			}
			
			
			
			
			
		
		}
		
		
	}
	
}
