package com.ajia;

import java.util.Scanner;

public class Test4 {

	 /**
	  * 运算符
	  *  运算符  + - * / =(赋值) ==(判断值相等) 、！=（不等于）
	  *  &&(且) ||(或) !(非)  %(求余) += -+ ...  ++ --
	  *  > ,< ,>=, <=  <> !=
	  * @param args
	  */
	public static void main(String[] args) {
	   // 逻辑运算符
		// &&(且)两个同时成立 true  ||(或)只要有个是true  !(非) 整体取反 false true 
		// 从控制输入一个数,判断它既能3 5。
		// 从控制台输入一个数,判断它既能被3整除又能5整除，或者是偶数。
		
		 //isNumber();
		 isNumber2();
	}
	
	public static void  isNumber(){
		// 检测键盘的输入
		Scanner scan = new  Scanner(System.in); 
		int  number = scan.nextInt(); // 获取键盘的输入值
		if(number%3==0&&number%5==0){
			System.out.println(number+"能被3和5整除");
		}else{
			System.out.println(number+"不能被3和5整除");
		}
	}
	
	public static void  isNumber2(){
		// 检测键盘的输入
		Scanner scan = new  Scanner(System.in); 
		int  number = scan.nextInt(); // 获取键盘的输入值
		if((number%3==0&&number%5==0)||number%2==0){
			System.out.println(number+"能被3和5整除,或者是偶数");
		}else{
			System.out.println(number+"不能被3和5整除,或者是偶数");
		}
	}

}
