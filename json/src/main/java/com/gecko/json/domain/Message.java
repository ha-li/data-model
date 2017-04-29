package com.gecko.json.domain;

import com.gecko.constraints.MustBeFunny;
import com.gecko.constraints.NonField;

/**
 * Created by hlieu on 04/23/17.
 */
public class Message {

   @MustBeFunny
   private String str;

   // I cannot apply this annotation to a field variable
   // since the @Target of NonField does NOT include FIELD
   // @NonField
   public Boolean field;

   // but I can apply it to a method since @Target includes METHOD
   @NonField
   public String getStr () {
      return str;
   }

   public void setStr (String str) {
      this.str = str;
   }
}
