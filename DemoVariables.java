class DemoVariables{
	int a=10;
	static int b=20;
	void m1()
	{
		System.out.println("***m1()***");
		System.out.println("a value"+a);
		System.out.println("b value"+b);
	}
	static void m2()
	{
		System.out.println("***m2()***");
		//System.out.println("a value"+a);
		System.out.println("b value"+b);
	}
	public static void main(String[] args)
	{
		DemoVariables ob = new DemoVariables();
		System.out.println("===Display from main===()");
		System.out.println("a value"+ob.a);
		System.out.println("b value"+b);
		ob.m1();
		DemoVariables.m2();
	}
}
			
		