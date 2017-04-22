package com.gecko.json;

import com.gecko.json.domain.Employee;
import com.gecko.json.domain.Unknown;
import com.gecko.json.marshaller.JsonMarshaller;
import com.gecko.json.unmarshaller.EmployeeUnMarshaller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hlieu on 04/22/17.
 */
public class MarshallExample {

   public static void main (String[] args) throws Exception {
      URL url = ClassLoader.getSystemResource ("employee.json");
      Employee employee = EmployeeUnMarshaller.unmarshall (url.getFile());
      String json = JsonMarshaller.marshal(employee);
      System.out.println (json);

      List<Employee> employees = new ArrayList<> ();
      employees.add(employee);

      Employee paul = new Employee ();
      paul.setFirstName ("Paul");
      paul.setLastName("Michelson");
      paul.setAge (51);

      employees.add(paul);

      String employeesStr = JsonMarshaller.marshal(employees);
      System.out.println (employeesStr);

      // works for any objects
      Unknown u = new Unknown();
      u.setField1 ("funny things");
      String u_marshalled = JsonMarshaller.marshal(u);
      System.out.println (u_marshalled);
   }
}
