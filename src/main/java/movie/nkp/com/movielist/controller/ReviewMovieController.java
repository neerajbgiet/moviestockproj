package movie.nkp.com.movielist.controller;

import movie.nkp.com.movielist.api.ReviewApi;
import movie.nkp.com.movielist.repo.ReviewRepo;
import movie.nkp.com.movielist.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewMovieController implements ReviewApi {

    @Autowired
    private ReviewService reviewService;

    @Override
    public ResponseEntity<?> reviewByImdbId(String body, String imdbid) {
        return new ResponseEntity<>(reviewService.createReview(body, imdbid), HttpStatus.OK);
    }
}
