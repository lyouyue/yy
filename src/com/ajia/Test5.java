package com.ajia;

public class Test5 {

	 /**
	  *  for while 
	  *  
	  *  while 
	  *  
	  *  ѭ���ĳ�ʼ����;
	  *  while(ѭ����������){
	  *     // ִ��ѭ�������
	  *     �ı�ѭ��������;
	  *  }
	  *  do {}while();
	  *  ���壺
	  *  ѭ���ĳ�ʼ���� ;
	  *  do{
	  *     //ִ��ѭ�������
	  *     �ı�ѭ��������
	  *  }while(����ѭ��������);
	  *  
	  *  while �� do{} while(); ��ʲô����
	  */
	public static void main(String[] args) {
         /*int i= 1; // ����ѭ���ĳ�ʼ����
         int sum= 0; // ����1+...100��ֵ
         do{
        	 sum+=i;  // ��1+100�ĺ�
        	 i++ ; // �ı�ѭ��������
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
		int i=300; // �����ʼֵ
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
		for(int i=0;i<4;i++){ // �������� 
			for(int j=0;j<=i;j++){ // ��������
				System.out.print("*"); //���*
			}
			System.out.println(); // �������
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
