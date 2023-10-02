package movie.nkp.com.movielist.controller;

import movie.nkp.com.movielist.api.MovieApi;
import movie.nkp.com.movielist.service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieApiController implements MovieApi {

    @Autowired
    private MovieService movieService;

    @Override
    public ResponseEntity<?> getAllMovies() {
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getMovieById(ObjectId id) {
        return new ResponseEntity<>(movieService.getMovieById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getMovieByImdbId(String id) {
        return new ResponseEntity<>(movieService.getMovieByImdbId(id), HttpStatus.OK);
    }
}
