package com.ajia;

import java.util.Arrays;
import java.util.Random;

public class 数组 {
	public static int[] create(int x){
		int[] arr=new int[x];
		Random ran=new Random(); //产生随机数对象
		//含下不含上 [0,100)  0-99中的任意一个整数
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ran.nextInt(100); //产生随机数
		}
		return arr;
	}
	//写一个输出数组的方法print
	public static void shuchu(int[] k){
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i]+" "); //添加空格 分割数组
		}
		System.out.println("输出结束");
	}
	
	
	public static void main(String[] args) {
		int[] a=create(7); 
		//Arrays.toString(数组名称) 输出数组内容 
		//System.out.println(Arrays.toString(a));
		//shuchu(a);
		
		//在主函数中求出数组中的最大值并输出
		//在主函数中求出数组中的最小值并输出
		//在主函数中求出数组元素之和并输出
		
		//求最小值
		int[] b={10,45,21,54,45,6};
		int min=b[0];
		for(int i=0;i<b.length;i++){
			//min=min<b[i]?min:b[i];
			if(min>b[i]){ 
				min=b[i];
			}
		}
		System.out.println("最小值为"+min);
		
		
	}

}
