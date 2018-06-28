
public class TestEmpTech
{

	private static void affichage(Employe albert, Employe bernard, Technicien jacques)
	{
		System.out.println("Employé");
		albert.affiche(albert);
		bernard.affiche(bernard);
		System.out.println("Technicien");
		jacques.affiche(jacques);
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
