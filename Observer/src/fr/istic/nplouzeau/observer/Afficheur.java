package fr.istic.nplouzeau.observer;

public class Afficheur implements Observer<Integer> {
	private String texte;
	
	@Override
	public void update(Subject<Integer> s) {
		setTexte(s.toString());
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

}
