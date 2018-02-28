package com.ajia;

public class Test2 {

	public static void main(String[] args) {
		//copyData();
		copyData1();
	}
	
	// 倒着输出
	public static void copyData(){
		int data[] = {12,13,14,15,56,23,78,89,45,25};
		int []copydata = new int[data.length]; // 保存的上面的数组
		int i=0; // 循环的初始条件
	    while(i<data.length){
	    	copydata[i]=data[i];
	    	i++;
	    }
	    // ArrayIndexOutofBoundesException 超出边界异常
	    // Array 数组  index 索引  out 在...外     Boundes 边界   Exception 异常
	    for(int j=0;j<copydata.length;j++){
	    	System.out.println(copydata[j]);
	    }
	}
	
	// 倒着输出
		public static void copyData1(){
			int data[] = {12,13,14,15,56,23,78,89,45,25};
			int []copydata = new int[data.length]; // 保存的上面的数组
			int i=0; // 循环的初始条件
		    while(i<data.length){
		    	copydata[i]=data[i];
		    	i++;
		    }
		    // ArrayIndexOutofBoundesException 超出边界异常
		    // Array 数组  index 索引  out 在...外     Boundes 边界   Exception 异常
		    for(int j=copydata.length-1;j>=0;j--){
		    	System.out.println(copydata[j]);
		    }
		}

}
