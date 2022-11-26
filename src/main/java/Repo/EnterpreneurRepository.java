package Repo;

import models.Enterpreneur;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnterpreneurRepository extends MongoRepository<Enterpreneur,Integer> {

}
