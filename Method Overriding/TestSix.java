//its very important for screenig individuals

interface WebDriver {
	void get();
	void windows();
}

class FirefoxDriver implements WebDriver {
	void get();
	void windows();
	void x();
	void y();
	
	WebDriver driver = new FirefoxDriver();
	driver.get(); //compile time:WebDriver 	runtime:FirefoxDriver
	driver.windows(); //compile time:WebDriver	runtime:FirefoxDriver
	
	//driver.x(); //compile: WebDriver and compiler error
	
	FirefoxDriver f = (FirefoxDriver)driver;
	f.x();
	f.y();
	
}