import com.org.ExternalAPI;
import com.org.MyService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class MyServiceTest {
    @Test // We want to test MyService
    public void testExternalApi() {
        // But External API hasn't been implemented yet... How do we test??
        // We create a mock implementation, just for the sake of this test case


        // Mocking the ExternalAPI et = new ExternalAPI() with
        // Mocking ExternalAPI with Mockito.mock(ExternalAPI.class)
        ExternalAPI et = Mockito.mock(ExternalAPI.class);

        // We define here what the implementation would look like
        // So, if we do et.getData, it must return the value in thenReturn()
        // In this way we mock the ExternamAPI's getData() method
        when(et.getData()).thenReturn("This is a mock api data");
        MyService ms1 = new MyService();
        String res1 = ms1.fetchData(et);
        assertEquals("This is a mock api data", res1); // Since expected meets mock data we defined, test is OK

        when(et.getData()).thenReturn("Hello World");
        MyService ms2 = new MyService();
        String res2 = ms2.fetchData(et);
        assertEquals("Hello World", res2);
    }
}
