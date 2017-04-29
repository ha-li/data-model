package com.gecko.json.unmarshaller;

import com.gecko.json.domain.Employee;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by hlieu on 04/20/17.
 */
public class JsonUnMarshaller {

   private static com.fasterxml.jackson.databind.ObjectMapper JACKSON_OBJ_MAPPER;
   private static com.fasterxml.jackson.databind.type.CollectionType COLLECTION_TYPE;

   private static Employee mInstance = new Employee ();

   static {
      JACKSON_OBJ_MAPPER = new com.fasterxml.jackson.databind.ObjectMapper ();

      // need to fix this -- right now it assumes its an Employee...
      // COLLECTION_TYPE = JACKSON_OBJ_MAPPER.getTypeFactory ().constructCollectionType (List.class, mInstance.getClass());
   }

   public static <T> List<T> unmarshallAll (String fileName, Collection<T> collection, T t) throws IOException {
      // need to fix this -- right now it assumes its an Employee...
      COLLECTION_TYPE = JACKSON_OBJ_MAPPER.getTypeFactory ().constructCollectionType (List.class, t.getClass());

      return JACKSON_OBJ_MAPPER.readValue(new File(fileName), COLLECTION_TYPE);
   }

   public static <T> T unmarshall (String fileName, T t) throws IOException {
      T obj = (T) JACKSON_OBJ_MAPPER.readValue(new File (fileName), t.getClass());
      return obj;
   }


}
