import StepObject.RegistrationPageSteps;
import Utils.ChromeRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationPageTests extends ChromeRunner {

    @Test
    public void registationPositiveCases (){
        RegistrationPageSteps steps = new RegistrationPageSteps();

        steps
            .profileButton()
            .registrationButton();


    }

}
