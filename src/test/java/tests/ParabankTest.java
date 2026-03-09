package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ParabankRegisterPage;

public class ParabankTest extends BaseTest {

    @Test
    public void testRegisterAndLogin() {

        ParabankRegisterPage page = new ParabankRegisterPage(driver);

        page.registerUser();
    }
}