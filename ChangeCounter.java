//****************************|
//Author: Kailean Hunter      |
//File Name: Project1         |
//Project: Change Calculator  |
//Date: 8/31/16		          |
//****************************|
import java.util.*;
public class ChangeCounter {
	public static void main(String[] args){
		
		System.out.print ("Enter Value here:");
		Scanner in = new Scanner(System.in); 		//user input
		double money = in.nextDouble();		
		
		int a=0, b=0, c=0, d=0;						//bills
		int e=0, f=0, g=0, h=0;						//coins
	
		while (money >= 20.0){						//Twenties
				a++;								//number of bills
				money = money - 20.0;
			}		
			System.out.println(a+" Twenty dollar bills");
			
			while (money >= 10.0){					//Tens	
				b++;								//number of bills
				money = money - 10.;
			}		
			System.out.println(b+" Ten dollar bills");
			
			while (money >= 5.0){					//Fives
				c++;								//number of bills
				money = money - 5.0;
			}		
			System.out.println(c+" Five dollar bills");
			
			while (money >= 1.0){					//Ones
				d++;								//number of bills
				money = money - 1.0;
			}		
			
			System.out.println(d+" One dollar bills");
			
			System.out.println("");					//Space
			
			money += 0.001;
			
			while (money >= .25){					//Quarters
				e++;								//number of bills
				money = money - .25;
			}		
			System.out.println(e+" Quarters");
			
			while (money>= .1){						//Dimes
				f++;								//number of bills
				money = money - .1;
			}		
			System.out.println(f+" Dimes");
		
			while (money >= .05){					//Nickels
				g++;								//number of bills
				money = money - .05;
			}		
			System.out.println(g+" Nickles");
			
			while (money >= .01){					//Pennies
				h++;								//number of bills
				money = money - .01;
			}		
			System.out.println(h+" Pennies");
			
			
}

}
