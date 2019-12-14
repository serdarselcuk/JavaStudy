package com.cbt.utilities;

public class BrowserUtils
{
        public static void wait(int seconds)  {
//    it will be pause our test for give us that the time we need
            try {
                Thread.sleep(seconds*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


