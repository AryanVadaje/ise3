import java.util.*;
public class A2Q5{
	public static void main(String args[]){
		
		System.out.println("Even numbers from 1 to 100 are: ");
		for(int i=1;i<=100;i++){
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println("\nOdd numbers from 1 to 100 are: ");
		for(int i=1;i<=100;i++){
			if(i%2!=0)
				System.out.print(i+" ");
		}
	}
}