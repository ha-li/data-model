package com.gecko.validation;

import com.gecko.json.domain.Message;
import org.junit.Test;

import javax.validation.ConstraintViolationException;

/**
 * Created by hlieu on 04/28/17.
 */
public class FunnyValidatorTest {

   @Test(expected= ConstraintViolationException.class)
   public void test_validation_exception () {
      Message notFunny = new Message ();
      notFunny.setStr ("some random thoughts");
      FunnyValidator.validate (notFunny);
   }

   @Test
   public void test_not_exception () {
      Message funny = new Message ();
      funny.setStr ("funny");
      FunnyValidator.validate (funny);
   }

   @Test
   public void test_null_string () {
      // null is considered funny also

      Message funny = new Message ();
      funny.setStr (null);
      FunnyValidator.validate (funny);
   }
}