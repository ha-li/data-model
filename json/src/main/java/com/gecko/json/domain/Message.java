package com.gecko.json.domain;

import com.gecko.validation.constraint.MustBeFunny;

/**
 * Created by hlieu on 04/23/17.
 */
public class Message {

   @MustBeFunny
   private String str;

   public String getStr () {
      return str;
   }

   public void setStr (String str) {
      this.str = str;
   }
}
