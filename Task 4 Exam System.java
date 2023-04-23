import java.util.*;
public class Exam_System {

Scanner sc = new Scanner(System.in);
HashMap<String,Integer> data = new HashMap<String,Integer>();

	public void login() {
		data.put("ANKIT",1503);
		data.put("ANKIT",3003);
		System.out.println("\n\n**********WELCOME TO ONLINE EXAM SYSTEM*****************");
		String UserId;
		int password;
		System.out.println("CONTINUE TO LOGIN");
		System.out.print("Enter UserId : ");
		UserId = sc.next();
		System.out.print("Enter password : ");
		password = sc.nextInt();
		if(data.containsKey(UserId) && data.get(UserId)==password) {
			System.out.println("\nSUCCESSFULLY LOGIN");
				option_menu();
		}
		else {
			System.out.println(" OOPS INVALID LOGIN ");
			System.out.println("Try Again");
				login();
		}
	}
	public void option_menu() {
		int select;
		System.out.println("\nEnter the Option you want to Perform Operation");
		System.out.println("1.Update Profile and Password");
		System.out.println("2.Start  Exam");
		System.out.println("3.Logout");
		select = sc.nextInt();
		switch(select) {
		case 1:
			data=update();
			option_menu();
			break;
		case 2:
			exam_que();
			option_menu();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Wrong Entry");
		}
	}
	public HashMap<String,Integer> update(){
		String uUser;
		int upassword;
		System.out.println("Welcome to Update Profile");
		System.out.println("Enter Username");
		uUser = sc.next();
		if(data.containsKey(uUser)) {
		System.out.println("Enter new Password you to want to Update to your Profile");
		upassword = sc.nextInt();
		data.replace(uUser, upassword);
		}
		else {
			System.out.println("User Doesn't Exist");
		}
		return data;
	}
public void exam_que() {
	long examtime=System.currentTimeMillis();
	long endtime=examtime+30;
	int ans_count=0;
	int ans,score;
	System.out.println("Start Your Exam");

	
//Question starts
	while(System.currentTimeMillis()<endtime) {
		System.out.println("You have 30 seconds to answer 5 questions");
		System.out.println("Each Question carries 10 marks"+" "+"-5 for wrong answer");
		System.out.println("\n\nQ.1) Who won the Best Footballer 2016 in the World?");
		System.out.println("\n(1) Cristiano Ronaldo"+"\t"+"(2) Cristiano Robert"+"\t"+"(3) Robert Paul"+"\t"+"(4) Mark Admin");
		System.out.println("Enter Correct Option");
		ans=sc.nextInt();
		System.out.println("Answer Locked...");
		if(ans==2) {
			ans_count++;
		}
		System.out.println("\n\nQ.2)Which planet have the Great Red Spot?");
		System.out.println("1)Jupiter"+"\t"+"2)Mars"+"\t"+"3) Neptune"+"\t"+"4)Moon");
		System.out.println("Enter correct option");
		ans=sc.nextInt();
		System.out.println("Answer Locked...");
		if(ans==2) {
			ans_count++;
		}
		System.out.println("\n\nQ.3)Who was India’s first President?");
		System.out.println("1) Radha Krishnan"+"\t"+"(2) Zakir Hussain"+"\t"+"3)V. V. Giri"+"\t"+"4)Rajendra Prasad");
		System.out.println("Enter correct option");
		ans=sc.nextInt();
		System.out.println("Answer Locked...");
		if(ans==1) {
			ans_count++;
		}
		System.out.println("\n\nQ.4)Who is the constitution head of India?");
		System.out.println("1) Prime Minister"+"\t"+"2) Chief Justice of the Supreme Court"+"\t"+"3) President"+"\t"+"4)Speaker of the Lok Sabha");
		System.out.println("Enter correct option");
		ans=sc.nextInt();
		System.out.println("Answer Locked...");
		if(ans==4) {
			ans_count++;
		}
		System.out.println("\n\nQ.5)Where is the Election Commission located?");
		System.out.println("1)  Chennai"+"\t"+"2) Mumbai"+"\t"+"3) New Delhi"+"\t"+"4) Kolkata");
		System.out.println("Enter correct option");
		ans=sc.nextInt();
		System.out.println("Answer Locked...");
		if(ans==1) {
			ans_count++;
		}
		break;
	}
	System.out.println("You have finished the exam");
	score=ans_count*10-((5-ans_count)*5); 
	System.out.println("Your score is..."+" "+score+"/50");	
}

public static void main (String[] args)
{
	Exam_System log =new Exam_System();
		log.login(); 
}
} 