package Repo;

import models.Investor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvestorRepository extends MongoRepository<Investor,Integer> {

}
