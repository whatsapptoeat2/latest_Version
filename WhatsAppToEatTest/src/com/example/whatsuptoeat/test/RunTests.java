package com.example.whatsuptoeat.test;

import junit.framework.TestCase;
import cucumber.api.android.RunWithCucumber;
 
//@RunWith(Cucumber.class)
//@Cucumber.Options(format={"pretty", "html:target/cucumber"})


@RunWithCucumber(glue = "com.example.whatsuptoeat.test", features = "features")
public class RunTests extends TestCase{

}
