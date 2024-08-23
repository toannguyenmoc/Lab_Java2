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
public class Bai_1 implements Runnable {

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(500);
                System.out.println(i);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Bai_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CongViec_1() throws InterruptedException {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    System.out.println("luong t1: " + i);
                }
            }
        };
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
    }

    public void CongViec_2() throws InterruptedException{
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    System.out.println("\t\tluong t2: " + i);
                }
            }
        };
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread b1 = new Thread(new Bai_1());
        Bai_1 b2 = new Bai_1();
        b1.start();
        b2.CongViec_1();
        b2.CongViec_2();
    }

}
