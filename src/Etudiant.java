
public class Etudiant {
	
	private String nom;
	private String prenom;
	private int age;
	private Note[] notes;
	
	public Etudiant(String prenom, String nom, int age, Note[] notes) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.notes = notes;
	}
	
	public void etudie() {
		System.out.println(this.prenom + " étudie");
	}
	
	public String getNomComplet() {
		return this.prenom + " " + this.nom;
	}
	
	public float moyenne() {
		float sommeNote = 0;
		int totalCoef = 0;
		for(Note n : this.notes) {
			sommeNote = sommeNote + n.getValue() * n.getCoef();
			totalCoef = totalCoef + n.getCoef();
		}
		return sommeNote / totalCoef;
	}
	
	public void afficheNote() {
		for(Note n : this.notes) {
			System.out.println(n.getMatiere() + "(coef. " + n.getCoef() + ") : " + n.getValue());
		}
		System.out.println("Moyenne: " + this.moyenne());
	}
	
	
	
	
	
}
