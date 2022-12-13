package p1;

public class CheckBranch {
	public boolean k = false;
	public boolean verify(String branch)
	{
		return switch(branch)
		{
			case "CSE" : yield true;
			case "ECE" : yield true;
			case "EEE" : yield true;
			default : yield false;
		};
	}
}
