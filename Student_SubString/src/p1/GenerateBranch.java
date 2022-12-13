package p1;
public class GenerateBranch {
	public String generate(int brCode)
	{
		return switch(brCode) {
		case 1: yield "CIVIL";
		case 2: yield "EEE";
		case 3: yield "MECH";
		case 4: yield "ECE";
		case 5: yield "CSE";
		default: yield null;
		};
	}
}
