package com.gecko.json.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by hlieu on 04/20/17.
 */
public class Employee {
   @NotNull @Size (max=250)
   private String firstName;

   @NotNull
   private String lastName;

   @NotNull @Min (0)
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
