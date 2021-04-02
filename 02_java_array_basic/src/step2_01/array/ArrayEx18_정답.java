package step2_01.array;
import java.util.Arrays;
//210402 16:12 ~ 
import java.util.Scanner;

/*
 * # 미니마블
 * 
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 1p는 사용자가 1~3 사이의 숫자를 입력해 이동하고 2p는 랜덤값으로 1~3값으로 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 *    
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p1사용자]1~3 입력 : 3 
 *
 *  1 2 3 4 5 6 7 8  
 *  0 0 0 1 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p2컴퓨터] : 3
 *  [p2컴퓨터]가 p1을 잡았다! 
 *  
 *  1 2 3 4 5 6 7 8 
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  0 0 0 2 0 0 0 0  [0바퀴]
 * [p1사용자]1~3 입력 : 
 *
 *
 *
 */

public class ArrayEx18_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		boolean isRun = true;
		
		int turn = 0;
		
		int addJump1 = 0;
		int addJump2 = 0;
				
		int idx1 = 0;	int idx2 = 0;
		p1[idx1] = 1;	p2[idx2] = 2;
		int tempIdx = 0;
		
		int win1 = 0;	int win2 = 0;					
		
		while(isRun) {
			System.out.println(Arrays.toString(game));
			System.out.println(Arrays.toString(p1));
			System.out.println(Arrays.toString(p2));
			
			System.out.print("[p1사용자]1~3 입력 :");
			addJump1 = scan.nextInt();
			
			tempIdx = idx1; 
			idx1 += addJump1;
			
			if(idx1 < 8) {
				p1[idx1] = 0;
				idx1 += addJump1;
				addJump1 = 0;
				p1[idx1] = 1;
			}
			
			else if(idx1 > 8) {
				addJump1 = idx1 - 8;
				idx1 = 0 + addJump1;
				addJump1 = 0;
				p1[idx1] = 1;
				win1++;
			}
			System.out.println(win1);
			
		}
		scan.close();
	}
}
