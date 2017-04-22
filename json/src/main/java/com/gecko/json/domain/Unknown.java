package com.gecko.json.domain;

/**
 * Created by hlieu on 04/22/17.
 */
public class Unknown {
   private String field1;

   // this proves that json marshalling is done by getters
   // because this should be generated in the outputted json also,
   // if it was by field
   private int field2;

   public Unknown () {
      field2 = 183;
   }

   public String getField1 () {
      return field1;
   }

   public void setField1 (String field1) {
      this.field1 = field1;
   }
}
