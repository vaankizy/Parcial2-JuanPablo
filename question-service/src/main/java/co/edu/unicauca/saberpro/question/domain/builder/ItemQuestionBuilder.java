package co.edu.unicauca.saberpro.question.domain.builder;

import co.edu.unicauca.saberpro.question.domain.model.ChoiceOption;
import co.edu.unicauca.saberpro.question.domain.model.QuestionItem;
import java.util.ArrayList;
import java.util.List;

public class ItemQuestionBuilder implements IItemQuestionBuilder {

    private String textBody;
    private String targetCategory;
    private final List<ChoiceOption> tempChoices = new ArrayList<>();

    @Override
    public IItemQuestionBuilder withWording(String text) {
        this.textBody = text;
        return this;
    }

    @Override
    public IItemQuestionBuilder inCategory(String cat) {
        this.targetCategory = cat;
        return this;
    }

    @Override
    public IItemQuestionBuilder addChoice(String choiceText, boolean isCorrect) {
        this.tempChoices.add(new ChoiceOption(choiceText, isCorrect));
        return this;
    }

    @Override
    public QuestionItem buildItem() {
        QuestionItem item = new QuestionItem();
        item.setWording(this.textBody);
        item.setCategory(this.targetCategory);
        item.setOptionsList(this.tempChoices);
        return item;
    }
}
