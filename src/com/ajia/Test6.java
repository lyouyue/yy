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
		int line =4 ;// 定义要输出的星星的行数
		for(int i=0;i<line;i++){ // 控制的是她的行数
			for(int y=i;y<line;y++){ // 控制列   控制的是空白的输出
				System.out.print(" "); 
			}
			for(int x=0;x<=i;x++){ // 控制星星的输出
				System.out.print(" *"); // 输出星星
			}
			System.out.println(); // 换行
		}
	}
	// 9,99,999,9999,99999 .... 三种方法
}
