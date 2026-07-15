package com.examples;

public class harshadNum {
	
	public boolean isHarshad(int num) {
		if(num<=0) {
			return false;
		}
		 int original=num;
		int sum=0;
		while(num!=0) {
			int digit=num%10;
			sum+=digit;
			num=num/10;
		}
         return	num%sum==0;
		
	}
	public static void main(String[] args) {
		harshadNum obj=new harshadNum();
		boolean result=obj.isHarshad(18);
		System.out.print(result?"harshad Number":"!harshad number");
	}


}
