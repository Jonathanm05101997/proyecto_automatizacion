package co.com.choucair.certification.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona la universidad choucair").located(By.xpath("//div[@id='universidad']//Strong"));
    public static  final Target INPUT_COURSE = Target.the("buscar el curso").located(By.id("coursesearchbox"));
    public static  final Target BUTTON_GO = Target.the("Da Click para buscar el curso").located(By.id("//button[@class='btn btn-secondary']"));
    public static  final Target SELECT_COURSE = Target.the("Da Click para buscar el curso").located(By.id("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));
    public static final  Target NAME_COURSE =Target.the("Extrae el nombre del Curso").located(By.xpath("//h1[contains(text(),'Recursos Automatizacion Bancolombia')]"));
}
