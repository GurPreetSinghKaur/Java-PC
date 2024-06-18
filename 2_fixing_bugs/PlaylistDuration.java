import java.util.List;

/* 

PlaylistDuration is a class with a `solve` method which takes a list of Songs, some of which are in 
a playlist, and returns the total duration of all the songs in the playlist.

Unfortunately, there's a bug in the `solve` method and the durations are sometimes incorrect.

When you first compile and run this program, you see some SUCCESS and some FAILURE. 
ALL of the inputs are correct - the logic in the `solve` method is not correct.

The `Song` class is also correct - you don't need to change it, but you should look at it carefully.

Can you find and fix the bug in the `solve` method? Do not change the inputs or the `Song` class.

 */

public class PlaylistDuration {
	
	/* FIX THIS METHOD */	
	static int solve(List<Song> allSongs) {
		int totalDuration = 0;

		for (Song song : allSongs) {	
		//totalDuration should only record the songs which are in playlist
		if (song.getIsInPlaylist())	totalDuration += song.getLength();		

		}

		return totalDuration;
}
	
/* Read but do not modify this class */
	static class Song {
		private String name;
		private int length;
		private boolean isInPlaylist;

		public Song(String name, int length, boolean isInPlaylist) {
				this.name = name;
				this.length = length;
				this.isInPlaylist = isInPlaylist;
		}

		public boolean getIsInPlaylist(){
			return this.isInPlaylist;
		}

		public String getName() {
				return name;
		}

		public int getLength() {
				return length;
		}
}

	public static void main(String[] args) {
		
		// Don't modify this code
		var s1 = new Song("Song1", 180, true);
		var s2 = new Song("Song2", 240, true);
		var s3 = new Song("Song3", 210, false);
		var s4 = new Song("Song4", 300, true);
		var s5 = new Song("Song5", 190, false);		
		tryInput(List.of(s1), 180);		
		tryInput(List.of(s2), 240);		
		tryInput(List.of(s1,s2,s4), 720);		
		tryInput(List.of(s1,s2,s4,s4), 1020);		
		tryInput(List.of(s2,s3,s4), 540);		
		tryInput(List.of(s1,s2,s4,s4,s1,s2), 1440);		
		tryInput(List.of(s1,s2,s3,s4,s5), 720);		
		
	}

	static void tryInput(List<Song> input, int expectedOutput){
						
		int result = PlaylistDuration.solve(input);
		
		if(result == expectedOutput){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}

