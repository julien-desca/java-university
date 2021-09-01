
public class Note {
	
	private String matiere;
	private int coef;
	private float value;
	
	public Note(String matiere, int coef, float value) {
		this.matiere = matiere;
		this.coef = coef;
		this.value = value;
	}
	
	public float getValue() {
		return this.value;
	}
	
	public int getCoef() {
		return this.coef;
	}
	
	public String getMatiere() {
		return this.matiere;
	}
	
}
