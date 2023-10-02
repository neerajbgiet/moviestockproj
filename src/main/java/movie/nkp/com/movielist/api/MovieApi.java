package movie.nkp.com.movielist.api;

import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/api/movies")
public interface MovieApi {

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    ResponseEntity<?> getAllMovies();

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    ResponseEntity<?> getMovieById(@RequestParam(value = "id", required = true) ObjectId id);

    @RequestMapping(value = "/imdbid", method = RequestMethod.GET)
    ResponseEntity<?> getMovieByImdbId(@RequestParam(value = "imdbid", required = true) String id);

}
