package com.ajia;

public class Add {
	public static void hh(){
		double height=100;
		double h=100;
		for (int i = 1; i <=3; i++) {
		height-=height/2;
		h+=height*2;
		
		System.out.println(height);
		}System.out.println(h);
	}
	public static void main(String[] args) {	
		hh();
	}
}
