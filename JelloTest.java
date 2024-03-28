import org.junit.Test;
import static org.junit.Assert.*;

public class JelloTest {

    @Test
    public void testReturnNothing() {
        Jello jello = new Jello();
        int result = jello.returnNothing();
        assertEquals(1, result);
    }
}