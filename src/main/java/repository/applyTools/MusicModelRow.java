package repository.applyTools;

public class MusicModelRow {

    private final int number;
    private final String name;
    private final String artist;
    private final String category;

    public MusicModelRow(int number, String name, String artist, String category) {
        this.number = number;
        this.name = name;
        this.artist = artist;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return  number +
                " " + name  +
                " " + artist +
                " " + category ;

    }
}
