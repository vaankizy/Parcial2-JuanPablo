package co.edu.unicauca.saberpro.question.domain.model;

import co.edu.unicauca.saberpro.question.domain.state.IQuestionLifecycleState;
import co.edu.unicauca.saberpro.question.domain.state.QuestionDraftState;
import java.util.ArrayList;
import java.util.List;

public class QuestionItem {
    private Long id;
    private String wording;
    private String category;
    private QuestionItemStatus currentStatus;
    private List<ChoiceOption> optionsList = new ArrayList<>();
    private IQuestionLifecycleState activeState;

    public QuestionItem() {
        this.currentStatus = QuestionItemStatus.DRAFT;
        this.activeState = new QuestionDraftState();
    }

    public void sendToReviewProcess() {
        this.activeState.handleReviewSubmission(this);
    }

    public void processValidationOutcome(boolean isApproved) {
        this.activeState.handleValidationResult(this, isApproved);
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getWording() { return wording; }
    public void setWording(String wording) { this.wording = wording; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public QuestionItemStatus getCurrentStatus() { return currentStatus; }
    public void setCurrentStatus(QuestionItemStatus currentStatus) { this.currentStatus = currentStatus; }

    public List<ChoiceOption> getOptionsList() { return optionsList; }
    public void setOptionsList(List<ChoiceOption> optionsList) { this.optionsList = optionsList; }

    public IQuestionLifecycleState getActiveState() { return activeState; }
    public void setActiveState(IQuestionLifecycleState activeState) { this.activeState = activeState; }
}
