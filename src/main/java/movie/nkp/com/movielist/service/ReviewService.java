package movie.nkp.com.movielist.service;

import movie.nkp.com.movielist.model.Movie;
import movie.nkp.com.movielist.model.Review;
import movie.nkp.com.movielist.repo.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepo reviewRepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String imdbid) {
        Review review = reviewRepo.insert(new Review(reviewBody));
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbid))
                .apply(new Update().push("reviewIds").value(review))
                .first();
        return review;
    }

}
