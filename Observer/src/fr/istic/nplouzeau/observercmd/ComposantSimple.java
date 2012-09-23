package fr.istic.nplouzeau.observercmd;

import java.util.HashMap;

public class ComposantSimple implements Composant {
	
	private HashMap<String,Commande> tableCmds;
	
	public ComposantSimple() {
		tableCmds = new HashMap<String, Commande>();
	}
	@Override
	public Commande getCommande(String clé) {
		return tableCmds.get(clé);
	}

	@Override
	public void setCommand(String clé, Commande c) {
		tableCmds.put(clé, c);
	}

}
