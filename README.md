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

No Duplicate Key on HashMap
You cannot store duplicate keys in HashMap. However, if you try to store duplicate key with another value, it will replace the value.
====================================================================================================================================================================