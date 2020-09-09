package com.rajamani.mycli.Testing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.event.KeyEvent;

@Service
public class test {

    public  void Zoom(String url) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        System.out.println("Going to sleep for 2 secs");
        Thread.sleep(2000);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_LEFT);
            robot.keyRelease(KeyEvent.VK_LEFT);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            Thread.sleep(4000);
            driver.quit();
        }
    }

}
