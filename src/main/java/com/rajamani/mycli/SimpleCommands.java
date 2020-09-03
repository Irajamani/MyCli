package com.rajamani.mycli;


import com.rajamani.mycli.Testing.test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.awt.*;
import java.awt.event.KeyEvent;

@ShellComponent
public class SimpleCommands {

    @Autowired
    private test t;

    @ShellMethod("Add two integers together.")
    public int add(int a, int b){
        return a+b;
    }

    @ShellMethod("Testing for opening ZoomLink.")
    public void zoom() throws InterruptedException, AWTException {
        t.Zoom();
    }
}
