/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko5tuntitehtavat;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteUserText extends Thread {

    private String file;
    private int interval;
    int id = 0;
    Tekstit ts;

    public WriteUserText(String file, int interval, Tekstit ts) {
        this.file = file;
        this.interval = interval;
        this.ts = ts;
    }

    @Override
    public void run() {
        while (true) {
            if (ts.lueViimeinen() != null && ts.lueViimeinen().equals("LOPPU"))
                break;
            try {
                File f = new File(file);
                if (!f.exists()) {
                    String t = ts.lueTeksti();
                    try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(t);
			fileWriter.flush();
			fileWriter.close();
                    } catch (IOException e) {
			e.printStackTrace();
                    }
                    
                }
                Thread.sleep(interval);

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
        System.out.println("Kirjoitussäie päättyy");
    }
}

