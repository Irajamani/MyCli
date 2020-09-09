package com.rajamani.mycli;


import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventDateTime;
import com.rajamani.mycli.GoogleCal.CalendarQuickstart;
import com.rajamani.mycli.Testing.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.awt.*;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Date;
import java.util.List;

@ShellComponent
public class SimpleCommands {

    @Autowired
    private test t;

    @Autowired
    private CalendarQuickstart calendarQuickstart;

    @ShellMethod("Add two integers together.")
    public int add(int a, int b){
        return a+b;
    }

    @ShellMethod("Open nearest class zoom link")
    public void zoom() throws IOException, GeneralSecurityException, AWTException, InterruptedException {
        List<Event> items = calendarQuickstart.getTodayEvents();
        if(items.isEmpty()) {
            System.out.println("No events till end of day. Enjoy and have a break.");
        } else {
            for(Event e : items) {
                EventDateTime d = e.getStart();
                DateTime now = new DateTime(System.currentTimeMillis());
                if(Math.abs(d.getDateTime().getValue() - now.getValue()) <= 600000) {
                    t.Zoom(e.getDescription());
                    return;
                }
            }
            System.out.println("No events near now.");
        }
    }
}
