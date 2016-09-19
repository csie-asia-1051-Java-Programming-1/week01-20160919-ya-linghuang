package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a，程式 計算 a 平方根並輸出 (請使用 Math.sqrt(a) 工具)
 * Date: 2016/09/19
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex04_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入數字a，程式將計算a的平方根: ");
		Scanner scn = new Scanner(System.in);
		float a=scn.nextFloat();
		System.out.println("答案為"+Math.sqrt(a));
	}

}
