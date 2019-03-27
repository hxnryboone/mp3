package jenkins.model;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;

import jenkins.model.IdStrategy.CaseSensitive;

public class idFromFilenameTest {
	
	@Rule public JenkinsRule j = new JenkinsRule();

	@Test
    public void returnID() throws Exception {
		IdStrategy.CaseSensitive i = new IdStrategy.CaseSensitive();
    	assertEquals("aaaaaaa",i.idFromFilename("aaaaaaa"));
    }
	@Test
	 public void returnCap() throws Exception {
			IdStrategy.CaseSensitive i = new IdStrategy.CaseSensitive();
	    	assertEquals("AAA",i.idFromFilename("~a~a~a"));
	    }
}
