/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week02;
//view class
public class StudentTester {
    public static void main(String[] args){
        Student s1 = new Student("yoo",215);
        Student s2 = new Student("loo", 541);
        Student s3 = new Student();
        s3.setName("gaa");
        s3.setId(842);
        
        Student[] list = new Student[3];
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        for(int dex=0; dex<list.length; dex++){
            System.out.println(" " + list[dex].getName() + " " + list[dex].getId());
            System.out.println("Test it");
             System.out.println("Test it");
             System.out.println("Test it");
        }
                }
}
