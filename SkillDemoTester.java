import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void palindromer() {
        assertEquals("noon", SkillDemo.palindrome("no"));
    }
}