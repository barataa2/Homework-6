package DataObject;

import com.github.javafaker.Faker;

public interface RegistrationData {
    Faker faker = new Faker();

    String
        firstName = faker.name().firstName(),
        lastName = "baratashvili",
        email = "giobaratashvili7@gmail.com",
        password = "paroli123";

}
