package com.gecko.test.beans;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;

/**
 * Created by hlieu on 04/28/17.
 */
public class TestBean {
   @AssertFalse
   private Boolean mustBeFalse;

   @AssertTrue
   private Boolean mustBeTrue;

   public Boolean getMustBeTrue () {
      return mustBeTrue;
   }

   public void setMustBeTrue (Boolean mustBeTrue) {
      this.mustBeTrue = mustBeTrue;
   }

   public Boolean getMustBeFalse () {
      return mustBeFalse;
   }

   public void setMustBeFalse (Boolean mustBeFalse) {
      this.mustBeFalse = mustBeFalse;
   }
}
