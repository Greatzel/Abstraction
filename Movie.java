
public abstract class Movie implements Comparable<Movie> {

	public String title;
	public String genre;

	public Movie() {
		title = "Not Set";
		genre = "Not Set";
	}

	public Movie(String newTitle, String newGenre, int newMinutes, String newMedia) {
		title = newTitle;
		genre = newGenre;
		setMinutes(newMinutes);
		setMedia(newMedia);
	
	}

	public abstract void setMedia(String newMedia);

	public abstract String getMedia();

	public abstract int getMinutes();

	public abstract void setMinutes(int minutes);

	public int compareTo(Movie newMovie) {
		return title.compareTo(newMovie.title);
	}

	public String getTitle() {
		if (this.title.isEmpty()) {
			return ("Not Set");
		}
		return title;
	}

	public void setTitle(String newTitle) {
		this.title = newTitle;
	}

	public String getGenre() {
		if (this.genre.isEmpty()) {
			return ("Not Set");
		}
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Media: " + getMedia() + " Title: " + getTitle() + " Genre: " + getGenre() + " ]";
	}

}
