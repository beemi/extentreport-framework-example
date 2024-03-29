package com.agikya.digital;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ExtentITestListenerClassAdapter.class})
public class SimpleTest {

    @Test(groups = {"tag:DOVE-502", "author:Raja Beemi", "device:Android"})
    public void passTest() {

        Assert.assertEquals(5, 3 + 2);
    }

    @Test(groups = {"SimpleTest002Tag", "t:DOVE-503", "a:Raja Beemi", "d:Iphone"})
    public void failTest() {

        Assert.assertEquals(2, 3 + 2);
    }

    @Test
    @Ignore
    public void skipTest() {

        Assert.assertEquals(2, 3 + 2);
    }
}
