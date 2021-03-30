package step2_01.array;
import java.util.Arrays;
// 210330 15:57 ~ 16:34
import java.util.Random;

/*
 * # 중복숫자 금지[1단계]
 * 
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 * 
*  예)
 * 랜덤숫자 : 1
 * check = {false , true , false , false , false}
 * arr   = {1, 0, 0, 0, 0}
 * 랜덤숫자 : 3
 * check = {false , true , false , true , false}
 * arr   = {1, 3, 0, 0, 0}
 * 랜덤숫자 : 2
 * check = {false , true , true , true , false}
 * arr   = {1, 3, 2, 0, 0}
 */

public class ArrayEx11_정답 {

	public static void main(String[] args) {
	
		Random ran  = new Random(); 
		int num = 0;
		
		boolean[] check = new boolean[5];
		int[] arr   = new int[5];
		
		
		for(int i=0; i<arr.length; i++) {
			
			num = ran.nextInt(5);
			
			if(check[num] == false) {
				arr[i] = num;
				check[num] = true;
			}
			else {
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
