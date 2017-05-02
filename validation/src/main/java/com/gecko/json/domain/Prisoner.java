package com.gecko.json.domain;

import javax.validation.constraints.AssertFalse;

/**
 * Created by hlieu on 05/1/17.
 */
public class Prisoner {

   // this gets overridden by constraints.xml
   @AssertFalse
   private Boolean married;

   public Boolean getMarried () {
      return married;
   }

   public void setMarried (Boolean married) {
      this.married = married;
   }
}
