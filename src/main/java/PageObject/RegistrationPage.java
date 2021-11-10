package PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage  {
    public   SelenideElement
        profileButton = $(".welcome-text-desktop"),
        registrationButton = $(".registration_link"),
        emailInput = $("#Email"),
        passwordInput = $("#register-password"),
        confirmPasswordInput = $("#ConfirmPassword");

}
