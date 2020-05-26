import java.time.LocalDate;

public class UsernameTest {
    public static void main(String[] args) {
        Person miki = new Person("Mikołaj", "Smith", LocalDate.of(1992,3,11));
        System.out.println(miki.createUsername());

        Person iness = new Person("Inessa", "Topsecret", null);
        System.out.println(iness.createUsername());

    }

}
