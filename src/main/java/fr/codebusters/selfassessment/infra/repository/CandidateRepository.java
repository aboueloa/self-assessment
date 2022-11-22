package fr.codebusters.selfassessment.infra.repository;

import fr.codebusters.selfassessment.infra.model.CandidateEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends MongoRepository<CandidateEntity, String> {
}
