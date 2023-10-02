package movie.nkp.com.movielist.repo;

import movie.nkp.com.movielist.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    Optional<?> findMovieByimdbId(String imdbId);
}
