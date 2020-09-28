package sep27;
import java.util.Scanner;
abstract class Account{
	//double sav_amt=5000.00;
	//double curr_amt=1000.00;
	int Acc_no;
	String name;
	double balance;
	String branch;
	abstract void saving();
	abstract void current();
	void display()
	{
		System.out.println("Account no="+Acc_no);
		System.out.println("Account Holder Name="+name);
		System.out.println("Balance="+balance);
		System.out.println("Branch Name="+branch);
		
	}
}
class Saving extends Account{
	
	void saving()
	{
		
	}
	void current()
	{
		
	}
}
public class Q51 {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter which type you want to create");
	System.out.println("1.Saving Account");
	System.out.println("2.Current Account");
}
