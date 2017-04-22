package com.gecko.json;

import com.gecko.json.domain.Employee;
import com.gecko.json.marshaller.JsonMarshaller;
import com.gecko.json.unmarshaller.JsonUnMarshaller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hlieu on 04/20/17.
 */
public class UnMarshallMain {
   
   public static void main (String[] args) throws Exception {

      URL url = ClassLoader.getSystemResource ("employee.json");
      Employee employee = JsonUnMarshaller.unmarshall (url.getFile(), new Employee());
      System.out.println (employee.getAge ());

      url = ClassLoader.getSystemResource ("employees-array.json");
      List<Employee> listEmployees = JsonUnMarshaller.unmarshallAll (url.getFile(), new ArrayList<Employee> ());
      for (Employee e : listEmployees) {
         System.out.println (e.getFirstName ());
      }

      String json = JsonMarshaller.marshal(employee);
      System.out.println (json);
   }
}
