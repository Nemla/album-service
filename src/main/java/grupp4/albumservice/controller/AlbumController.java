package grupp4.albumservice.controller;

import grupp4.albumservice.model.Album;
import grupp4.albumservice.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @PostMapping("/")
    public Album saveAlbum(@RequestBody Album album){
        System.out.println("testar i controller spara album");
        return albumService.saveAlbum(album);
    }

    @GetMapping("/{albumId}")
    public Album findById(@PathVariable("albumId") int albumId){
        System.out.println("testar att hitta album med id i controllern");
        return albumService.findById(albumId);
    }

}