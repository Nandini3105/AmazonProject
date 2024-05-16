package project1;

import org.testng.annotations.Test;

import amazonPages.HomePage;

//try searching for product like shoe
public class TestCase5 extends LaunchandQuit {
@Test()
public void search()
{
	HomePage h=new HomePage(driver);
	h.searchbox_Textfield();
}
}
