package Dz;

public class Drob {
	public int a1;
	public int b1;
	public int a2;
	public int b2;
	public int div;
	public int mult;
	public int add;
	public int sub;
	public int a;
	public int b;
	
	public Drob(int a1, int b1, int a2, int b2) {
		this.a1=a1;
		this.b1=b1;
		this.a2=a2;
		this.b2=b2;
	}

	public void divinity(){
		a=a1*b2;
		b=a2*b1;
		System.out.print(a+"/"+b);
	} 
	public void multiplication(){
		a=a1*a2;
		b=b1*b2;
		System.out.print(a+"/"+b);
	} 
	public void subtraction(){
		if (b1!=b2){
			b=b1*b2;
			a=a1*b2-a2*b1;
			System.out.print(a+"/"+b);
		}
		else {
			a=a1-a2;
			b=b1;
			System.out.print(a+"/"+b);
		}
	}
	public void addition(){
		if (b1!=b2){
			b=b1*b2;
			a=a1*b2+a2*b1;
			System.out.print(a+"/"+b);
		}
		else {
			a=a1+a2;
			b=b1;
			System.out.print(a+"/"+b);
		}
	}		 	 
}
