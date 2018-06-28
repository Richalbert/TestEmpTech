
public class TestEmpTech
{
	private static void affichage(Employe albert, Employe bernard, Technicien jacques)
	{
		System.out.println("Employé :");
		System.out.println(albert.toString());
		System.out.println(bernard.toString());
		System.out.println("Technicien :");
		System.out.println(jacques.toString());
	}
	
	public static void main(String[] args)
	{
		Employe albert = new Employe("Albert",28,3900);
		Employe bernard = new Employe("Bernard",50,7500);
		
		Technicien jacques = new Technicien("Jacques",25,4350,(byte) 2);
		
		affichage(albert,bernard,jacques);
		
		System.out.println("*************************");
		System.out.println("C Noel ... Augmentation !");
		System.out.println("*************************");
		albert.augmentation(600);
		bernard.augmentation(500);
		jacques.augmentation(650);
		
		affichage(albert,bernard,jacques);	
	}
}
