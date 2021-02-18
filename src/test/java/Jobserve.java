import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Jobserve {

	@Test
	public void getTitle() {
		System.setProperty("webdriver.chrome.driver", "E:\\Jenkins\\Test_CI\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jobserve.com/in/en/Job-Search/");
		Assert.assertTrue(driver.getPageSource().contains(driver.getTitle()));
	}
}
