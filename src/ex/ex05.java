package ex;
/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/24
 * Author: 1050210XX 周永振老師
 */

import java.util.Random;
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		for(int x=1;x<=10;x++){
	        for(int y=1;y<=10;y++){
	        	System.out.print(r.nextInt(9));
	        }
	        System.out.println();
	        }

	}

}
