package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
 * Date: 2016/09/19
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
import java.util.Random;
public class hw02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入n(將產生6個介於 1~n 之間的亂數): ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Random rnd = new Random();
		int v1 = rnd.nextInt(n)+1;
		int v2 = rnd.nextInt(n)+1;
		int v3 = rnd.nextInt(n)+1;
		int v4 = rnd.nextInt(n)+1;
		int v5 = rnd.nextInt(n)+1;
		int v6 = rnd.nextInt(n)+1;
		System.out.print("亂數為："+v1+"\t"+v2+"\t"+v3+"\t"+v4+"\t"+v5+"\t"+v6);
		
			
		
		/*for (int i = 1; i < 7; i++) {
			int fin = rnd.nextInt(n)+1;
			System.out.print(fin);
			}*/		
		
	}

}
