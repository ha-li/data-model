package com.gecko.json.unmarshaller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gecko.json.domain.Employee;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by hlieu on 04/20/17.
 */
public class EmployeeUnMarshaller {
   public static void main (String[] args) throws IOException {
      URL url = ClassLoader.getSystemResource ("employee.json");
      System.out.println (url.toString ());
      ObjectMapper mapper = new ObjectMapper ();
      String fileName = url.getFile ();
      Employee employee = mapper.readValue(new File (fileName), Employee.class);
      System.out.println (employee.getFirstName ());
   }
}
