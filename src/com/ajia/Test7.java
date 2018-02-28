package com.ajia;

public class Test7 {

	public static void main(String[] args) {
        /**
         * 定义二维数组
         *   数据类型  数组名称 [][] = new 数据类型[行长度][列的长度];
         *   数据类型  [][]数组名称  = new 数据类型[行长度][列的长度];
         *  静态初始化
         *    数据类型   数组名称[][]=
         *    new 数据类型[][]{{值,值,值,...},{值,值,值,...},{值,值,值,...}};
         *  简化静态初始化
         *      数据类型   数组名称[][]={{值,值,值,...},{值,值,值,...},{值,值,值,...}};
         */
		int datas [] = {23,45,46,47,48};
		int  data[][] = new int[][]{
			{45,12,65},
			{89,45},
			{23,2,7}
			};
			// 获取数组的长度 行的行数  data.length
	   for(int i=0;i<data.length;i++){ // 控制的行
		   // data[i].length 列的数组长度
		   for(int j=0;j<data[i].length;j++){ //控制列的数
			   System.out.println(data[i][j]);
		   }
	   }
	}

}
