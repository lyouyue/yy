package com.ajia;

public class Test3 {

	public static void main(String[] args) {
		/**
		 * ����������
		 *  ����������ͬ�������������������Ͳ�ͬ���������Ͳ�ͬ
		 *  �������������ء�
		 */
		print();
		print(1);
		print(1.1);
		print(1.2,2);
		print(12.0,12.1);
	}
	
	public static void print(){
		System.out.println("�������ڣ����߱���");
	}
	public static void print(int a){
		System.out.println("���ǹ�ȥ����Ϊ���£������������"
				+ "�������߹���·���������飬��������");
	}
	public static void print(double a){
		System.out.println("תɽתˮת����,һ·�C������Ϊ�޷�"
				+ "ֻԸ��ס����������Ѱ��ѩ�����������ֻԸ������������ͷ��"
				+ "����һ��������������������");
	}
	public static void print(double a,double b){
		System.out.println("��Ϊ������������Ծ�������ܾ�");
	}
	public static double print(double a,int b){
		System.out.println("���䰲��˫ȫ������������������");
		return 0.0;
	}
}
