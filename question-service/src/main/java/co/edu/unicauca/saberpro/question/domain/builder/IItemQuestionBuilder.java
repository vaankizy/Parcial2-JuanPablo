package co.edu.unicauca.saberpro.question.domain.builder;

import co.edu.unicauca.saberpro.question.domain.model.QuestionItem;

public interface IItemQuestionBuilder {
    IItemQuestionBuilder withWording(String text);
    IItemQuestionBuilder inCategory(String cat);
    IItemQuestionBuilder addChoice(String choiceText, boolean isCorrect);
    QuestionItem buildItem();
}
