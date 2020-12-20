package com.it.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeMessageTest extends BaseTest {
    @Test
    public void testMakeMessage() throws InterruptedException {
        app.login.login(validUser);
        Thread.sleep(2000);
        app.dashBoard.makeMessage();
        Thread.sleep(2000);
        app.makeMessage.makeMessage("natasha240586@i.ua","Subject","Test text");
        Thread.sleep(2000);
        Assert.assertEquals(app.dashBoard.getSubject(), "Subject");
    }
}