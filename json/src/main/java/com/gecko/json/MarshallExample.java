package com.gecko.json;

import com.gecko.json.domain.Employee;
import com.gecko.json.domain.Unknown;
import com.gecko.json.marshaller.JsonMarshaller;
import com.gecko.json.unmarshaller.JsonUnMarshaller;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by hlieu on 04/22/17.
 */
public class MarshallExample {

   public static Employee employee () throws Exception {
      URL url = ClassLoader.getSystemResource ("employee.json");

      Employee employee = null;
      try {
         employee = JsonUnMarshaller.unmarshall (url.getFile (), new Employee ());
      } catch (ConstraintViolationException e) {
         Set<ConstraintViolation<?>> violations = e.getConstraintViolations ();
         for (ConstraintViolation<?> infraction: violations) {
            System.out.println ("Violation: " + infraction.getPropertyPath () + " " + infraction.getMessage () + " in object " + infraction.getRootBeanClass ());
         }
      }

      String json = JsonMarshaller.marshal (employee);
      System.out.println (json);
      return employee;
   }

   public static Employee employees (Employee employee) {

      List<Employee> employees = new ArrayList<> ();
      employees.add (employee);

      Employee paul = new Employee ();
      paul.setFirstName ("Paul");
      paul.setLastName ("Michelson");
      paul.setAge (51);

      employees.add (paul);

      String employeesStr = JsonMarshaller.marshal (employees);
      System.out.println (employeesStr);
      return paul;
   }

   public static void unknown (Employee paul) {

      // works for any objects
      Unknown u = new Unknown();
      u.setField1 ("funny things");
      u.setField3 ("not marshalled");
      u.setEmployee (paul);
      String u_marshalled = JsonMarshaller.marshal(u);
      System.out.println (u_marshalled);
   }



   public static void main (String[] args) throws Exception {
      Employee e = employee ();
      Employee paul = employees (e);
      unknown (paul);
   }
}
