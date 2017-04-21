package com.gecko.json.domain;

/**
 * Created by hlieu on 04/20/17.
 */
public class Employee {
   private String firstName;
   private String lastName;
   private int age;
   private Boolean married;

   public String getFirstName () {
      return firstName;
   }

   public void setFirstName (String firstName) {
      this.firstName = firstName;
   }

   public String getLastName () {
      return lastName;
   }

   public void setLastName (String lastName) {
      this.lastName = lastName;
   }

   public int getAge () {
      return age;
   }

   public void setAge (int age) {
      this.age = age;
   }

   public Boolean getMarried () {
      return married;
   }

   public void setMarried (Boolean married) {
      this.married = married;
   }
}
