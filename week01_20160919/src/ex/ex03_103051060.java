package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a 與 b，程式 計算 a 的 b 次方後輸出結果 (請使用 Math.pow(a,b) 工具)
 * Date: 2016/09/19
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入數字a與b，程式將計算a的b次方: ");
		Scanner scn = new Scanner(System.in);
		float a=scn.nextFloat();
		float b=scn.nextFloat();
		System.out.println("答案為"+Math.pow(a, b));
	}

}
