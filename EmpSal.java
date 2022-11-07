class EmpSal{
	public static void main(String args[]){
		int basSal= 15000;
		float hra,da,totSal;
		hra=(int)(0.93*basSal);
		da= (int)(0.63*basSal);
		totSal=(basSal+hra+da);
		System.out.println(basSal);
		System.out.println(hra);
		System.out.println(da);
		System.out.println(totSal);		
	}
}