package citest.tests;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import citest.Profile;

public class ProfileTest {

	@Test
	public void test() {
		Profile profile = new Profile(); 
		assertThat(profile.getName(), is(""));
	}

}
