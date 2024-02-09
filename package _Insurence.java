package Insurence;

import java.util.Scanner;
// Health insurance class
public class health_insurence extends insurence
{
	public void new_policy()
	{  	
		// Method implementation for creating a new health insurance policy
		String name;
		int age;
		int id;
		int choice;
		int year;
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your full name");
		name=sc.next();
		System.out.println("Enter your age");
		age=sc.nextInt();
		if(age<=60)
		{
			System.out.println("You are  eligible for policy");
		}
		System.out.println("Enter your Id prood no");
		id=sc.nextInt();
		System.out.println("Enter the duration for policy(years)");
		year=sc.nextInt();
		System.out.println("Choice your Policy Plan");
		System.out.println("1:accidental plan for Rs.7000 per/year"+"\n2:Hospitalize plan for Rs.6700"+"\n3:full Heath cover plan for Rs.9800 per/year");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("your name:"+name+"\nyour age:"+age+"\nyour id proof:"+id+"\nyou choice accidental plan for "+year+" years");
			total=7000*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			break;
		case 2:
			System.out.println("your name:"+name+"\nyour age:"+age+"\nyour id proof:"+id+"\nyou choice Hospitalize plan for "+year+" years");
			total=6700*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			break;
		case 3:
			System.out.println("your name:"+name+"\nyour age:"+age+"\nyour id proof:"+id+"\nyou choice full Heath cover plan for "+year+" years");
			total=9800*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			break;
		default:
			System.out.println("You choose invalid plan");
			break;	
		}
	}
	// Method implementation for renewing an existing health insurance policy
	public void renew_policy()
	{
		// Method implementation for renewing an existing health insurance policy
		int old_id;
		int choice;
		int year;
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your old Policy no");
		old_id=sc.nextInt();
		System.out.println("duration for policy(years)");
		year=sc.nextInt();
		System.out.println("choose your new plan ");
		System.out.println("1:accidental plan for Rs.7000 per/year"+"\n2:Hospitalize plan for Rs.6700"+"\n3:full Heath cover plan for Rs.9800 per/year");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("your old policy no:"+old_id+"\nyou choice accidental plan"+" for "+year+" years");
			total=7000*year;
			System.out.println("Your total amount for"+year+"years is:"+total);
			break;
		case 2:
			System.out.println("your id proof"+old_id+"\nyou choice Hospitalize plan "+"for"+year+" years");
			total=6700*year;
			System.out.println("Your total amount for"+year+"years is:"+total);
			break;
		case 3:
			System.out.println("your id proof"+old_id+"\nyou choice full Heath cover plan"+" for "+year+" years");
			total=9800*year;
			System.out.println("Your total amount for"+year+"years is:"+total);
			break;
		default:
			System.out.println("You choose invalid plan");
			break;
		}
		
	}
}
package Insurence;

import java.util.Scanner;
// Jewelry insurance class
public class Jwellary_insurence extends insurence
{
	
	public void new_policy()
	{
		// Method implementation for creating a new jewelry insurance policy
		String item_no,item_name;
		int id;
		int choice=0;
		int year;
		int total=0;
		int item_price;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Item name");
		item_name=sc.next();
		System.out.println("Enter your Id prood no");
		id=sc.nextInt();
		System.out.println("Enter your Item number");
		item_no=sc.next();
		System.out.println("Enter your jwellary price");
		item_price=sc.nextInt();
		System.out.println("duration for policy(years)");
		year=sc.nextInt();
		System.out.println("Choice your Policy Plan");
		System.out.println("1:stool insurence for Rs.10200 per/year "+"\n2: Item loss insurence for Rs.20300 per/year "+"\n3:Damage insurence for Rs.19700 per/year");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			if(item_price>10200)
			{
			System.out.println("your name:"+item_name+"\nyour id proof no:"+id+"\nyou choose Zero depeth insurence for your Item no:"+item_no+" for "+year+" years");
			total=10200*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			}
			else
			{
				System.out.println("this policy is not suitable for this item");	
			}
			break;
		case 2:
			if(item_price>20300)
			{
			System.out.println("your name:"+item_name+"\nyour id proof:"+id+"you choose first party insurence for your Item no:"+item_no+" for "+year+" years");
			total=20300*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			}
			else
			{
				System.out.println("this policy is not suitable for this item");	
			}
			break;
		case 3:
			if(item_price>19700)
			{
			System.out.println("your name:"+item_name+"\nyour id proof:"+id+"\nyou choose Third party insurence for your Item no "+item_no+" for "+year+"years");
			total=19700*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			}
			else
			{
				System.out.println("this policy is not suitable for this item");	
			}
			break;
		default:
			System.out.println("You choose invalid plan");
			break;	
		}
	}
	public void renew_policy()
	{	
		 // Method implementation for renewing an existing jewelry insurance policy
		int old_id;
		int choice=0;
		String item_name;
		int item_price;
		int year;
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your old Policy no");
		old_id=sc.nextInt();
		System.out.println("Enter your Item Name");
		item_name=sc.next();
		System.out.println("Enter your jwellary price");
		item_price=sc.nextInt();
		System.out.println("duration for policy(years)");
		year=sc.nextInt();
		System.out.println("choose your new plan ");
		System.out.println("1:stool insurence for Rs.10200 per/year "+"\n2: Item loss insurence for Rs.20300 per/year "+"\n3:Damage insurence for Rs.19700 per/year");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			if(item_price>10200)
			{
			System.out.println("your old policy no:"+old_id+"\nyou choose Zero depeth insurence for your item:"+item_name);
			total=10200*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			}
			else
			{
				System.out.println("this policy is not suitable for this item");
			}
			break;
		case 2:
			if(item_price>20300)
			{
			System.out.println("your id proof:"+old_id+"\nyou choose first party insurence for your item:"+item_name);
			total=20300*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			}
			else
			{
				System.out.println("this policy is not suitable for this item");	
			}
			break;
		case 3:
			if(item_price>19700)
			{
			System.out.println("your id proof"+old_id+"you choose Third party insurence for your item"+item_name);
			total=19700*year;
			System.out.println("Your total amount for"+year+"years is:"+total);
			}
			else
			{
				System.out.println("this policy is not suitable for this item");	
			}
			break;
		default:
			System.out.println("You choose invalid plan");
			break;
		}
	}
}
package Insurence;

