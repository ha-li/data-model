package com.gecko.validation;

import com.gecko.test.beans.TestBean;
import org.junit.Test;

import javax.validation.ConstraintViolationException;
import java.math.BigDecimal;

/**
 * Created by hlieu on 04/28/17.
 */
public class DecimalMaxMinTest {

   @Test(expected = ConstraintViolationException.class)
   public void test_value_above_constraint () {
      TestBean test = new TestBean () ;
      test.setCorrelation (new BigDecimal (1.3));

      UniversalValidator.validate(test);
   }

   @Test
   public void test_fair_value () {
      TestBean test = new TestBean () ;
      test.setCorrelation (new BigDecimal (0.3));

      UniversalValidator.validate(test);
   }

   @Test(expected = ConstraintViolationException.class)
   public void test_below_negative_value () {
      TestBean test = new TestBean () ;
      test.setCorrelation (new BigDecimal (-2.3));

      UniversalValidator.validate(test);
   }


   @Test
   public void test_fair_negative_value () {
      TestBean test = new TestBean () ;
      test.setCorrelation (new BigDecimal (-1.0));

      UniversalValidator.validate(test);
   }

   @Test
   public void test_fair_null () {
      TestBean test = new TestBean () ;

      UniversalValidator.validate(test);
   }

}
