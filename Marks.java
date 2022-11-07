class Marks
{
	public static void main(String args[])
	{
		int s1=96,s2=94,s3=90,s4=87,s5=76,s6=79;
		float percentage;
		float totMarks=s1+s2+s3+s4+s5+s6;
		percentage=(float)((totMarks/600)*100);
		System.out.println(totMarks);
		System.out.println(percentage);
	}
}