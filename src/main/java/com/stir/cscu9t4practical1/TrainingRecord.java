// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;

import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
   
   //TODO Task 2
   /**
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   */
   
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "";
       String suffix = "";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) {
             result += current.getName() + ", ";
          }
          suffix = "has participated in events on " + current.getDay()
          				+ "/" + current.getMonth() + "/" + current.getYear();
       }
       if (!result.isEmpty()) {
    	   result += suffix;
    	   System.out.println(suffix);
       }
       if (result.isEmpty()) {
    	   result = "No entries found";
       }
       return result;
   }
   
   //TODO Task 3
   public String FindAllByDate (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "";
       while (iter.hasNext()) {
           Entry current = iter.next();
           if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) {
              result += current.getEntry();
           }
       }
       if (result.isEmpty()) {
    	   result = "No entries found";
       }
       return result;
   }
   
   //TODO Task 11
   public void RemoveEntry(String n, int d, int m, int y) {
		ListIterator<Entry> iter = tr.listIterator();
		while (iter.hasNext()) {
			Entry current = iter.next();
			if (current.getName().equalsIgnoreCase(n) && current.getDay() == d && 
					current.getMonth() == m && current.getYear() == y) {
				tr.remove(current);
			}
		}
	}
   
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   
} // TrainingRecord