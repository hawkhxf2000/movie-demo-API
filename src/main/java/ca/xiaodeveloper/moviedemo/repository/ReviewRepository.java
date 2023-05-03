package ca.xiaodeveloper.moviedemo.repository;

import ca.xiaodeveloper.moviedemo.pojo.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
