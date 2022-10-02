package grupp4.albumservice.repository;

import grupp4.albumservice.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {
    Album findById(int albumId);
}
