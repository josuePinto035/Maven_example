import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;


public class DummyTest {

    @Before
    public void beforeTestDo(){
        System.out.println("Antes de las pruebas");
    }

    @Test
    public void dummyTest1(){
        System.out.println("This is the test");
        assertTrue(true);
    }

    @After
    public void afterTestDo(){
        System.out.println("Despues de las pruebas");
    }
}
