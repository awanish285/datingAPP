# datingAPP


#Description

This is project is used to create the datingAPP like we can create user like,dislike, and find the matches.

#perform below operations

1) Saving userAccount data and Interst of the user
2) Find the data by id
3) Find the all the users details
4) Find the matches userAccount


#Tech Stack

Java

#Tools:

STS

#VC
GIt

=======================================================================================================================================================
#HashMap

1) Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique. 
2) If you try to insert the duplicate key, it will replace the element of the corresponding key. 
3) It is easy to perform operations using the key index like updation, deletion, etc. HashMap class is found in the java.util package.

4) HashMap in Java is like the legacy Hashtable class, but it is not synchronized. 
5) It allows us to store the null elements as well, but there should be only one null key. Since Java 5, it is denoted as HashMap<K,V>, where K stands for key and V for value. It inherits the AbstractMap class and implements the Map interface.


#Points to remember

1) Java HashMap contains values based on the key.
2) Java HashMap contains only unique keys.
3) Java HashMap may have one null key and multiple null values.
4) Java HashMap is non synchronized.
5) Java HashMap maintains no order.
6) The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

#Example


import java.util.*;  
public class HashMapExample1{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"Mango");  //Put elements in Map  
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(4,"Grapes");   
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  

#Note

1) No Duplicate Key on HashMap
2) You cannot store duplicate keys in HashMap. However, if you try to store duplicate key with another value, it will replace the value.


#Java HashMap example to add() elements

#Here, we see different ways to insert elements.


import java.util.*;  
class HashMap1{  
 public static void main(String args[]){  
   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
    System.out.println("Initial list of elements: "+hm);  
      hm.put(100,"Amit");    
      hm.put(101,"Vijay");    
      hm.put(102,"Rahul");   
       
      System.out.println("After invoking put() method ");  
      for(Map.Entry m:hm.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }  
        
      hm.putIfAbsent(103, "Gaurav");  
      System.out.println("After invoking putIfAbsent() method ");  
      for(Map.Entry m:hm.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }  
      HashMap<Integer,String> map=new HashMap<Integer,String>();  
      map.put(104,"Ravi");  
      map.putAll(hm);  
      System.out.println("After invoking putAll() method ");  
      for(Map.Entry m:map.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }  
 }  
}  

#output

Initial list of elements: {}
After invoking put() method 
100 Amit
101 Vijay
102 Rahul
After invoking putIfAbsent() method 
100 Amit
101 Vijay
102 Rahul
103 Gaurav
After invoking putAll() method 
100 Amit
101 Vijay
102 Rahul
103 Gaurav
====================================================================================================================================================================