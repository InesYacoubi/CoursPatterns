package fr.istic.nplouzeau.observercmd;

public interface Composant {

	public Commande getCommande(String clé);
	
	public void setCommand(String clé, Commande c);
	
}
