package gurpreet.junit.fixing_bugs;

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

}

