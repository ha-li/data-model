package com.gecko.domain;

import java.util.List;

/**
 * Created by hlieu on 04/22/17.
 */
public class Contact {
   private String name;
   private int age;
   private String address;
   private List<Phone> phone_numbers;

   public Contact () {}

   public String getName () {
      return name;
   }

   public void setName (String name) {
      this.name = name;
   }

   public int getAge () {
      return age;
   }

   public void setAge (int age) {
      this.age = age;
   }

   public String getAddress () {
      return address;
   }

   public void setAddress (String address) {
      this.address = address;
   }

   public List<Phone> getPhone_numbers () {
      return phone_numbers;
   }

   public void setPhone_numbers (List<Phone> phone_numbers) {
      this.phone_numbers = phone_numbers;
   }
}
