package intern;

import java.util.Scanner;

public class calculate {

	public static void main(String args[]) {

	calcii c=new calcii();

	Scanner sc=new Scanner(System.in);

	while(true) {
		System.out.println("-----Calculator-----");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("0.Exit");
		System.out.println("Choose an operation to perform Or 0 to exit:");
		char option=sc.next().charAt(0);

		if(option=='0') {
			System.out.println("Calculator Exit");
		}

		if(option<'1' || option >'4') {

			System.out.println("Invalid operation.");

		}

		System.out.println("Are you sure you want to continue (Y/N) :");

		char choice=sc.next().toUpperCase().charAt(0);

		if(choice!='Y') {
			continue;
		}
		System.out.println("Enter a number of inputs: ");

		int count=sc.nextInt();

		if(count<2) {

			System.out.println("Atleast 2 inputs needed.");

			continue;

		}
		System.out.println("Are you sure you want to continue (Y/N) :");

		char choic=sc.next().toUpperCase().charAt(0);
		
		int result=0;
		System.out.println("Enter the value 1:");
		int number=sc.nextInt();
		for(int i=2;i<=count;i++) {
			System.out.println("enter the value "+i+":");
			int numb=sc.nextInt();

		switch(option) {

		case '1':
			result=c.add(result,numb);
			break;
		case '2':
			result=c.sub(result,numb);
			break;
		case '3':
			result=c.multi(result,numb);
			break;
		case '4':
			result=c.div(result,numb);
			break;
		}

	}
	System.out.println("Result: "+result+"\n");

}

}

}


