import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class FirstClassTest {

	@Test
	public void setup(){
		String str1 = "Sachin";
		String str2 = "Sah";
		assertNotEquals(str1, str2);
	}

}
