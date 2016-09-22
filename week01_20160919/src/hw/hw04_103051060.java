package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 a 與 b, 程式輸出 a 開 b 次方後的結果，例如 9.0 開 3次方 結果為 2.080083823051904
 * Date: 2016/09/19
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw04_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入a與b(程式將輸出a開b次方後的結果): ");
		Scanner scn = new Scanner(System.in);
		double a = scn.nextFloat();
		double b = scn.nextFloat();
		
		System.out.println("結果為: "+Math.pow(a, 1/b));
	}

}
