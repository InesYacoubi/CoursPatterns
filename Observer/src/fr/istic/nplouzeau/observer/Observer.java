package fr.istic.nplouzeau.observer;

public interface Observer<V> {

	void update(Subject<V> s);

}
