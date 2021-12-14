import java.util.Scanner;

public class Add2 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int x;
		int y;
		int sum;

		System.out.print("1st Int: ");
		x = input.nextInt();

		System.out.print("2nd Int: ");
		y = input.nextInt();

		sum = x + y;

		System.out.println(sum);
		input.close();
	}
}
