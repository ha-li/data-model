package com.gecko.json.domain;

import javax.validation.constraints.NotNull;

/**
 * Created by hlieu on 05/1/17.
 */
public class PrisonCell {

   // the cell id
   @NotNull
   private String id;

   public String getId () {
      return id;
   }

   public void setId (String id) {
      this.id = id;
   }
}
