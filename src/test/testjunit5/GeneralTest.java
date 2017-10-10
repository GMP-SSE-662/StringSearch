import com.eaio.stringsearch.CharIntMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneralTest
{
    @Test
    @Tag("Duplicate")
    @DisplayName("Duplicate of native tests to ensure correct functionality.")
    public void testTest()
    {
        CharIntMap testMap = new CharIntMap();
        assertFalse(testMap.equals(null));
        assertTrue(testMap.equals(testMap));
        assertTrue(testMap.equals(new CharIntMap()));
        assertFalse(testMap.equals(new CharIntMap(2, (char) 0, 0)));
        assertTrue(testMap.hashCode() == new CharIntMap().hashCode());
    }
}
