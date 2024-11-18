package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	/**
	 * Complete con su implementación
	 */
	private String texto;
	private int Likes;
	private boolean feature;
	
	public WallPostImpl() {
		texto="Undefined post";
		Likes=0;
	}
	
	public String getText() {
		return texto;
	}
	public int getLikes() {
		return this.Likes;
	}
	public void setText(String comentario) {
		this.texto=comentario;
	}
	public void like() {
		this.Likes++;
	}
	public void dislike() {
		if (Likes > 0)
			Likes--;
	}
	public boolean isFeatured() {
		return this.feature;
	}
	public void toggleFeatured() {
		if(this.feature) {
			this.feature= false;
		}
		else {this.feature= true;
		}
	}
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
