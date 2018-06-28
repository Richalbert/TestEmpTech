
public class Technicien extends Employe
{
	private byte grade;
	
	
	public void affiche(Technicien tech)
	{
		float augmentation = this.nouveauSalaire-this.ancienSalaire;
		if (augmentation > 0)
			System.out.println("-"+tech.nom+", "+tech.age+", "+(int)tech.salaire
					+" (+"+(int)augmentation+" apres augmentation)");
		else
			System.out.println("-"+tech.nom+", "+tech.age+", "+(int)tech.salaire);
	}
	

	// Constructeur
	public Technicien(String nom,int age,float salaire,byte grade)
	{
		super(nom,age,salaire);
		this.grade = grade;
	}

	
	// Getter
	public byte getGrade() { return this.grade;	}

	// Setter
	public void setGrade(byte grade) { this.grade = grade;	}
	
	
}
