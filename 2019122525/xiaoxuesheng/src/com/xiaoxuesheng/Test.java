package com.xiaoxuesheng;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int wx = Integer.parseInt(menu1(input));
		int fh = Integer.parseInt(menu2(input));
		int sl = Integer.parseInt(menu3(input));
			
		String h = " ";
			
		for(int i=0;i<sl;i++) {
			switch(fh) {
					case 1:
						h = "+";
						break;		
					case 2:	
						h = "-";	
						break;	
					case 3:	
						h = "*";	
						break;	
					case 4:	
						h = "/";	
						break;	
					case 5:
						wx = 1;
						h = "*";
						int x = getRandom(wx);
						System.out.println(x+" "+h+" "+x+" =");
						continue;
					default:	
						System.out.println("���벻�Ϸ�");	
						break;		
				}
				System.out.println(getRandom(wx)+" "+h+" "+getRandom(wx)+" =");	
		}		
		
		
	}
	//��ʾ�˵�1
	public static String menu1(Scanner input) {
		System.out.println("***************************************************");
		System.out.println("*��ӭ������ѧ��Ŀ�Զ�����ϵͳ��������м�λ������ϰ��(ʮ���ڣ�*");
		System.out.println("***************************************************");
		return input.next();
	}
	//��ʾ�˵�2
	public static String menu2(Scanner input) {
		System.out.println("��ѡ����Ҫ��ϰ�����ͣ�\n1.�ӷ�\n2.����\n3.�˷�\n4.����\n5.�žų˷�����ϰ\n");
		return input.next();
	}
	//��ʾ�˵�3
	public static String menu3(Scanner input) {
		System.out.println("����Ҫ��������");
		return input.next();
	}
	//��ȡ[min��max)֮���һ���������
	public static int getRandom(int n) {
			int min = (int)Math.pow(10, n-1);
			int max = (int)Math.pow(10, n);
			int res = new Random().nextInt(max - min + 1) + min;
			return res;
	}
}