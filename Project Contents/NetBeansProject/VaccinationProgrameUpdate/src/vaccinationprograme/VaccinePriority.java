/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccinationprograme;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author josh
 */
public class VaccinePriority implements VaccineInterface {
    
    private ArrayList<VaccineElement> vaccQueue;
    
    public VaccinePriority() {
        vaccQueue = new ArrayList<VaccineElement>();    
    } 
   
    
    public boolean isEmpty() { 
        return vaccQueue.isEmpty(); 
    }
  
    public int size(){
	  return vaccQueue.size();
    }

    private int findInsertPosition(int newkey)
      {
          boolean found;
          VaccineElement elem;
          int position;
          found = false;
          position =0;
          while (position<vaccQueue.size() && !found)
          {
            elem = vaccQueue.get(position);
            if(elem.getKey()>newkey)  
                position = position +1;
            else
            {
                found = true;
            }
          }
         return position;
        }
    
    // new element with a given key and element information will be added 
    public void enqueue(int priorkey, Object item)
    {
        int index;
        VaccineElement elem = new VaccineElement(priorkey,(Recipient)item);
        
        index = findInsertPosition(priorkey);

        if (index ==size())
            vaccQueue.add(elem);
        else
            vaccQueue.add(index, elem);
    }



    //the first element has the highest priority
    public Object dequeue()
    {
       return vaccQueue.remove(0);
    }
    
    
    public String printvaccueue()
    {
        String printStr = new String();
        VaccineElement elem;
        for (int i = 0; i<vaccQueue.size();i++)
        {
            elem = vaccQueue.get(i);
            printStr = printStr.concat (elem.printVaccineRecipient()+" "+"Priority ="+elem.getKey()+"\n");
        }
        return printStr;
    }
    
    @Override
    public Iterator<VaccineElement> iterator() {
        // Return an iterator for your vaccQueue collection
        return vaccQueue.iterator();
    }
}
