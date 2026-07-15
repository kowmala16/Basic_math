package com.examples;

public class perfectNUm {
	public boolean isPerfect(int num) {
		if(num<=0) {
			return false;
		}
		int sum=0;
		int original=num;
		for (int i=1;i<num;i++) {
			if(num%i==0) {
			sum+=i;
			}
		}
		return original==sum;
	}
	
	
	
	public static void main(String[] args) {
		perfectNUm obj=new perfectNUm();
		boolean result=obj.isPerfect(28);
		System.out.print(result?"perfect Number":"!perfect Number");
	}

}
