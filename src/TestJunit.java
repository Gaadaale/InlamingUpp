import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {
    @Test
    public void TestToEng() {
        //Arrange

        log Convert = new log();
        String actual = Convert.toEnglish("*");
        assertEquals("E",actual);
    }
        @Test
        public void TestToMorshe() {
            //Arrange
        log Convert = new log();
        String actual = Convert.toMorshe("T");
        assertEquals("-",actual);
    }    @Test
        public void tesToeNG() {
            //Arrange
            log Convert = new log();
            String actual = Convert.tesToeNG("I");
            assertEquals("**",actual);
    }@Test
    public void tesToMoshe() {
        //Arrange
        log Convert = new log();
        String actual = Convert.tesToMoshe("-*");
        assertEquals("N",actual);

    }


}