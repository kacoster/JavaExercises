/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdomeexercises;

/**
 *
 * @author kudat
 */
public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
        Song curr = this;
        Song nxt = this.nextSong;
        
        while(curr != null && nxt != null)
        {
            curr = curr.nextSong;
            nxt = nxt.nextSong.nextSong;
            
            if(curr == nxt){
            return true;
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}





