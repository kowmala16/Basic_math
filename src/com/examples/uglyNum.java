package com.examples;

public class uglyNum {
	
	public boolean isUgly(int num) {
		if(num<=0) {
			return false;
		}
		while(num%2==0) {
			num=num/2;
		}
		while(num%3==0) {
			num=num/3;
		}
		while(num%5==0) {
			num=num/5;
		}
		return num==1;
	} 

	public static void main(String[] args) {
		uglyNum obj=new uglyNum();
		boolean result=obj.isUgly(30);
		System.out.print(result?"Ugly Number":"!Ugly number");
	}

}
