package step2_01.array;

//210402 09:00 ~

import java.util.Scanner;

/* 
 * # 틱택토
 * 
 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
 * 
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

public class ArrayEx17_정답_미완_______________________________________________________ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isRun = true;
		
		int p1 = -1;
		int p2 = -1;
				
		int[] game = new int[9];
		String[] games = new String[9];
		boolean[] isLocked = new boolean[9];
		int turn = 1;
		
		for(int i=0; i<games.length; i++) {
			games[i] = "[ ]";
		}


		while(isRun) {
			if(turn == 1) {
				while(true) {
					System.out.print("[p1]인덱스 입력 : ");
					p1 = scan.nextInt();						
					if((p1 < 0 || p1 > games.length-1)) {
						System.out.println("범위 밖 번호. 재입력 요청");
					}
					else {
						if(isLocked[p1] == true) {
							System.out.println("이미 입력된 자리. 재입력 요청");
						}
						else break;
					}
				}
					for(int i=0; i<games.length; i++) {
						if(p1 == i) {
							games[i] = "[O]";
							System.out.print(games[i]);
							isLocked[i] = true;
						}			
						else {
							games[i] = games[i];
							System.out.print(games[i]);
						}
						if((i+1) % 3 == 0) {
							System.out.println();
						}
					}
					System.out.println();
					turn = 2;
			}
			
			//가로
			for(int i=0; i<9; i+=3) {
				if(games[i] == "[O]" && games[i+1] == "[O]" && games[i+2] == "[O]") {
					System.out.println("p1 Win"); 
					isRun = false;
				}
				else if(games[i] == "[X]" && games[i+1] == "[X]" && games[i+2] == "[X]") {
					System.out.println("p2 Win"); 
					isRun = false;			
				}
			}
			
			//세로
			for(int i=0; i<9; i+=3) {
				if(games[i] == "[O]" && games[i+3] == "[O]" && games[i+6] == "[O]") {
					System.out.println("p1 Win"); 
					isRun = false;
				}
				else if(games[i] == "[X]" && games[i+3] == "[X]" && games[i+6] == "[X]") {
					System.out.println("p2 Win"); 
					isRun = false;
				}
			}
			//대각
			if(games[0] == "[O]" && games[4] == "[O]" && games[8] == "[O]") {
				System.out.println("p1 Win"); 
				isRun = false;
			}
			if(games[0] == "[X]" && games[4] == "[X]" && games[8] == "[X]") {
				System.out.println("p2 Win"); 
				isRun = false;
			}
			if(games[2] == "[O]" && games[4] == "[O]" && games[6] == "[O]") {
				System.out.println("p1 Win"); 
				isRun = false;
			}
			if(games[2] == "[X]" && games[4] == "[X]" && games[6] == "[X]") {
				System.out.println("p2 Win"); 
				isRun = false;
			}
			
			
			
			
			if(turn == 2) {
				while(true) {
					System.out.print("[p2]인덱스 입력 : ");
					p2 = scan.nextInt();						
					if((p2 < 0 || p2 > games.length-1)) {
						System.out.println("범위 밖 번호. 재입력 요청");
					}
					else {
						if(isLocked[p2] == true) {
							System.out.println("이미 입력된 자리. 재입력 요청");
						}
						else break;
					}
				}
				for(int i=0; i<games.length; i++) {
					if(p2 == i) {
						games[i] = "[X]";
						System.out.print(games[i]);
						isLocked[i] = true;
					}			
					else {
						games[i] = games[i];
						System.out.print(games[i]);
					}
					if((i+1) % 3 == 0) {
						System.out.println();
					}
				}
				System.out.println();
				turn = 1;
			}
			//가로
			for(int i=0; i<9; i+=3) {
				if(games[i] == "[O]" && games[i+1] == "[O]" && games[i+2] == "[O]") {
					System.out.println("p1 Win"); 
					isRun = false;
				}
				else if(games[i] == "[X]" && games[i+1] == "[X]" && games[i+2] == "[X]") {
					System.out.println("p2 Win"); 
					isRun = false;			
				}
			}
			
			//세로
			for(int i=0; i<9; i+=3) {
				if(games[i] == "[O]" && games[i+3] == "[O]" && games[i+6] == "[O]") {
					System.out.println("p1 Win"); 
					isRun = false;
				}
				else if(games[i] == "[X]" && games[i+3] == "[X]" && games[i+6] == "[X]") {
					System.out.println("p2 Win"); 
					isRun = false;
				}
			}
			//대각
			if(games[0] == "[O]" && games[4] == "[O]" && games[8] == "[O]") {
				System.out.println("p1 Win"); 
				isRun = false;
			}
			if(games[0] == "[X]" && games[4] == "[X]" && games[8] == "[X]") {
				System.out.println("p2 Win"); 
				isRun = false;
			}
			if(games[2] == "[O]" && games[4] == "[O]" && games[6] == "[O]") {
				System.out.println("p1 Win"); 
				isRun = false;
			}
			if(games[2] == "[X]" && games[4] == "[X]" && games[6] == "[X]") {
				System.out.println("p2 Win"); 
				isRun = false;
			}
			
			
		
		}
		scan.close();

		
		    // * [X][X][O]
		    // * [ ][O][ ]
			// * [O][ ][ ]			
		      			
			//가로검사
			
	
	}
}
