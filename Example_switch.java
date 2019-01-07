package com.kh.myexample;

import java.util.Random;
import java.util.Scanner;

public class Example_switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("<<<<<<<<<<<욱이M 변신 뽑기>>>>>>>>>>> \n1~10을 입력하시면 랜덤으로 변신 아이템이 등장합니다 :");	
		int num = sc.nextInt();	
		
		int random = new Random().nextInt(10)+1 ;
		int get = 0;
		if(num == random) {
			get = 2;
		}else {
			get = 1; }
		
		
	switch(get) {
	case 1 : System.out.println("변신 아이템을 획득하지 못하였습니다."); break;
	case 2 : System.out.println("변신 아이템 획득"); break;
		}
		
		
	}

}
