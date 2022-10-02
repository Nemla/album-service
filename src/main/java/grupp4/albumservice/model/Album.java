package grupp4.albumservice.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "album")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int albumId;
    @Column(name = "albumName")
    private String albumName;
    @Column(name = "releaseDate")
    private Date releaseDate;

    public Album() {
    }

    public Album(int albumId, String albumName, Date releaseDate) {
        this.albumId = albumId;
        this.albumName = albumName;
        this.releaseDate = releaseDate;
    }

    public Album(String albumName, Date releaseDate){
        this.albumName = albumName;
        this.releaseDate = releaseDate;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}

