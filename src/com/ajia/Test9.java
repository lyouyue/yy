package com.ajia;

public class Test9 {

	public static void main(String[] args) {
       /**
        * 1.1�ۼӵ�3003���ۼ��˶��ٴ�
        * 2.�и�С���100�׵ĸ߶ȵ�������ÿ�η�����ԭ�߶ȵ�һ�룬
        * �ʷ���100�κ����˶��켣�����ף���10�θ߶��Ƕ��٣�
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
			h/=2; //�������ʮ�εĸ���
			h1=h;  
		}
		// ��10�εĸ߶�0.1953125
		System.out.println(h1);
		
		for(int j=0;j<7;j++){
			sum+=h2;
		}
	sum=sum+h1+100;
		System.out.println(sum);
	}
}
