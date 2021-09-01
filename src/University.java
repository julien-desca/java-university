public class University {
	
	public static void main(String[] args) {
		Note java = new Note("java", 2, 18.5f);
		Note php = new Note("php", 4, 12.5f);
		Note html = new Note("html", 1, 8.0f);
		Note symfony = new Note("symfony", 5, 12.7f);
		Note[] notes = { java, php, html, symfony};
		Etudiant john = new Etudiant("John", "Doe", 22, notes);
		john.etudie();
		john.afficheNote();
		if (john.moyenne() >= 10) {
			System.out.println(john.getNomComplet() + " obtiens son diplome");
		} else {
			System.out.println(john.getNomComplet() + " n'obtiens pas son diplôme");
		}
	}
}