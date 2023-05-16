import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ru.netology.PhoneBook;

public class PhoneBookTests {
    PhoneBook pb = null;

    @BeforeEach
    public void before(){
        pb = new PhoneBook();
    }

    @AfterEach
    public void after(){
        pb = null;
    }


}
