package com.ajia;

public class Test2 {

	public static void main(String[] args) {
		//copyData();
		copyData1();
	}
	
	// �������
	public static void copyData(){
		int data[] = {12,13,14,15,56,23,78,89,45,25};
		int []copydata = new int[data.length]; // ��������������
		int i=0; // ѭ���ĳ�ʼ����
	    while(i<data.length){
	    	copydata[i]=data[i];
	    	i++;
	    }
	    // ArrayIndexOutofBoundesException �����߽��쳣
	    // Array ����  index ����  out ��...��     Boundes �߽�   Exception �쳣
	    for(int j=0;j<copydata.length;j++){
	    	System.out.println(copydata[j]);
	    }
	}
	
	// �������
		public static void copyData1(){
			int data[] = {12,13,14,15,56,23,78,89,45,25};
			int []copydata = new int[data.length]; // ��������������
			int i=0; // ѭ���ĳ�ʼ����
		    while(i<data.length){
		    	copydata[i]=data[i];
		    	i++;
		    }
		    // ArrayIndexOutofBoundesException �����߽��쳣
		    // Array ����  index ����  out ��...��     Boundes �߽�   Exception �쳣
		    for(int j=copydata.length-1;j>=0;j--){
		    	System.out.println(copydata[j]);
		    }
		}

}
