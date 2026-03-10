package utils;

import org.apache.commons.lang3.RandomStringUtils;
public class TestData {
    @SuppressWarnings("deprecation")
    
	public static String username = "user_"+RandomStringUtils.randomAlphanumeric(5);

    public static String password = "Test@123";	 
    static {
        Log.info("Generated Username: " + username);
        Log.info("Show password: "+ password);
    }
}
