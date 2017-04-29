package com.gecko.test.beans;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;

/**
 * Created by hlieu on 04/28/17.
 */
public class TestBean {
   @AssertFalse
   private Boolean mustBeFalse;

   @AssertTrue
   private Boolean mustBeTrue;

   @DecimalMax (value="1.0")
   @DecimalMin (value="-1.0")
   private BigDecimal correlation;

   @Digits (integer=2, fraction=3)
   private BigDecimal pValue;

   public BigDecimal getpValue () {
      return pValue;
   }

   public void setpValue (BigDecimal pValue) {
      this.pValue = pValue;
   }

   public BigDecimal getCorrelation () {
      return correlation;
   }

   public void setCorrelation (BigDecimal correlation) {
      this.correlation = correlation;
   }

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
