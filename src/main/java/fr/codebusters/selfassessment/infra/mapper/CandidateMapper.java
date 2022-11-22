package fr.codebusters.selfassessment.infra.mapper;

import fr.codebusters.selfassessment.domain.model.Candidate;
import fr.codebusters.selfassessment.infra.model.CandidateEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(
        componentModel = "spring"
)
public interface CandidateMapper {
    CandidateEntity toCandidateEntity(Candidate candidate);
    Candidate toCandidate(CandidateEntity candidateEntity);
}
