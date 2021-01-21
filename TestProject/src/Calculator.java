
public class Calculator {
public static void main(String[] arg)
{

	Subsctration s= new Subsctration();
	System.out.println(s.minus(6, 2));
	
	System.out.println("Sum = "+new Addition().sum(5, 4));
	Calculator c1 = new Calculator();
	Calculator c2 = new Calculator();
	
	System.out.println(new Multiplication().hashCode());
	
	System.out.println(new Multiplication().mul(2, 3));
	
	System.out.println(new Multiplication().hashCode());	
	
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());

	System.out.println(c1.equals(c2));
	System.out.println(c1.equals(c1));
}
}
