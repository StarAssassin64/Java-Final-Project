package com.starassassin.javafinalproject.services;

import com.starassassin.javafinalproject.Model.Question;
import com.starassassin.javafinalproject.Model.QuestionMultipleChoice;
import com.starassassin.javafinalproject.repository.QuestionRepository;

import java.util.ArrayList;

public class DatabaseConfiguration {
    
    public void SetupDatabase(QuestionRepository questionRepository) {
        QuestionMultipleChoice question1 = new QuestionMultipleChoice();
        question1.setQuestion("Is Spring Framework Open Source or Closed Source");
        question1.setCorrectAnswer("Open Source");
        question1.setWrongAnswer1("Closed Source");
        QuestionMultipleChoice question2 = new QuestionMultipleChoice();
        question2.setQuestion("What is Spring Framework's License?");
        question2.setCorrectAnswer("Apache 2.0 Software License");
        question2.setWrongAnswer1("GPL-3.0 Software License");
        question2.setWrongAnswer2("WTFPL Public License");
        question2.setWrongAnswer3("MIT License");
        QuestionMultipleChoice question3 = new QuestionMultipleChoice();
        question3.setQuestion("What is the primary dependency manager we have been using for Spring Framework");
        question3.setCorrectAnswer("Maven");
        question3.setWrongAnswer1("Gradle");
        QuestionMultipleChoice question4 = new QuestionMultipleChoice();
        question4.setQuestion("What kind of application does Spring Framework produce?");
        question4.setCorrectAnswer("Web Application");
        question4.setWrongAnswer1("Console Application");
        question4.setWrongAnswer2("Local GUI Application");
        question4.setWrongAnswer3("Headless Server Application");
        QuestionMultipleChoice question5 = new QuestionMultipleChoice();
        question5.setQuestion("What controls web pages in Spring Framework?");
        question5.setCorrectAnswer("Controller");
        question5.setWrongAnswer1("Bean");
        question5.setWrongAnswer2("Model");
        QuestionMultipleChoice question6 = new QuestionMultipleChoice();
        question6.setQuestion("What language does Spring Framework NOT Support?");
        question6.setCorrectAnswer("TypeScript");
        question6.setWrongAnswer1("Java");
        question6.setWrongAnswer2("Kotlin");
        question6.setWrongAnswer3("Groovy");
        QuestionMultipleChoice question7 = new QuestionMultipleChoice();
        question7.setQuestion("Does web pages need to be in the same project as the rest of the Spring Framework Project?");
        question7.setCorrectAnswer("False");
        question7.setWrongAnswer1("True");
        
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        
        questionRepository.saveAll(questions);
    }
    
}
