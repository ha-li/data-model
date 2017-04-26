package com.gecko.domain;

/**
 * Created by hlieu on 04/25/17.
 */
public class EnvironmentValue {
   private String env;
   private String value;

   public EnvironmentValue() {
   }

   public String getEnv () {
      return env;
   }

   public void setEnv (String env) {
      this.env = env;
   }

   public String getValue () {
      return value;
   }

   public void setValue (String value) {
      this.value = value;
   }
}
