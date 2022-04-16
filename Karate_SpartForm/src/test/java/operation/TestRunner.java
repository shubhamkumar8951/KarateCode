package operation;

import com.intuit.karate.junit5.Karate;

public class TestRunner {
	
	@Karate.Test
	Karate getAPITest() {
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\feature\\test.feature";
		System.out.println(path);
		System.out.println(Karate.run(path).relativeTo(getClass()));
		return Karate.run("classpath:feature/test.feature").tags("@test");
		
	}

}
