
public class BluRay extends Movie {
	
	public int minutes;
	public String media;
	
	public BluRay() {
		title = "";
		genre = "";
		minutes = 0;
		media = "BluRay";
	}
	
	public BluRay(String newTitle, String newGenre, int newMinutes, String newMedia) {
		super(newTitle, newGenre, newMinutes, newMedia);
		setTitle(title);
		setGenre(genre);
		setMinutes(minutes);
		setMedia(media);
	}

	public int getMinutes() {
		if (minutes < 0) {
			return 0;
		}else {
			return minutes;
		}
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public void setMedia(String media) {
		this.media = media;
	}
	
	public String getMedia() {
		return media;
	}

	public String toString() {
		return super.toString() + "BluRay [ minutes: " + getMinutes() ;
	}
}

