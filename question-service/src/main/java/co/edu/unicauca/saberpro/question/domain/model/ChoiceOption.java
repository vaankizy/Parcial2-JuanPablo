package co.edu.unicauca.saberpro.question.domain.model;

public class ChoiceOption {
    private Long id;
    private String choiceText;
    private boolean rightChoice;

    public ChoiceOption() {}

    public ChoiceOption(String choiceText, boolean rightChoice) {
        this.choiceText = choiceText;
        this.rightChoice = rightChoice;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getChoiceText() { return choiceText; }
    public void setChoiceText(String choiceText) { this.choiceText = choiceText; }

    public boolean isRightChoice() { return rightChoice; }
    public void setRightChoice(boolean rightChoice) { this.rightChoice = rightChoice; }
}
