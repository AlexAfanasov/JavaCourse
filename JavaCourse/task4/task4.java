import java.util.Scanner;
import java.util.InputMismatchException;
public class task4 
{
	public static void main(String[] args) 
	{
		boolean b = false;
		int onlyTwo = 2;
		int current = 0;
		for (int i=1;i<=4;i++)
            try {
                System.out.print("Enter "+i+" boolean:");
                Scanner n = new Scanner(System.in);
                boolean bn = n.nextBoolean();
                if (bn == true) current++;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
            }
        if (current==2) System.out.println("True");
	}   
}