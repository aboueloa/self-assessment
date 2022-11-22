package fr.codebusters.selfassessment.resources;

import fr.codebusters.selfassessment.domain.model.Candidate;
import fr.codebusters.selfassessment.domain.port.candidate.CandidatePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/candidate")
public class CandidateResources {
    private final CandidatePort candidatePort;

    @Autowired
    public CandidateResources(CandidatePort candidatePort) {
        this.candidatePort = candidatePort;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public void saveCandidate(@RequestBody Candidate candidate) {
        candidatePort.addCandidate(candidate);
    }
}
