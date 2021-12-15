import java.util.Scanner;

public class add2 
{
	public static void main(String[] args)
	{
//		System.out.print("hello world");
		Scanner input = new Scanner(System.in);

		int x;
		int y;
//		int z;
		int sum;

		System.out.print("1st Int: ");
		x = input.nextInt();

		System.out.print("2nd Int: ");
		y = input.nextInt();

//		System.out.print("3rd Int: ");
//		z = input.nextInt();

		sum = x + y;
//		sum = x + y + z;

		System.out.println(sum);
		input.close();
	}
}
