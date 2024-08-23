/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

/**
 *
 * @author ToanNM_PC09504
 */
public class Student {
    public String name;
    public double mark;
    public String course; //khoá học

    public Student() {
    }

    public Student(String name, double mark, String course) {
        this.name = name;
        this.mark = mark;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    
    public String getGrade(){
        if(mark<3){
            return "Kém";
        }
        if(mark<5){
            return "Yếu";
        }
        if(mark<6.5){
            return "Trung Bình";
        }
        if(mark<7.5){
            return "Khá";
        }
        if(mark<9){
            return "Giỏi";
        }
            return "Xuất Sắc";    
    }
    
    public boolean isBonus(){
        return mark >=7.5;
    }
    
    
}
