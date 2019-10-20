
public class MP4 extends Movie{

	public int minutes;
	public String media;
	
	public MP4() {
		title = "Not set";
		genre = "Not set";
		minutes = 60;
		media = "Mp4";
	}
	
	public MP4(String newTitle, String newGenre, int newMinutes, String newMedia) {
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
		return super.toString() + "MP4 [ minutes: " + getMinutes() ;
	}


}
