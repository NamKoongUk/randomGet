package com.kh.myexample;

import java.util.Random;
import java.util.Scanner;

public class Example_switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("<<<<<<<<<<<����M ���� �̱�>>>>>>>>>>> \n1~10�� �Է��Ͻø� �������� ���� �������� �����մϴ� :");	
		int num = sc.nextInt();	
		
		int random = new Random().nextInt(10)+1 ;
		int get = 0;
		if(num == random) {
			get = 2;
		}else {
			get = 1; }
		
		
	switch(get) {
	case 1 : System.out.println("���� �������� ȹ������ ���Ͽ����ϴ�."); break;
	case 2 : System.out.println("���� ������ ȹ��"); break;
		}
		
		
	}

}
