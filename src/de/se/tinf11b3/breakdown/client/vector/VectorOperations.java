package de.se.tinf11b3.breakdown.client.vector;

import gwt.g2d.client.math.Vector2;

/**
 * Enthält diverse Methoden für Vektoroperationen
 * @author michael
 *
 */
public class VectorOperations {
	
	
	/**
	 * Skalarprodukt
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double dot(Vector2 a, Vector2 b) {
		return a.getX() * b.getX() + a.getY() * b.getY();
	}

	
	/**
	 * Laenge des Vektors im Quadrat (spart Wurzelrechnung ein)
	 * 
	 * @param a
	 * @return
	 */
	public static double sqr_length(Vector2 a) {
		return dot(a, a);
	}

	
	/**
	 * Vektor mal Skalar
	 * 
	 * @param a
	 * @param t
	 * @return
	 */
	public static Vector2 vec_mal_scalar(Vector2 a, double t) {
		return new Vector2(a.getX() * t, a.getY() * t);
	}

	/**
	 * Vektoraddition
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static Vector2 vec_plus_vec(Vector2 a, Vector2 b) {
		return new Vector2(a.getX() + b.getX(), a.getY() + b.getY());
	}

	/**
	 * Vektorsubtraktion
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static Vector2 vec_minus_vec(Vector2 a, Vector2 b) {
		return new Vector2(a.getX() - b.getX(), a.getY() - b.getY());
	}
}
