
public class Employe
{
	protected String nom;
	protected int age;
	protected float salaire;
	protected float ancienSalaire;
	protected float nouveauSalaire;
	
	
	
	public void affiche(Employe employe)
	{
		float augmentation = this.nouveauSalaire-this.ancienSalaire;
		if (augmentation > 0)
			System.out.println("-"+employe.nom+", "+employe.age+", "+(int)employe.salaire
					+" (+"+(int)augmentation+" apres augmentation)");
		else
			System.out.println("-"+employe.nom+", "+employe.age+", "+(int)employe.salaire);
	}
	
	public void augmentation(float x)
	{
		this.ancienSalaire = this.salaire;
		this.nouveauSalaire = this.salaire + x;
		this.salaire = this.nouveauSalaire;	
	}
	
	// Constructeur
	public Employe(String nom, int age, float salaire)
	{
		super();
		this.nom = nom;
		this.age = age;
		this.salaire = this.ancienSalaire = this.nouveauSalaire = salaire;
	}
	
	// Getter
	public String getNom() 			{ return this.nom; }
	public int getAge()				{ return this.age; }
	public float getSalaire()		{ return this.salaire; }
	public float getAncienSalaire()	{ return this.ancienSalaire; }
	public float getNouveauSalaire(){ return this.nouveauSalaire; }
	
	// Setter
	public void setNom(String nom)			{ this.nom = nom; }
	public void setAge(int age) 			{ this.age = age; }
	public void setSalaire(float salaire) 	{ this.salaire = salaire; }
}
