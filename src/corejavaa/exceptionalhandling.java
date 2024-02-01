package corejavaa;

public class exceptionalhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int [3];
		try {
			System.out.println(a[4]);
		}
			catch(ArrayIndexOutOfBoundExecption e) {
				System.out.println("error ayya tha");
				System.out.println(e.getLocializedMessage());
			}
		
		System.out.println("nichee ke line");

	}

}
