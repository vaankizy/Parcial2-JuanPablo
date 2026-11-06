package co.edu.unicauca.saberpro.question.domain.state;

import co.edu.unicauca.saberpro.question.domain.model.QuestionItem;
import co.edu.unicauca.saberpro.question.domain.model.QuestionItemStatus;

public class QuestionPendingReviewState implements IQuestionLifecycleState {

    @Override
    public void handleReviewSubmission(QuestionItem context) {
        throw new IllegalStateException("La pregunta ya se encuentra en proceso de revisión.");
    }

    @Override
    public void handleValidationResult(QuestionItem context, boolean approved) {
        if (approved) {
            context.setCurrentStatus(QuestionItemStatus.APPROVED);
        } else {
            context.setCurrentStatus(QuestionItemStatus.REJECTED);
        }
    }
}
