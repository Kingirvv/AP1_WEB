import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // SAISIR MON AGE
		int age;
		Scanner masaisie = new Scanner(System.in);
		do {
		System.out.println("Veuillez saisir votre age");
		age=masaisie.nextInt();
		}while(age<0 || age >= 100);
		if(age<18)
		{
			System.out.println("Mineur");	
		}
		else if(age < 40)
		{
			System.out.println("Majeur");
		}
		else
		{
			System.out.println("Senior");	
		}
	}

}
