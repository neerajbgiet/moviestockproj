package movie.nkp.com.movielist.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/api/movies")
public interface ReviewApi {

    @RequestMapping(value = "/review", method = RequestMethod.POST)
    ResponseEntity<?> reviewByImdbId(@RequestParam(value = "reviewbody", required = true) String body,
                                     @RequestParam(value = "imdbid", required = true) String imdbid);

}
