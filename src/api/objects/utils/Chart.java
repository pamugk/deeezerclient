package api.objects.utils;

import com.psu.deezerunofficialapp.api.objects.playables.Album;
import com.psu.deezerunofficialapp.api.objects.playables.Artist;
import com.psu.deezerunofficialapp.api.objects.playables.Playlist;
import com.psu.deezerunofficialapp.api.objects.playables.Track;

import java.util.List;

public class Chart {
    private List<Track> tracks;
    private List<Album> albums;
    private List<Artist> artists;
    private List<Playlist> playlists;

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }
}
