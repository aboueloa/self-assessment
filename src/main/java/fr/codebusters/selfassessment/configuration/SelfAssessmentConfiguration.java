package fr.codebusters.selfassessment.configuration;

import fr.codebusters.selfassessment.domain.port.candidate.CandidateClientPort;
import fr.codebusters.selfassessment.domain.port.candidate.CandidatePort;
import fr.codebusters.selfassessment.domain.port.candidate.CandidatePortImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SelfAssessmentConfiguration {
    @Bean
    public CandidatePort candidatePort(CandidateClientPort candidateClientPort) {
        return new CandidatePortImpl(candidateClientPort);
    }
}
