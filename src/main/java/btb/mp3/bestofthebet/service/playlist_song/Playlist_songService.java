package btb.mp3.bestofthebet.service.playlist_song;

import btb.mp3.bestofthebet.model.PlayList;
import btb.mp3.bestofthebet.model.Playlist_Song;
import btb.mp3.bestofthebet.model.Song;

import java.util.List;

public interface Playlist_songService {
    List<Playlist_Song> playlistSong (PlayList playList);
}
