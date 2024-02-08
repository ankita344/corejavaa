package corejavaa;

public class countANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num =1234;
int count=0;
while(num>0) {
	num=num/10;
	count++;
}
System.out.println("count a number:"+count);
	}

}
