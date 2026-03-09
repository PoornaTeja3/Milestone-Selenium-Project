package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;

public class GUIElementsTest extends BaseTest {

    @Test
    public void testGUIElements() {

        GUIElementsPage page = new GUIElementsPage(driver);

        page.fillForm();
    }
}