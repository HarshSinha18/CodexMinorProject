package Codex;
import java.util.Scanner;
public class Bank{
//public int current_balance;
Bank(){
Scanner sc =  new Scanner(System.in);
System.out.println();
System.out.println("Welcome to Our Bank  ");
System.out.println("***********************");
 double current_balance = 0.0;
int deposit = 0;
int withdraw = 0;
int opt = 0;
for(int i = 0 ; i<=1 ; i++){
System.out.println("Enter 1 : For Know Current Balance");
System.out.println("Enter 2 : For Deposit Money ");
System.out.println("Enter 3 : For Withdrawal Money ");
System.out.println("Enter 4 : Exit");
System.out.println("Enter 5 : For Go to  Our App");
System.out.println(); 
System.out.print("Enter Your Option : ");
opt = sc.nextInt();
System.out.println();
if(opt>=6 )
System.out.println("Enter Valid Number ");            
System.out.println();
opt = sc.nextInt();
if(opt<=0)
System.out.println("Enter Valid Number ");
System.out.println();
opt = sc.nextInt();
switch(opt){
case 1:
System.out.println("Your Current Balance is : "+current_balance+" Rs ");
System.out.println();
if(current_balance>=1999) {
	new Main();
}else {
	System.out.println("please Deposit Atleast 2000 Rs");
	System.out.println("");
	System.out.print("How Much Money do you want to Deposit : ");
	deposit = sc.nextInt();
	current_balance+=deposit;	
}
break;
case 2 :
System.out.print("How Much Money do you want to Deposit : ");
deposit = sc.nextInt();
current_balance+=deposit;
System.out.println();
System.out.println(+deposit+ " Rs Deposit Successfully.");
System.out.println();
while(current_balance<=1999) {
	System.out.println("please Deposit Atleast 2000 Rs");
	System.out.println("");
	System.out.print("How Much Money do you want to Deposit : ");
	deposit = sc.nextInt();
	current_balance+=deposit;
	System.out.println();
	System.out.println(+deposit+ " Rs Deposit Successfully.");
	System.out.println();
}
break;
case 3:
System.out.print("How Much Money do you Want to Withdrawal: ");
withdraw = sc.nextInt();
System.out.println();
if(withdraw>current_balance){
System.out.println();
System.out.println("You Have Not Sufficient Balance for withdrawal this Amaount .");
System.out.println();
System.out.print("Again Enter Amount : ");
withdraw = sc.nextInt();
current_balance-=withdraw;
System.out.println(+withdraw+" Rs Successfully Withdraw");
System.out.println();
}else{
current_balance-=withdraw;
System.out.println(+withdraw+" Rs Successfully Withdraw");
System.out.println();
while(current_balance<=1999) {
	System.out.println("please Deposit Atleast 2000 Rs");
	System.out.println("");
	System.out.print("How Much Money do you want to Deposit : ");
	deposit = sc.nextInt();
	current_balance+=deposit;
	System.out.println();
	System.out.println(+deposit+ " Rs Deposit Successfully.");
	System.out.println();
}
}
break;
case 4:
System.out.println("Thanks for Using Our Bank App");
case 5:
	if(current_balance<=1999) {
		System.out.println("please Deposit Atleast 2000 Rs");
		System.out.println("");
		System.out.print("How Much Money do you want to Deposit : ");
		deposit = sc.nextInt();
		current_balance+=deposit;
		System.out.println();
		System.out.println(+deposit+ " Rs Deposit Successfully.");
		System.out.println();
		break;
	}else {
new Main();
	}
break;
}
if(opt==4)
break;
}
}
}


