package co.edu.unicauca.saberpro.validation.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/validation")
public class AssessmentController {

    @PostMapping("/evaluate")
    public ResponseEntity<Map<String, Object>> evaluateQuestionPayload(@RequestBody Map<String, Object> payload) {
        boolean isValid = payload.get("wording") != null && payload.get("wording").toString().length() > 5;
        return ResponseEntity.ok(Map.of(
            "approved", isValid,
            "remarks", isValid ? "Criterios mínimos aprobados" : "Redacción muy corta"
        ));
    }
}
