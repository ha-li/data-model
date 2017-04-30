package com.gecko.json.domain;

import com.gecko.constraints.ChronologicalOrder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by hlieu on 04/20/17.
 */
@ChronologicalOrder
public class Employee {
   private Date interviewDate;
   private Date hireDate;
   private Date exitDate;

   @NotNull @Size (max=250)
   private String firstName;

   @NotNull
   private String lastName;

   @NotNull @Min (0)
   private int age;

   private Boolean married;

   public Employee () {
   }

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
