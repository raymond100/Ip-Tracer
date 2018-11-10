/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ray100.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Ray100
 */
public final class Logger {

    public Logger() {
        myLog();
    }

    public void myLog() {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger("MyLog");
        FileHandler fh;

        try {

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("IP_Tracer.log");

            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // the following statement is used to log any messages  
            logger.info("The Log");

        } catch (SecurityException | IOException e) {
        }

        logger.info("IP Tracer Log?");
    }

}
