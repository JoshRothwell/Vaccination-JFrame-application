/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccinationprograme;

import java.util.*;

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
    
    //NOTE: This route didn't work, it was a failed attempt at the age priority.
    
    //public int comparePriority(Recipient r) {
        //if(age < r.age)
            //return priority -1;
        //else if (age > r.age)
            //return priority 1;
        //return 0;
    //}
    
    
    //NOTE: This was my second attempt at sorting the priority based off age, i'm unsure if it's because of how I tried to
    // sort the priority, but no matter what age I input for a recipient, the priority is always zero i.e not actually sorting.
    // For next attempt I should try creating a secondary element based off online examples, the first set of elements used to
    //represenet the newly added input, and the second comparing it to any Recipients that fit the criteria.
    
    
    //public int comparePriority(Recipient r) {
      //  if(r.getAge() <= 100 && r.getAge() <= 100)
        //    return Integer.compare(r.getPriority(),r.getPriority());
        //if(r.getAge() > 100 && r.getAge() > 100)
          //  return Integer.compare(r.getPriority(),r.getPriority());
        //if(r.getAge() <= 100 && r.getAge() > 100)
          //  return -1;
        //return 1;
    //}
}
