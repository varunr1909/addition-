class addition
public static void main(String[] args) {
	try{
		int a= integer parseInt(args[0]);
		int b= integer parseInt(args[1]);
		int c=a/b;
		System.out.println("Result: "+(a+b));
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Result: "+(5+6));

	}
	catch(ArrayIndexOutOfBoundsException fe)
	{
		System.out.println("Result: "+(8+14));
	
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Result: "+(11+22));
	
	}
}