package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class SeleniumWithJUnitTest {
    private static SeleniumExample seleniumExample;
    private String expectedTitle = "Logowanie – Konta Google";

    @Before
    public void setUp(){
        seleniumExample = new SeleniumExample();
    }

    @After
    public void tearDown(){
        seleniumExample.closeWindow();
    }

    @Test
    public void ifPageTitleIsGoogle(){
        String pageTitle = seleniumExample.getTitle();
        assertEquals(expectedTitle, pageTitle);
        seleniumExample.writeSentenceInSearchBox();

    }
}
