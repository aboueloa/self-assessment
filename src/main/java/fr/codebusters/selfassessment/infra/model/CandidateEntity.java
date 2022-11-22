package fr.codebusters.selfassessment.infra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "candidate")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateEntity {
    private String id;
    private String name;
    private String email;
}