import java.util.Scanner;

public class Factory_insurence extends insurence
{
	public void new_policy()
	{
		// Method implementation for creating a new factory insurance policy
		String register_no,name;
		int age_company;
		int id;
		int choice=0;
		int year;
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Company name");
		name=sc.next();
		System.out.println("Enter long being your compang been established ?");
		age_company=sc.nextInt();
		System.out.println("Enter your Id prood no of owner");
		id=sc.nextInt();
		System.out.println("duration for policy(years)");
		year=sc.nextInt();
		System.out.println("Enter your company registeration number");
		register_no=sc.next();
		System.out.println("Choice your Policy Plan");
		System.out.println("1:Zero depeth insurence Rs.512000 for per/year"+"\n2:first party insurence Rs.389500 per/year"+"\n3:Third party insurence Rs.216400 per/year");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("your company name:"+name+"\nis working science :"+age_company+" years"+"\nyour registeration id is:"+register_no+"\nyou choose Zero depeth insurence for your company");
			total=512000*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			break;
		case 2:
			System.out.println("your company name:"+name+"\nis working science:"+age_company+" years"+"\nyour registeration id is:"+register_no+"\nyou choose first party insurence for your company");
			total=389500*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			break;
		case 3:
			System.out.println("your company name:"+name+"\nis working science:"+age_company+" years"+"\nyour registeration id is:"+register_no+"\nyou choose Third party insurence for your company");
			total=216400*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			break;
		default:
			System.out.println("You choose invalid plan");
			break;	
		}
	}
	public void renew_policy()
	{
		// Method implementation for renewing an existing factory insurance policy
		int choice;
		int old_id;
		int year;
		int total=0;
		String register_no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your old Policy no");
		old_id=sc.nextInt();
		System.out.println("Enter your company registeration number");
		register_no=sc.next();
		System.out.println("duration for policy(years)");
		year=sc.nextInt();
		System.out.println("Choice your Policy Plan");
		System.out.println("1:Zero depeth insurence Rs.512000 for per/year"+"\n2:first party insurence Rs.389500 per/year"+"\n3:Third party insurence Rs.216400 per/year");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			System.out.println("your policy No"+old_id+"\nyour registeration id is:"+register_no+"\nyou choose Zero depeth insurence for your company");
			total=512000*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			break;
		case 2:
			System.out.println("your policy No"+old_id+"\nyour registeration id is:"+register_no+"you choose first party insurence for your company");
			total=389500*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			break;
		case 3:
			System.out.println("your policy No"+old_id+"\nyour registeration id is:"+register_no+"you choose Third party insurence for your company");
			total=216400*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			break;
		default:
			System.out.println("You choose invalid plan");
			break;	
		}	
	}
}
package Insurence;

