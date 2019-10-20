import java.util.ArrayList;
import java.util.Scanner;

public class MovieDriver {
	
	public static void main (String [] args) {
		
		ArrayList <Movie> mediaList = new ArrayList<>();
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Do you want to choose a movie? Yes or No?");
		
		String toContinue = userInput.nextLine();
		
		int count = 0;
		
		while(!toContinue.equalsIgnoreCase("no") && toContinue.equalsIgnoreCase("yes")) {
			
			System.out.println("BluRay or MP4?");
			
			String media = userInput.nextLine();
			
			System.out.println("Enter movie title: ");
			
			String title = userInput.nextLine();
			
			System.out.println("Enter movie genre: ");
			
			String genre = userInput.nextLine();
			
			System.out.println("Enter length of movie in minutes: ");
				
			int minutes = userInput.nextInt();
			
			userInput.nextLine();
			
			if (media.equalsIgnoreCase("bluray")) {
				mediaList.add(new BluRay(title, genre, minutes, media));
			} else if (media.equalsIgnoreCase("mp4")) {
				mediaList.add(new MP4(title, genre, minutes, media));
			} else {
				count+=1;
			}
			
			System.out.println("Do you want to choose a movie? Yes or No?");
			
			toContinue = userInput.nextLine();
		}
		
		for(int  i = 0; i < mediaList.size() ; i ++) {
			System.out.println(mediaList.get(i).toString());
		}
		
		if (count > 0) {
			System.out.println("Unknown media not added.");
		}
		
		userInput.close();
		
	}
}
