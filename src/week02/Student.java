/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week02;

public class Student {
    private String name;
    private int id;
    
    public Student(){
    }
    public Student(String n, int std){
        this.name = n;        
        this.id = std;
    }
    
    public void setName(String na){
        this.name = na;
    }
    
    public String getName(){
        return this.name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
