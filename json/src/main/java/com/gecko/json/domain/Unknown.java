package com.gecko.json.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Created by hlieu on 04/22/17.
 */

/**
 * Ignore properties, done without an import, cause why not.
 */
@com.fasterxml.jackson.annotation.JsonIgnoreProperties (
   // these two ensure your text streams and pojos are backwards compatible:
     // ignore these values during the marshalling
   value = {"ignoreable", "ignoreable2"},
     // when unmarshalling, ignore any properties not defined in the pojo
   ignoreUnknown = true )
public class Unknown {
   @JsonProperty ("random-strings")
   private String field1;

   // if you remove this annotation, then the marshaller
   // will not see this field and it will not get
   // included in the json text. By adding this annotation
   // you effectively change the serializer from getter/setter based
   // to field based serialization
   @JsonProperty ("number")
   private int field2;

   // this annotation causes the field to be ignored
   @JsonIgnore
   private String field3;

   private String ignoreable;

   private String ignoreable2;

   // you can add other objects and it will get serialized also
   private Employee employee;

   public Unknown () {
      field2 = 183;
   }

   public String getField1 () {
      return field1;
   }

   public void setField1 (String field1) {
      this.field1 = field1;
   }

   public String getField3 () {
      return field3;
   }

   public void setField3 (String field3) {
      this.field3 = field3;
   }

   public Employee getEmployee () {
      return employee;
   }

   public void setEmployee (Employee employee) {
      this.employee = employee;
   }

   public String getIgnoreable () {
      return ignoreable;
   }

   public void setIgnoreable (String ignoreable) {
      this.ignoreable = ignoreable;
   }

   public String getIgnoreable2 () {
      return ignoreable2;
   }

   public void setIgnoreable2 (String ignoreable2) {
      this.ignoreable2 = ignoreable2;
   }
}
