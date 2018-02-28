package com.ajia;

public class Test3 {

	public static void main(String[] args) {
		/**
		 * 方法的重载
		 *  方法名称相同，参数个数，参数类型不同，返回类型不同
		 *  叫做方法的重载。
		 */
		print();
		print(1);
		print(1.1);
		print(1.2,2);
		print(12.0,12.1);
	}
	
	public static void print(){
		System.out.println("天涯犹在，不诉薄凉");
	}
	public static void print(int a){
		System.out.println("凡是过去，皆为序章，你现在气质里，"
				+ "藏着你走过的路，读过的书，爱过的人");
	}
	public static void print(double a){
		System.out.println("转山转水转佛塔,一路藽见，不为修佛，"
				+ "只愿入住布达拉宫，寻觅雪域中最大王，只愿流浪在拉萨街头，"
				+ "和你一样，我是世间最美情郎");
	}
	public static void print(double a,double b){
		System.out.println("因为遇见你很晚，所以决定爱你很久");
	}
	public static double print(double a,int b){
		System.out.println("世间安得双全法，不负如来不负卿");
		return 0.0;
	}
}
