package Dec4;

import java.io.Serializable;

public class Film implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String filmName;
	
	private long movieDuration;
	
	transient String Actor;// In this Film Object , 
	//this datamember will not serialize

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public long getMovieDuration() {
		return movieDuration;
	}

	public void setMovieDuration(long movieDuration) {
		this.movieDuration = movieDuration;
	}

}
