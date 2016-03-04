package com.fetme;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.validation.constraints.AssertTrue;
import java.util.List;
import java.util.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BootdemoApplication.class)
public class BootdemoApplicationTests {

    protected static final Integer ACCOUNT_1 = 1;
    protected static final String ACCOUNT_1_NAME = "Hello";

    @Autowired
    BootdemoApplication application;

    @Test
    public void validGreeting() {
        Logger.getGlobal().info("Start validGreeting test");
        String greeting = application.sayHello();

        Assert.assertNotNull(greeting);
        Assert.assertTrue(greeting.contains("Hello"));
        Logger.getGlobal().info("End validGreetingId test");
    }

    // @Test
    // public void validGreetingText() {
    //     Logger.getGlobal().info("Start validGreetingText test");
		//
		// 		String greeting = application.greeting("Name", new Model().addAttribute("name", "Carl"));
		//
    //     Assert.assertNotNull(greeting);
    //     Assert.assertEquals(greeting.contains("Carl"));
    //     Logger.getGlobal().info("End validGreetingText test");
    // }

    // @Test
    // public void validGreetingPartialText() {
    //     Logger.getGlobal().info("Start validGreetingPartialText test");
    //     List<Greeting> greetings = application.findByPartialText("He");
		//
    //     Assert.assertNotNull(greetings);
    //     Assert.assertTrue(greetings.size()>0);
    //     Assert.assertEquals(ACCOUNT_1_NAME, greetings.iterator().next().getText());
    //     Logger.getGlobal().info("End validGreetingText test");
    // }
}
