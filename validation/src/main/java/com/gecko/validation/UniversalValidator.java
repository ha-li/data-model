package com.gecko.validation;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.PrintStream;
import java.util.Set;

/**
 * Created by hlieu on 04/28/17.
 */
public class UniversalValidator {

   private static ValidatorFactory validatorFactory;
   private static Validator validator;

   static {
      validatorFactory = Validation.buildDefaultValidatorFactory ();
      validator = validatorFactory.getValidator ();
   }

   // do some validation 101
   public static <T> void validate (T t) {
      Set<ConstraintViolation<T>> violations = validator.validate(t);
      if(!violations.isEmpty ()) {
         throw new ConstraintViolationException ("Invalid object based on constraints violation.", violations);
      }
   }

   public static void violation (ConstraintViolationException exception, PrintStream out) {
      for (ConstraintViolation violation : exception.getConstraintViolations ()) {
         out.println (violation.getRootBeanClass () + ": " + violation.getPropertyPath () + " " + violation.getMessage ());
      }
   }

}
