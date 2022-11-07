class EmployeeDetails{
	String id="bhagavan811", name="Bhagavan Potnuru", desg="Software Developer";
	static String mail="bagavanpotnuru123@gmail.com"; 
	static long pno= 9492511162l;
	void gDetails()
	{
		System.out.println("***Details***");
		System.out.println("Id="+id);
		System.out.println("name="+name);
		System.out.println("Designation="+desg);
	}
	static void gContact()
	{
		System.out.println("***Contact***");
		System.out.println("Email="+mail);
		System.out.println("Phone Number="+pno);
	}
	public static void main(String[] args)
	{
		EmployeeDetails obj = new EmployeeDetails();
		System.out.println("===Display from main()===");
		System.out.println("Id="+obj.id);
		System.out.println("Name="+obj.name);
		System.out.println("Designation="+obj.desg);
		System.out.println("Email="+mail);
		System.out.println("Phone Number="+pno);
		obj.gDetails();
		EmployeeDetails.gContact();
	}
}

	