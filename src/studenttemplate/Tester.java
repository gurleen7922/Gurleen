/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenttemplate;

/**
 *
 * @author 14372
 */
public class Tester {
    public static void main(String[] args){
        StudentTemplate s1= new StudentTemplate();//object created
        s1.setName("sheridan");
        System.out.println(s1.getName());
        StudentTemplate s2= new StudentTemplate();
        s2.setName("hadd ae");
        System.out.println(s2.getName());
        StudentTemplate[] list = new StudentTemplate[2];
        list[0] = s1;
        list[1] = s2;
        for(int i = 0; i<list.length; i++){
            System.out.println(list[i].getName());
        }
        }
        
    }

