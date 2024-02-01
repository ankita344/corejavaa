package corejavaa;

public class swap2no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//logic 1 with using third variable
		int a=20,b=40;
		System.out.println("Before swapping a no :"+a+" "+b);
		/*int t=a;
		a=b;
		b=t;*/
		//logic 2 without using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a no:"+a+" "+b);
	}

}