import java.util.Scanner;
// Vehicle insurance class
public class vehical_insurence extends insurence
{
	public void new_policy()
	{
		// Method implementation for creating a new vehicle insurance policy
		String vehical_no,name;
		int age_vehical,id;
		int choice=0;
		int year;
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your full name");
		name=sc.next();
		System.out.println("Enter registration year");
		age_vehical=sc.nextInt();
		System.out.println("Enter your Id prood no");
		id=sc.nextInt();
		System.out.println("Enter your vehical number");
		vehical_no=sc.next();
		System.out.println("duration for policy(years)");
		year=sc.nextInt();
		System.out.println("Choice your Policy Plan");
		System.out.println("1:Zero depeth insurence"+"\n2:first party insurence"+"\n3:Third party insurence");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("your name:"+name+"\nyour Vehical registration:"+age_vehical+"\nyour id proof no:"+id+"\nyou choose Zero depeth insurence for your vehical no:"+vehical_no);
			total=5000*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			break;
		case 2:
			System.out.println("your name:"+name+"\nyour Vehical registration:"+age_vehical+"\nyour id proof:"+id+"\nyou choose first party insurence for your vehical no:"+vehical_no);
			total=5000*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			break;
		case 3:
			System.out.println("your name:"+name+"\nyour Vehical registration:"+age_vehical+"\nyour id proof:"+id+"\nyou choose Third party insurence for your vehical no:"+vehical_no);
			total=5000*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			break;
		default:
			System.out.println("You choose invalid plan");
			break;	
		}
	}
	public void renew_policy()
	{
		// Method implementation for renewing an existing vehicle insurance policy
		int old_id;
		int choice=0;
		int year;
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your old Policy no");
		old_id=sc.nextInt();
		System.out.println("duration for policy(years)");
		year=sc.nextInt();
		System.out.println("choose your new plan ");
		System.out.println("1:Zero depeth insurence"+"\n2:first party insurence"+"\n3:Third party insurence");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("your old policy no:"+old_id+"\nyou choose Zero depeth insurence");
			total=5000*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			break;
		case 2:
			System.out.println("your id proof:"+old_id+"\nyou choose first party insurence");
			total=5000*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			break;
		case 3:
			System.out.println("your id proof:"+old_id+"\nyou choose Third party insurence");
			total=5000*year;
			System.out.println("Your total amount for "+year+" years is:"+total);
			break;
		default:
			System.out.println("You choose invalid plan");
			break;
		}
	}
}
package Insurence;

import java.util.Scanner;
// Parent class for insurance policies
public class insurence 
{
	public static void main(String[] args) 
	{
		int choice;
		int input;
		char ans ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our insurence company");
		System.out.println("choose your insurence policy according to your convance");
		do
		{
		System.out.println("1:Health insurence"+"\n2:jwellary insurence"+"\n3:Factory Insurence"+"\n4:Vehical Insurence");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			// Displaying a message related to health insurance
			health_insurence obj=new health_insurence();
			System.out.println("Health insurance is your passport to peace of mind, \nensuring that your well-being is safeguarded against the unpredictable twists and turns of life's journey");
			System.out.println("if you want to invest in new policy press 1:"+"\nif you want to Renew policy press 2:");
			input=sc.nextInt();
			switch(input)
			{
			case 1:
				obj.new_policy();
				break;
			case 2:
				obj.renew_policy();
				break;
			default:
				System.out.println("Your enter cross choice");
				break;
			}
			break;
		case 2:
			// Displaying a message related to jewelry insurance
			Jwellary_insurence obj2=new Jwellary_insurence();
			System.out.println("Jewelry is like the perfect spice - it always complements what's already there.");
			System.out.println("if you want to invest in new policy press:1"+"\nif you want to Renew policy press:2");
			input=sc.nextInt();
			switch(input)
			{
			case 1:
				obj2.new_policy();
				break;
			case 2:
				obj2.renew_policy();
				break;
			default:
				System.out.println("Your enter cross choice");
				break;
			}
			break;
		case 3:
			// Displaying a message related to factory insurance
			Factory_insurence obj3=new Factory_insurence();
			System.out.println("Insurance is like a safety net for life's uncertainties, offering peace of mind and financial protection when unexpected events occur.Insurance is like a safety net for life's uncertainties, offering peace of mind and financial protection when unexpected events occur.");
			System.out.println("if you want to invest in new policy press 1:"+"\nif you want to Renew policy press 2:");
			input=sc.nextInt();
			switch(input)
			{
			case 1:
				obj3.new_policy();
				break;
			case 2:
				obj3.renew_policy();
				break;
			default:
				System.out.println("Your enter cross choice");
				break;
			}
			break;
		case 4:
			// Displaying a message related to vehicle insurance
			vehical_insurence obj4=new vehical_insurence();
			System.out.println("Vehicle insurance is not just about protecting your car; it's about safeguarding your peace of mind on every journey, knowing that you're covered against unforeseen accidents and liabilities.");
			do
			{
			System.out.println("if you want to invest in new policy press 1:"+"\nif you want to Renew policy press 2:");
			input=sc.nextInt();
			switch(input)
			{
			case 1:
				obj4.new_policy();
				break;
			case 2:
				obj4.renew_policy();
				break;	
			default:
				System.out.println("Your enter cross choice");
				break;
			}
			System.out.println("Do you want to purchase for another vehical Y/N");
			ans=sc.next().charAt(0);
			}while(ans=='Y'||ans=='y');
			break;
		default:
			System.out.println("Your enter cross choice");
			break;
		}
			System.out.println("Do you want to purchase any other policy Y/N");
			ans=sc.next().charAt(0);
		
		}while(ans=='Y'||ans=='y');
		
	}
	
}
