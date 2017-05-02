package com.gecko.json.domain;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotNull;

/**
 * Created by hlieu on 05/1/17.
 */
public class Prisoner {

   // this gets overridden by prison-constraints.xml
   @AssertFalse
   private Boolean married;

   @NotNull
   private String number;

   public String getNumber () {
      return number;
   }

   public void setNumber (String number) {
      this.number = number;
   }

   public Boolean getMarried () {
      return married;
   }

   public void setMarried (Boolean married) {
      this.married = married;
   }
}
