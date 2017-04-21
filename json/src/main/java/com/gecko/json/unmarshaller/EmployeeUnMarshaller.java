package com.gecko.json.unmarshaller;

import com.gecko.json.domain.Employee;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by hlieu on 04/20/17.
 */
public class EmployeeUnMarshaller {

   private static com.fasterxml.jackson.databind.ObjectMapper JACKSON_OBJ_MAPPER;
   private static com.fasterxml.jackson.databind.type.CollectionType COLLECTION_TYPE;

   private static Employee mInstance = new Employee ();

   static {
      JACKSON_OBJ_MAPPER = new com.fasterxml.jackson.databind.ObjectMapper ();
      COLLECTION_TYPE = JACKSON_OBJ_MAPPER.getTypeFactory ().constructCollectionType (List.class, mInstance.getClass());
   }

   public static Employee unmarshall (String fileName) throws IOException {
      return JACKSON_OBJ_MAPPER.readValue(new File (fileName), mInstance.getClass ());
   }

   public static List<Employee> unmarshallAll (String fileName) throws IOException {
      return JACKSON_OBJ_MAPPER.readValue(new File(fileName), COLLECTION_TYPE);
   }
}
