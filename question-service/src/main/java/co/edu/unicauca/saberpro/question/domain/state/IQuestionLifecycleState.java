package co.edu.unicauca.saberpro.question.domain.state;

import co.edu.unicauca.saberpro.question.domain.model.QuestionItem;

public interface IQuestionLifecycleState {
    void handleReviewSubmission(QuestionItem context);
    void handleValidationResult(QuestionItem context, boolean approved);
}
