/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccinationprograme;

/**
 *
 * @author josh
 */
public class Recipient {
    private String name;
    private int age;
    private String condition;
    private int priority;
    public Recipient(){
        name = new String();
        condition = new String();
    }

    public void setName(String n){
        name = n;
    }
    
    public void setAge(int a){
        age = a;
    }

    public void setCondition(String c){
        condition = c;
    }
    
    public void setPriority(int p){
        priority = p;
    }

    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }

    public String getCondition(){
        return condition;
    }
    
    public int getPriority(){
        return priority;
    }
}
