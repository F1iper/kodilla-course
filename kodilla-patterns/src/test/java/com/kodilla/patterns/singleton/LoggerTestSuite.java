package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void createLogs() {
        Logger.getInstance().log("log 1");
        Logger.getInstance().log("log 2");
    }

    @AfterClass
    public static void testSaveLogs() {
        Logger.getInstance().saveLogs();
    }

    @Test
    public void testCreateLog() {
        //Given

        //When
        String lastLog = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("log 2", lastLog);
    }
}