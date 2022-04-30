import static org.junit.Assert.*;
import org.junit.*;

public class SkillTester {
    @Test
    public void palindromer() {
        assertEquals("Noo", SkillDemo.palindrome("No"));
    }
}