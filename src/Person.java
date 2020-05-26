import java.time.LocalDate;
import java.util.Optional;

public class Person {
    String firstName;
    String lastName;
    LocalDate birthdate;

    public Person(String firstName, String lastName, LocalDate birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String createUsername()
    {
        return (this.getFirstName().charAt(0) + this.getLastName()).toLowerCase() +
                Optional.ofNullable(this.getBirthdate()).orElse(LocalDate.now()).getYear();
    }
}
