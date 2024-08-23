/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3;

import java.io.Serializable;

/**
 *
 * @author ToanNM_PC09504
 */
public class NhanVien implements Serializable{
    public String hoTen;
    public double luong;

    public NhanVien() {
    }

    public NhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
}
