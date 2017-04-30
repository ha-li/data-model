package com.gecko.constraints.validator;

import com.gecko.constraints.ChronologicalOrder;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by hlieu on 04/29/17.
 */
public class ChronologicalOrderValidator implements ConstraintValidator <ChronologicalOrder, Object> {
   public void initialize (ChronologicalOrder parameters) {}

   public boolean isValid (Object obj, ConstraintValidatorContext context) {
      return true;
   }
}
