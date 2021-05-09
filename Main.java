package Codex;
import java.util.Scanner;
public class Main{
	Main(){
			Scanner sc = new Scanner (System.in);
			long id = 79879796797L;
			long pass = 47665875788L;
			int count= 0;
			System.out.println("Welcome to Our Online Shopping App");
			System.out.println("******************************************************");
			System.out.println("Press 1 : Log-in");
			System.out.println("Press 2 : Sign-in ");
			System.out.println("Press 3 : Go to Our Bank");
			System.out.println();
			System.out.print("Enter Your Choice : ");
			int starting = sc.nextInt();
			if(starting ==1){
				login(id , pass , starting );
			}else if(starting==2) {
				signin(id , pass , starting );
			}else if(starting==3) {
				new Bank();
			}else {
				wrong();
			}	
		}
		public static void signin(long id , long pass , int starting ) { //        Signin
			Scanner sc = new Scanner (System.in);
			System.out.println();
			System.out.println("                 Sign-in Page ");
			System.out.println();
			System.out.print("Create Your Id(4 Digit) : ");
			id = sc.nextLong();
			System.out.print("Create Your Password(6 Digit) : ");
			pass = sc.nextLong();
			System.out.println();
			System.out.println("Congratulation! You Have Successfully Created Your Acount ");
			System.out.println();
			System.out.println("Press 1 for Changing in Your Acount Details  ");
			System.out.println("Press 2 for Log in ");
			System.out.println();
			System.out.print("Enter Your Choice : ");
			starting = sc.nextInt();
			if(starting==1) {
				signin(id , pass, starting );
			}else if(starting==2) {
				login(id , pass  , starting );
			}else {
				wrong();
			}			
		}
		public static void login(long id , long pass , int starting ) {//         Login
			if(id== 79879796797L && pass == 47665875788L) {
				System.out.println();
				System.out.println("We are seeing that you have not Account right now");
				System.out.println("Create your Acount Firstly");
				signin(id , pass, starting );
			}else {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("                    Log-in Page ");
			System.out.println();
	     System.out.print("Enter Your Log-in Id(4 Digit) : ");
	     long newId = sc.nextLong();
	     System.out.print("Enter Your Password(6 Digit) : ");
	     long newPass = sc.nextLong();
	     if(newId==id && newPass == pass) {
	    	 app();
	     }else{
	    	 System.out.println();
	    	 System.out.println("Wrong Information , Try Again ");
	    	 login(id , pass , starting );
	     }
				}
			}
	 
		public static void wrong() {//                                             Wrong
			System.out.println("Wrong Information : Refresh/ Run Again ");
		}
		public static void app() {//                                              App
			System.out.println();
			System.out.println("                            Seccessfully Login");
			System.out.println();
			System.out.println("Please Select Your Choice ");
			System.out.println();
			System.out.println(" * Press 1 for Order Foods");
			System.out.println(" * Press 2 for Order Gen's Clothes");
			System.out.println(" * Press 3 for Order Ladie's Clothes");
			System.out.println(" * Press 4 for Order Kid's Clothes");
			System.out.println();
			System.out.print("Enter Your Choice : ");
			Scanner sc = new Scanner(System.in);
			int appChoice = sc.nextInt();
            if(appChoice==1){	
            System.out.println();
			System.out.println("Now You Can Order Your Food");
			System.out.println();
			System.out.println("               Please Check Your TaskBar");
			System.out.println();
			System.out.println("Thank You So Much for Shopping from Our Shop ");
			System.out.println("Have a Nice Day");
			new FoodOrder();
			
			}else if(appChoice==2) {
				System.out.println();
				System.out.println("Now you can Order your Clothes");
				System.out.println();
				System.out.println("           Please Check Your TaskBar");
				System.out.println();
				new GensSection();
				System.out.println("Thank You So Much for Shopping from Our Shop ");
				System.out.println("Have a Nice Day");
			}else if(appChoice==3) {
				System.out.println();
				System.out.println("Now you can Order your Clothes");
				System.out.println();
				System.out.println("           Please Check Your TaskBar");
				System.out.println();
				new LadiesSection();
				System.out.println("Thank You So Much for Shopping from Our Shop ");
				System.out.println("Have a Nice Day");	
			} else if(appChoice==4) {
				System.out.println();
				System.out.println("Now you can Order your Clothes");
				System.out.println();
				System.out.println("           Please Check Your TaskBar");
				System.out.println();
				new KidsSection();
				System.out.println("Thank You So Much for Shopping from Our Shop ");
				System.out.println("Have a Nice Day");
			}else {
				wrong();
			}
			}
	
		public static void main(String[] args) { 
		System.out.println("                       You Have Not Sufficent Amount in Your Bank Account");
		System.out.println("                             Please Deposit Atleast 2000 Rs");
		               new Bank();
		}
}

