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
						System.out.println("输入不合法");	
						break;		
				}
				System.out.println(getRandom(wx)+" "+h+" "+getRandom(wx)+" =");	
		}		
		
		
	}
	//显示菜单1
	public static String menu1(Scanner input) {
		System.out.println("***************************************************");
		System.out.println("*欢迎进入数学题目自动生成系统；您想进行几位数的练习：(十以内）*");
		System.out.println("***************************************************");
		return input.next();
	}
	//显示菜单2
	public static String menu2(Scanner input) {
		System.out.println("请选择想要练习的类型：\n1.加法\n2.减法\n3.乘法\n4.除法\n5.九九乘法表练习\n");
		return input.next();
	}
	//显示菜单3
	public static String menu3(Scanner input) {
		System.out.println("您想要做多少题");
		return input.next();
	}
	//获取[min到max)之间的一个随机整数
	public static int getRandom(int n) {
			int min = (int)Math.pow(10, n-1);
			int max = (int)Math.pow(10, n);
			int res = new Random().nextInt(max - min + 1) + min;
			return res;
	}
}