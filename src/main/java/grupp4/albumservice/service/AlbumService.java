package grupp4.albumservice.service;

import grupp4.albumservice.model.Album;
import grupp4.albumservice.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public Album saveAlbum(Album album){
        System.out.println("test i spara album");
        return albumRepository.save(album);
    }


    public Album findById(int albumId){
        System.out.println("test i albumservice findbyid");
        return albumRepository.findById(albumId);
    }

}