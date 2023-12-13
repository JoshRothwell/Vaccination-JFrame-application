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
public class VaccineElement {
    private int key;
      private Recipient element;
     
      public VaccineElement(int priority, Recipient e){
		key = priority;
                element = e;
	}

      public int getKey() {
		return key;
	}

      public void setKey(int val) {
		key = val;
	}
	
	public Recipient getElement() {
            return element;
      }

	public void setElement(Recipient e) {
		element = e;
      }

      public String printVaccineRecipient() {
          String msg ; 
          msg = " name = "+element.getName()+ " age = "+element.getAge()+ " "+ "condition ="+element.getCondition();
          return msg;
      }
}

