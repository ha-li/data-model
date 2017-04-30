package com.gecko.validation;

import com.gecko.test.beans.TestBean;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

/**
 * Created by hlieu on 04/30/17.
 */
public class UrlTest {
   @Test
   public void test_url () {
      TestBean test = new TestBean () ;

      test.setPersonalFtp ("ftp://scm.ie.nexus.com:21/home/jdax/personal/mp3s");

      try {
         UniversalValidator.validate (test);
      } catch (ConstraintViolationException e) {
         for (ConstraintViolation violation : e.getConstraintViolations ()) {
            System.out.println (violation.getRootBean () + " " + violation.getMessage ());
         }
         throw e;
      }
   }

   @Test (expected = ConstraintViolationException.class)
   public void test_url_invalid_ftp () {
      TestBean test = new TestBean () ;

      test.setPersonalFtp ("http://scm.ie.nexus.com:21/home/jdax/personal/mp3s");

      try {
         UniversalValidator.validate (test);
      } catch (ConstraintViolationException e) {
         for (ConstraintViolation violation : e.getConstraintViolations ()) {
            System.out.println (violation.getRootBean () + " " + violation.getMessage ());
         }
         throw e;
      }
   }

   @Test
   public void test_url_valid_http () {
      TestBean test = new TestBean () ;

      test.setPersonalWeb ("http://www.home.com:80/home/jdax/personal/mp3s");

      try {
         UniversalValidator.validate (test);
      } catch (ConstraintViolationException e) {
         for (ConstraintViolation violation : e.getConstraintViolations ()) {
            System.out.println (violation.getRootBean () + " " + violation.getMessage ());
         }
         throw e;
      }
   }

   @Test(expected = ConstraintViolationException.class)
   public void test_url_invalid_http () {
      TestBean test = new TestBean () ;

      // this host is incorrect
      test.setPersonalWeb ("http://scm.nexus.net:80/home/jdax/personal/mp3s");

      try {
         UniversalValidator.validate (test);
      } catch (ConstraintViolationException e) {
         for (ConstraintViolation violation : e.getConstraintViolations ()) {
            System.out.println (violation.getRootBean () + " " + violation.getMessage ());
         }
         throw e;
      }
   }
}
