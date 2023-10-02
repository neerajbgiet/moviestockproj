package movie.nkp.com.movielist.repo;

import movie.nkp.com.movielist.model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepo extends MongoRepository<Review, ObjectId> {

}
