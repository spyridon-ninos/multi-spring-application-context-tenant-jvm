package com.ninos;

import com.ninos.firstcontext.FirstContextConfig;
import com.ninos.secondcontext.SecondContextConfig;
import com.ninos.thirdcontext.ThirdContextConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Hello world!
 *
 */
public class App {

	private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
	    new SpringApplicationBuilder(FirstContextConfig.class).run(args);
	    new SpringApplicationBuilder(ThirdContextConfig.class).run(args);

	    // the first and third one seem to work here
	    // even if we throwed an out of memory error from the third one

	    // this stops the execution of main - thus, it's last
	    new SpringApplicationBuilder(SecondContextConfig.class).run(args);
    }
}
