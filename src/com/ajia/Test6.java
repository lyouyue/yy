package com.ajia;

public class Test6 {

	public static void main(String[] args) {
		//    *
		//   * *
		//  * * *
		// * * * *
		//  * * *
		//   * *
		//    *
		start();
	}
	public  static void start(){
		int line =4 ;// ����Ҫ��������ǵ�����
		for(int i=0;i<line;i++){ // ���Ƶ�����������
			for(int y=i;y<line;y++){ // ������   ���Ƶ��ǿհ׵����
				System.out.print(" "); 
			}
			for(int x=0;x<=i;x++){ // �������ǵ����
				System.out.print(" *"); // �������
			}
			System.out.println(); // ����
		}
	}
	// 9,99,999,9999,99999 .... ���ַ���
}
