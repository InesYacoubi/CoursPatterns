package fr.istic.nplouzeau.observer;

/**
 * @author plouzeau
 * @version 1.0
 * 
 * Interface de base pour les sujets.
 * Le code propre à la notification est situé dans une classe concrète.
 * Le paramètre 'V' est le type de la valeur gérée par le sujet.
 */
public interface Subject<V> {
	public void attach(Observer<V> o);
	public void detach(Observer<V> o);
	public boolean isAttached(Observer<V> observer);
	public V getValue();
	public void setValue(V value);
}
