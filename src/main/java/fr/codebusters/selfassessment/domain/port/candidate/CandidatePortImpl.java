package fr.codebusters.selfassessment.domain.port.candidate;

import fr.codebusters.selfassessment.domain.model.Candidate;

public class CandidatePortImpl implements CandidatePort{
    private final CandidateClientPort candidateClientPort;


    public CandidatePortImpl(CandidateClientPort candidateClientPort) {
        this.candidateClientPort = candidateClientPort;
    }

    @Override
    public void addCandidate(Candidate candidate) {
        candidateClientPort.addCandidate(candidate);
    }
}
