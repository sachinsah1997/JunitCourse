import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestResult {

	public static void main(String s[]) {
		
		Result result = JUnitCore.runClasses(VariousAssert.class);
		
		for(Failure fail : result.getFailures()) {
			System.out.println(fail.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
