import java.util.*;
public class task1{
	public static void main(String args[])
	{
	Random rand = new Random();
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.println("Welcome to Number game");
		System.out.println("Rules are\n Guess the number \n If it is matches with displayed number \n If both are same Your score Raises by 1");
		System.out.println("Let Us Start The Game\n   Best of Luck \n");
		System.out.println("You Have 5 Attempts to Guess the Correct Answer");
		for(int i=0;i<=4;i++){
				int x = rand.nextInt(100);
				System.out.println("Guess a Number");
				int y=sc.nextInt();
				if(x==y){
					System.out.println("Your assumption is right score Raises by 1 ");
					c++;
				}
				else{
					System.out.println("Your assumption is Wrong \t\n Correct Answer is "+x);
				}
		}
			System.out.println("Total Score is 5 \nYour Score is "+c);
			System.out.println("Thank You! Have a nice time");
			
	}
}
