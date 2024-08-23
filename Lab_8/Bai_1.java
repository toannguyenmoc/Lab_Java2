/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_8;

import java.util.ArrayList;

/**
 *
 * @author ToanNM_PC09504
 */
public class Bai_1 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList();
        list.add(10);
        list.add(9.75);
        list.add(true);
        list.add("Nguyễn Mộc Toàn");
        
        for(Object mt : list){
            System.out.println(mt);
        }                
    }
}
