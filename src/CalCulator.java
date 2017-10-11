import java.util.Scanner;

public class CalCulator
{
	static double x;
	static double y;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter choice - Press 1 for Arithmetic / 2 for Trigonometry: ");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter two Number: ");
			x=sc.nextDouble();
			y=sc.nextDouble();
			System.out.println("Press what operation you do: ");
			char ch=sc.next().charAt(0);
			//System.out.println(ch);
			Arithmetic Cal=new Arithmetic();
			if(ch=='+')
				Cal.Addition();
			else if(ch=='-')
				Cal.Subtraction();
			else if(ch=='*')
				Cal.Multiplication();
			else if(ch=='/')
				Cal.Divison();
			else
				System.out.print("Error");
		}
		else if(choice==2)
		{
			System.out.println("Enter the Number: ");
			x=sc.nextDouble();
			System.out.println("Press 1 for Sine\n2 for Cosine\n3 for Tangent\n4 for Secant\n5 for Cosecant\n6 for Cotangent");
			int n=sc.nextInt();
			Trigonometry Cal=new Trigonometry();
			if(n==1)
				Cal.SinOperation();
			else if(n==2)
				Cal.CosOperation();
			else if(n==3)
				Cal.TanOperation();
			else if(n==6)
				Cal.CotOperation();
			else if(n==4)
				Cal.SecOperation();
			else if(n==5)
				Cal.CosecOperation();
			else 
				System.out.println("ErROr");
			
		}
		else
			System.out.println("Inavalid Choice!!");
	}

}
