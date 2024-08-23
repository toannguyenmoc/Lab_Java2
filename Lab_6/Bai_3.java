/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ToanNM_PC09504
 */
public class Bai_3 {

    public void CongViec_1() throws InterruptedException {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    if (i % 2 != 0) {
                        try {
                            Thread.sleep(10);
                            System.out.println("luong t1: " + i);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Bai_3.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        };
        //t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t1.join();
    }

    public void CongViec_2() throws InterruptedException {
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    if (i % 2 == 0) {
                        try {
                            Thread.sleep(15);
                            System.out.println("\t\tluong t2: " + i);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Bai_3.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        };
        //t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
    }

    public static void main(String[] args) throws InterruptedException {
        Bai_3 b3 = new Bai_3();
        b3.CongViec_1();
        b3.CongViec_2();
    }
}
