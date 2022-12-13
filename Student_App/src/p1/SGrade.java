package p1;

public class SGrade {
	public String generate(int a, int b, int c, int d, int e, int f)
	{
		SResult sr = new SResult();
		float per = sr.percent(a,b,c,d,e,f);
		if(per>=70) return "A or Distinction";
		else if(per>=60 && per<70) return "B or First Class";
		else if(per>=50 && per<60) return "C or Second Class";
		else if(per>=35 && per<50) return "D or Third Class";
		else return "Fail";	
	}
}
