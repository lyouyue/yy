package com.ajia;

public class Test1 {

	public static void main(String[] args) {
		// 简化的静态初始化赋值
		/*char c[] = { 'A', 'B', 'C' };
		
		//char  []data = new char[3];
		// 静态初始化
		char  []data = new char[]{'A', 'B', 'C' };
		// 数组的下标是从零开始
		data[0]='A';
		data[1]='B';
		data[2]='C';
		// 数组名称.length  获取数组的长度
		for (int j = 0; j < data.length; j++) {
			System.out.println(data[j]);
		}*/
		
		// while 
		
		//whileMeth();
		//whileMeth1();
		//forMeth1();
	//	chengji();
		whilecj();
	}
   
	/**
	 * 数组的定义
	 *  数据类型   数组名称[]=new  数据类型[数组的长度];
	 *   数据类型   []数组名称=new  数据类型[数组的长度];
	 *  分步式
	 *   声明数组
	 *    数据类型  数组名称[] = null;
	 *   开辟数组空间
	 *     数组名称=new 数组类型[];
	 * 静态初始化
	 *    数据类型   []数组名称=new  数据类型[]{值,值,...};
	 *  简化静态初始化
	 *    数据类型  []数组名称 ={值,值,值,...};
	 *    
	 *    for(循环的初始条件;循环的结束条件;改变循环的条件){
	 *       // 执行循环的语句
	 *    }
	 *    
	 *    while 循环
	 *    
	 *    循环的初始条件;
	 *    while(循环的跳出条件){
	 *       // 执行循环的语句
	 *       改变循环的条件；
	 *    }
	 *    
	 *    方法的定义
	 *    public static void 方法名称(参数类型  参数 ,参数类型  参数 ,...){
	 *      // 执行方法的语句;
	 *    }
	 *    
	 *    88.8,56.4,98,60,96.0,56.2,12.6,77.7,88.9,66.5
	 *    56.2,12.6,77.7,88.9,66.5
	 *    计算出总成绩，平均成绩，最高成绩，最小成绩 ，
	 *    分别写出最大最小成绩的下标
	 *    
	 *    
	 *    
	 */
	
	public static void whileMeth(){
		 char data[] ={ 'A', 'B', 'C' };
		 int i=0; //循环的初始条件
		 while(i<data.length){ // 跳出循环的条件
			 System.out.println(data[i]);
			 i++; // 改变循环的条件
		 }
	}
	
	
	public static void whileMeth1(){
		 char data[] ={ 'A', 'B', 'C' };
		 int i=data.length-1; //循环的初始条件
		 while(i>=0){ // 跳出循环的条件
			 System.out.println(data[i]);
			 i--; // 改变循环的条件
		 }
	}
	
	public static void forMeth1(){
		 char data[] ={ 'A', 'B', 'C' };
		  for(int i=data.length-1;i>=0;i--){
			  System.out.println(data[i]);
		  }
	}
	
	public  static void chengji(){
		// 定义存储学生的成绩
		double data[]={88.8,56.4,98,60,96.0,56.2,12.6,77.7,88.9,66.5};
		double sum =0;//定义求总成绩
		double max = data[0]; // 定义最大成绩
		int maxflag =0; // 定义最大成绩下标
		int minflag=0; // 定义最小成绩下标
		double  min =data[0]; //定义最小成绩
		for(int i=0;i<data.length;i++){
			// sum+(-,/,*)=data[i] 等价于 sum=sum+(-,/,*)data[i];
			sum+=data[i];
			if(max<data[i]){ // 比最大成绩还大，
				max=data[i]; // 赋值给最大值
				maxflag=i; 
			}
			if(min>data[i]){ // 比最小成绩还小
				min=data[i];
				minflag=i;
			}
		}
		System.out.println("总成绩："+sum);
		System.out.println("平均成绩："+sum/data.length);
		System.out.println("最大成绩："+max+"它的位置是："+maxflag);
		System.out.println("最小成绩："+min+"它的位置是："+minflag);
	}
	
	public  static void whilecj(){
		// 定义存储学生的成绩
		// 从大到小的排序
		double data[]={88.8,56.4,98,60,96.0,56.2,12.6,77.7,88.9,66.5};
		double sum =0;//定义求总成绩
		double max = data[0]; // 定义最大成绩
		int maxflag =0; // 定义最大成绩下标
		int minflag=0; // 定义最小成绩下标
		double  min =data[0]; //定义最小成绩
		int i=0; // 循环的初始条件
		while(i<data.length){ // 跳出循环的条件
			// sum+(-,/,*)=data[i] 等价于 sum=sum+(-,/,*)data[i];
			sum+=data[i];
			if(max<data[i]){ // 比最大成绩还大，
				max=data[i]; // 赋值给最大值
				maxflag=i; 
			}
			if(min>data[i]){ // 比最小成绩还小
				min=data[i];
				minflag=i;
			}
			i++; //改变循环的条件
		}
		System.out.println("总成绩："+sum);
		System.out.println("平均成绩："+sum/data.length);
		System.out.println("最大成绩："+max+"它的位置是："+maxflag);
		System.out.println("最小成绩："+min+"它的位置是："+minflag);
		
	}
}
