package com.it.project.tests;

import com.it.project.users.UserFactory;
import com.it.project.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest extends BaseTest {
    @Test
    public void test() {
    /*    System.out.println(Utils.getRandomString(256));
        System.out.println(UserFactory.getRandomUsers(10));*/

        Assert.assertTrue(app.login(validUser));
    }
}
