package btb.mp3.bestofthebet.service.songservice;

import btb.mp3.bestofthebet.model.Song;
import btb.mp3.bestofthebet.model.User;
import btb.mp3.bestofthebet.repository.SongRepository;
import btb.mp3.bestofthebet.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class SongService implements ISongService {
    @Autowired
    SongRepository songRepository;


    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Optional<Song> findById(Long id) {
        return songRepository.findById(id);
    }

    @Override
    public void save(Song model) {
        songRepository.save(model);
    }

    @Override
    public void delete(Long id) {
        songRepository.deleteById(id);
    }


    @Override
    public List<Song> findSongByUser(User user) {
        return songRepository.findByUser(user);
    }

    public List<Song> findTop6View(){
        return songRepository.findAllByOrderByViewsDesc();
    }

    public List<Song> findTop6New(){
        return songRepository.findAllByOrderByCreatDateDesc();
    }

    @Override
    public Song findByCreatDate(Date date) {
        return songRepository.findAllByCreatDate(date);
    }

}
