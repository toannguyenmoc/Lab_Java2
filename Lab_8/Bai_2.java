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
public class Bai_2<T>  {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
     public void add(T t){
        this.t = t;
    }
    public static void main(String[] args) {
        ArrayList<Integer> myarrr = new ArrayList<>();
        for (int i=1;i<=10;i++){
            myarrr.add(i);
        }
        for(Integer mt : myarrr){
            System.out.println(mt);
        }
    }
}
