import static org.junit.Assert.*;

public class AppTest {
    @Test public void testSum() 
    {
	    App testApp = new App();
	    assertEquals(60, testApp.add2());
    }
}

