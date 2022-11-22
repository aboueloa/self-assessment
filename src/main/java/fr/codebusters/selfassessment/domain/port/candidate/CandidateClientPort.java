package fr.codebusters.selfassessment.domain.port.candidate;

import fr.codebusters.selfassessment.domain.model.Candidate;

public interface CandidateClientPort {
    void addCandidate(Candidate candidate);
}
