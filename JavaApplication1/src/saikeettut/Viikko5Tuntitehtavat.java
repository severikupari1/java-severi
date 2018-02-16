/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saikeettut;

/**
 *
 * @author vtkinju
 */
public class Viikko5Tuntitehtavat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
        MyFirstThread mft1 = new MyFirstThread('#', 5000);
        Thread t1 = new Thread(mft1);
        t1.start();
        MyFirstThread mft2 = new MyFirstThread('*', 3000);
        Thread t2 = new Thread(mft2);
        t2.start();

        MySecondThread mst1 = new MySecondThread("c:\\temp\\huuhaa.txt",
            1000);
        mst1.start();

        Messages ms = new Messages();
        SendingMessageThread sms1 = new SendingMessageThread("C:\\temp\\heippa.txt", 5000, ms);
        sms1.start();
        SendingMessageThread sms2 = new SendingMessageThread("C:\\temp\\huuhaa.txt", 5000, ms);
        sms2.start();
        ReadingMessageThread rms = new ReadingMessageThread(5000, ms);
        rms.start();
        */
        Tekstit ts = new Tekstit();
        ReadUserText rt = new ReadUserText(1000, ts);
        rt.start();
        WriteUserText wt = new WriteUserText("c:\\temp\\tekstit.txt",5000, ts);
        wt.start();
    }
    
}
