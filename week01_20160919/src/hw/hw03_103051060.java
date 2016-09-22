package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 * Date: 2016/09/19
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入6個數(可有小數),將四捨五入取最小值: ");
		Scanner scn = new Scanner(System.in);
		float v1= scn.nextFloat();
		float v2= scn.nextFloat();
		float v3= scn.nextFloat();
		float v4= scn.nextFloat();
		float v5= scn.nextFloat();
		float v6= scn.nextFloat();
		int fin;
		fin=Math.round(Math.min(v1,v2));
		fin=Math.round(Math.min(fin,v3));
		fin=Math.round(Math.min(fin,v4));
		fin=Math.round(Math.min(fin,v5));
		fin=Math.round(Math.min(fin,v6));
		System.out.println("最小值為: "+fin);
	}

}
