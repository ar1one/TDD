import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

public class PhoneBookTests {
    PhoneBook pb = null;

    @BeforeEach
    public void before() {
        pb = new PhoneBook();
    }

    @AfterEach
    public void after() {
        pb = null;
    }

    @Test
    public void addTest() {
        String name = "user1";
        String number = "123456";
        int expected = 1;
        Assertions.assertEquals(expected, pb.add(name, number));
    }

    @Test
    public void findNumberTest() {
        String name = "Frank";
        String number = "8800555355";
        pb.add(name, number);
        Assertions.assertEquals(name, pb.findNumber(number));
    }

    @Test
    public void findByName() {
        String name = "Frank";
        String number = "8800555355";
        pb.add(name, number);
        Assertions.assertEquals(number, pb.findByName(name));
    }

//    findByName — найти номер по имени без полного перебора;
}
