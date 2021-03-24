package board2;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/contextXML/applicationContext.xml"})
public class ApplicationContextTest {
	

	@Inject
	private ApplicationContextTest ctxt;
	
	@Test
	public void test() {
		System.out.println(dct);
}
