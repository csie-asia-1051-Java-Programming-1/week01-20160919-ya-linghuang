package hw;
/*
 * Topic: 假設我們要用二進制來表示 n 種狀態，請寫一個程式來計算記錄這 n 種狀態需要多少位元 (例如: n = 3 則需要 2bits)  (log(n)/log(2))
 * Date: 2016/09/19
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("二進制紀錄n種狀態需要多少位元，請輸入n: ");
		Scanner scn = new Scanner(System.in);
		float n=scn.nextFloat();
		System.out.println("答案為: "+Math.ceil(Math.log(n)/Math.log(2))+"bit");
	}

}
