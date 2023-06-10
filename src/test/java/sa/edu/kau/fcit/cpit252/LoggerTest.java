package sa.edu.kau.fcit.cpit252;


import sa.edu.kau.fcit.cpit252.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTest {

    @Test
    public void shouldBeIdenticals()
    {
        Logger log1 = Logger.getLoggerInstance();
        Logger log2 = Logger.getLoggerInstance();
        assertEquals(log1, log2);
    }
}
