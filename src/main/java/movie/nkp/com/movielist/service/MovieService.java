package movie.nkp.com.movielist.service;

import movie.nkp.com.movielist.model.Movie;
import movie.nkp.com.movielist.repo.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(ObjectId objectId) {
        System.out.println(" Fetching movei for id " + objectId);
        return movieRepository.findById(objectId);
    }

    public Optional<?> getMovieByImdbId(String imdbId) {
        return movieRepository.findMovieByimdbId(imdbId);
    }


}
