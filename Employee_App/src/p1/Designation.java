package p1;

public class Designation {
	public boolean verify(String desg)
	{
		return switch(desg)
		{
			case "SE" : yield true;
			case "TE" : yield true;
			case "ME" : yield true;
			default : yield false;
		};	
	}
}
