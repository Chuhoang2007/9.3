import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testTinhTong() {
        // Test đúng: 5 + 5 phải bằng 10
        assertEquals(11, Main.tinhTong(5, 5));
    }
}