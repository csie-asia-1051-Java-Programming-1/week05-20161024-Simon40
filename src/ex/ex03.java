﻿package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021060 陳俊仁
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        double sum=0;
        for(double i=0;i<=n;i++){
        	double c=(double)Math.pow(i,2);
        	sum=sum+c;
        }
        System.out.println(sum);
	}

}
