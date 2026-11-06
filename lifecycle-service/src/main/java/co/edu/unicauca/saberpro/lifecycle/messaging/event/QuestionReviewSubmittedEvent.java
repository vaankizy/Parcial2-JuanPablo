package co.edu.unicauca.saberpro.lifecycle.messaging.event;

import java.io.Serializable;

public class QuestionReviewSubmittedEvent implements Serializable {
    private Long questionId;
    private String currentCategory;

    public QuestionReviewSubmittedEvent() {}

    public QuestionReviewSubmittedEvent(Long questionId, String currentCategory) {
        this.questionId = questionId;
        this.currentCategory = currentCategory;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getCurrentCategory() {
        return currentCategory;
    }

    public void setCurrentCategory(String currentCategory) {
        this.currentCategory = currentCategory;
    }
}
