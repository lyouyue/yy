package com.ajia;

public class Test5 {

	 /**
	  *  for while 
	  *  
	  *  while 
	  *  
	  *  循环的初始条件;
	  *  while(循环跳出条件){
	  *     // 执行循环的语句
	  *     改变循环的条件;
	  *  }
	  *  do {}while();
	  *  定义：
	  *  循环的初始条件 ;
	  *  do{
	  *     //执行循环的语句
	  *     改变循环的条件
	  *  }while(跳出循环的条件);
	  *  
	  *  while 和 do{} while(); 有什么区别
	  */
	public static void main(String[] args) {
         /*int i= 1; // 定义循环的初始条件
         int sum= 0; // 保存1+...100的值
         do{
        	 sum+=i;  // 求1+100的和
        	 i++ ; // 改变循环的条件
         }while(i<=100);
         System.out.println(sum);*/
		
		/*count();
		start();
		start1();
		start2();
		//start3();
		start4();*/
		
		start5();
		
	//	*
    //  * *
	//  * * *
	//  * * * *
		
		//    *
		//   * *
		//  * * *
		// * * * *
	}
	public  static void count(){
		int i=300; // 定义初始值
		int sum =0;
		do{
			if(i%2==0){
				sum+=i;
			}
			i++;
		}while(i<=400);
		System.out.println(sum);
	}
	 
	public static void start(){
		for(int i=0;i<4;i++){ // 控制行数 
			for(int j=0;j<=i;j++){ // 控制列数
				System.out.print("*"); //输出*
			}
			System.out.println(); // 输出换行
		}
	}
	public static  void start1(){
		int i=0;
		while(i<4){
			for(int j=0;j<=i;j++ ){
				System.out.print("*");
			}
			i++;
			System.out.println();
		}
	}
	public static  void start2(){
		int i=0;
		/*while(i<4){
			for(int j=0;j<=i;j++ ){
				System.out.print("*");
			}
			i++;
			System.out.println();
		}*/
		do{
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
			i++;
		}while(i<4);
	}
	public static  void start3(){
		int i=0;
		int j =0 ;
		do{
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}while(i<4);
	}
	
	public static  void start4(){
		int i=0;
		int j =0 ;
		do{
			do{
				System.out.print("*");
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<4);
	}
	
	public static  void start5(){
		int j=0;
		int i=0;
		for(;i<4;i++){
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
	}
	
	
}
