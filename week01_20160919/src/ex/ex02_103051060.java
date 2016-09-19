package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入體重(公斤)進行轉換: ");
		Scanner scn = new Scanner(System.in);
		float x=scn.nextFloat();
		float y=x*(100000f/45359f);
		System.out.println("體重(磅)為:  "+ y);
	}

}
