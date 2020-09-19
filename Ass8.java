import java.util.Scanner;
class SI{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter principle,rate of interest, period of time");
	double p= sc.nextDouble();
	double r= sc.nextDouble();
	double t= sc.nextDouble();
	double si= (p*r*t)/100;
	System.out.println("simple interest= "+si);	
}	

}