package fr.codebusters.selfassessment.infra.adapter;

import fr.codebusters.selfassessment.domain.model.Candidate;
import fr.codebusters.selfassessment.domain.port.candidate.CandidateClientPort;
import fr.codebusters.selfassessment.infra.mapper.CandidateMapper;
import fr.codebusters.selfassessment.infra.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateClientAdapter implements CandidateClientPort {
    private final CandidateRepository candidateRepository;
    private final CandidateMapper candidateMapper;

    @Autowired
    public CandidateClientAdapter(CandidateRepository candidateRepository, CandidateMapper candidateMapper) {
        this.candidateRepository = candidateRepository;
        this.candidateMapper = candidateMapper;
    }

    @Override
    public void addCandidate(Candidate candidate) {
        candidateRepository.save(candidateMapper.toCandidateEntity(candidate));
    }
}
