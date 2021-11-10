
package StepObject;

import PageObject.RegistrationPage;
import io.qameta.allure.Step;

public class RegistrationPageSteps extends RegistrationPage {
    @Step("test")
    public RegistrationPageSteps profileButton() {
        profileButton.click();
        return this;
    }
    public RegistrationPageSteps registrationButton(){
        registrationButton.click();
        return this;
    }
    public RegistrationPageSteps emailInput(String s){

        return this;
    }

}

