package com.ajia;

import java.util.Scanner;

public class Test4 {

	 /**
	  * �����
	  *  �����  + - * / =(��ֵ) ==(�ж�ֵ���) ����=�������ڣ�
	  *  &&(��) ||(��) !(��)  %(����) += -+ ...  ++ --
	  *  > ,< ,>=, <=  <> !=
	  * @param args
	  */
	public static void main(String[] args) {
	   // �߼������
		// &&(��)����ͬʱ���� true  ||(��)ֻҪ�и���true  !(��) ����ȡ�� false true 
		// �ӿ�������һ����,�ж�������3 5��
		// �ӿ���̨����һ����,�ж������ܱ�3��������5������������ż����
		
		 //isNumber();
		 isNumber2();
	}
	
	public static void  isNumber(){
		// �����̵�����
		Scanner scan = new  Scanner(System.in); 
		int  number = scan.nextInt(); // ��ȡ���̵�����ֵ
		if(number%3==0&&number%5==0){
			System.out.println(number+"�ܱ�3��5����");
		}else{
			System.out.println(number+"���ܱ�3��5����");
		}
	}
	
	public static void  isNumber2(){
		// �����̵�����
		Scanner scan = new  Scanner(System.in); 
		int  number = scan.nextInt(); // ��ȡ���̵�����ֵ
		if((number%3==0&&number%5==0)||number%2==0){
			System.out.println(number+"�ܱ�3��5����,������ż��");
		}else{
			System.out.println(number+"���ܱ�3��5����,������ż��");
		}
	}

}
