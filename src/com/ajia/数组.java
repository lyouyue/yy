package com.ajia;

import java.util.Arrays;
import java.util.Random;

public class ���� {
	public static int[] create(int x){
		int[] arr=new int[x];
		Random ran=new Random(); //�������������
		//���²����� [0,100)  0-99�е�����һ������
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ran.nextInt(100); //���������
		}
		return arr;
	}
	//дһ���������ķ���print
	public static void shuchu(int[] k){
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i]+" "); //��ӿո� �ָ�����
		}
		System.out.println("�������");
	}
	
	
	public static void main(String[] args) {
		int[] a=create(7); 
		//Arrays.toString(��������) ����������� 
		//System.out.println(Arrays.toString(a));
		//shuchu(a);
		
		//������������������е����ֵ�����
		//������������������е���Сֵ�����
		//�����������������Ԫ��֮�Ͳ����
		
		//����Сֵ
		int[] b={10,45,21,54,45,6};
		int min=b[0];
		for(int i=0;i<b.length;i++){
			//min=min<b[i]?min:b[i];
			if(min>b[i]){ 
				min=b[i];
			}
		}
		System.out.println("��СֵΪ"+min);
		
		
	}

}
