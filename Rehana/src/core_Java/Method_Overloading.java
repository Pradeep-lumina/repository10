package core_Java;

public class Method_Overloading {
	
	public void add(int a) {
		//int a=5;
		int b=5;
		int c = a+b;
		System.out.println("The value of c is :"+c);
		
	}
	
	public void add(int x, int y) {
		//int x=5;
		//int y=5;
		int z = x+y;
		System.out.println("The value of z is :"+z);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_Overloading obj = new Method_Overloading();
		obj.add(5);
		obj.add(5, 5);

	}

}
