package co.com.choucair.certification.proyecto.questions;

import co.com.choucair.certification.proyecto.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answers1 implements Question<Boolean> {
    private String question;

    public Answers1(String question) {
        this.question = question;
    }


    public static Answers1 toThe(String question) {
        return new Answers1(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse= Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if (question.equals((nameCourse))){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
