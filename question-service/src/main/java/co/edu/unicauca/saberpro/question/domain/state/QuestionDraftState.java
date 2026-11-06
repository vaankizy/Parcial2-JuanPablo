package co.edu.unicauca.saberpro.question.domain.state;

import co.edu.unicauca.saberpro.question.domain.model.QuestionItem;
import co.edu.unicauca.saberpro.question.domain.model.QuestionItemStatus;

public class QuestionDraftState implements IQuestionLifecycleState {

    @Override
    public void handleReviewSubmission(QuestionItem context) {
        context.setCurrentStatus(QuestionItemStatus.PENDING_REVIEW);
        context.setActiveState(new QuestionPendingReviewState());
    }

    @Override
    public void handleValidationResult(QuestionItem context, boolean approved) {
        throw new IllegalStateException("Una pregunta en borrador no se puede aprobar/rechazar directamente.");
    }
}
