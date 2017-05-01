package com.gecko.constraints.validator;

import com.gecko.constraints.ChronologicalOrder;
import com.gecko.json.domain.Employee;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Date;

/**
 * Created by hlieu on 04/29/17.
 */
public class ChronologicalOrderValidator implements ConstraintValidator <ChronologicalOrder, Employee> {
   public void initialize (ChronologicalOrder parameters) {}

   public boolean isValid (Employee employee, ConstraintValidatorContext context) {
      Date interview = employee.getInterviewDate ();
      Date hireDate = employee.getHireDate ();
      Date exit = employee.getExitDate ();

      if (interview == null) {
         return true;
      }

      if (hireDate != null && exit != null) {
         return interview.before(hireDate) && hireDate.before (exit);
      } else if (exit != null) {
         return interview.before (hireDate);
      }
      return true;
   }
}
