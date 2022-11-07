import java.util.Scanner;
class Even{
	int arg(int a){
		if(a%2==0)
		{
			return 1;
		}
		else{
			return 0;
		}
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		Even ob = new Even();
		System.out.println(ob.arg(x));
	}
}
		