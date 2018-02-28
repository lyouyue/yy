package com.ajia;

public class Test9 {

	public static void main(String[] args) {
       /**
        * 1.1累加到3003共累加了多少次
        * 2.有个小球从100米的高度掉下来，每次反弹回原高度的一半，
        * 问反弹100次后，球运动轨迹多少米？第10次高度是多少？
        * 
        */
		shu();
		qiu();
	}
	
	public static void shu(){
		int sum =0;
		int flag=0;
		for(int i=1;;i++){
			sum+=i;
			if(sum==3003){
				flag=i;
				break;
			}
		}
		System.out.println(flag);
	}

	 
	public static void qiu(){
		double h=100;
		double h2=100;
		double h1=0.0;
		double sum =0.0;
		for(int i=0;i<9;i++){
			h/=2; //计算出第十次的告诉
			h1=h;  
		}
		// 第10次的高度0.1953125
		System.out.println(h1);
		
		for(int j=0;j<7;j++){
			sum+=h2;
		}
	sum=sum+h1+100;
		System.out.println(sum);
	}
}
