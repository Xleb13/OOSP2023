package Pattern12;

public class Player {
    public static void main(String[] args) {
        MusicComponent track1 = new Track("Mick Gordon - The Only Thing They Fear Is You");
        MusicComponent track2 = new Track("Eden FM - Stay");
        MusicComponent track3 = new Track("Kovsh - On a Mission");

        MusicContainer playlist = new MusicContainer("Chill Playlist\n------------------");
        playlist.add(track1);
        playlist.add(track2);
        playlist.add(track3);

        MusicContainer album = new MusicContainer("Mashup Album\n--------------------");
        MusicComponent albumTrack1 = new Track("AVICII & RICK ASTLEY - Never Gonna Wake You Up");
        MusicComponent albumTrack2 = new Track("Пророк Санбой - Big Iron");
        album.add(albumTrack1);
        album.add(albumTrack2);

        MusicContainer library = new MusicContainer("Библиотека\n*****************");
        library.add(playlist);
        library.add(album);

        library.play();
    }
}
