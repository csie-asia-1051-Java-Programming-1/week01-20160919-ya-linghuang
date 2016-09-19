package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入華氏溫度進行轉換: ");
		Scanner scn = new Scanner(System.in);
		float x=scn.nextFloat();
		float y= (x-32)*5/9;
		System.out.println("攝氏溫度為:  "+ y +"度");
	}

}
