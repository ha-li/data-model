package com.gecko.domain;

import java.util.List;

/**
 * Created by hlieu on 04/25/17.
 */
public class SystemParameter {

   private String parameter;
   private String category;
   private String defaultValue;
   private String cache;
   private List<EnvironmentValue> envs;

   public SystemParameter () {
   }

   public String getParameter () {
      return parameter;
   }

   public void setParameter (String parameter) {
      this.parameter = parameter;
   }

   public String getCategory () {
      return category;
   }

   public void setCategory (String category) {
      this.category = category;
   }

   public String getCache () {
      return cache;
   }

   public void setCache (String cache) {
      this.cache = cache;
   }

   public String getDefaultValue () {
      return defaultValue;
   }

   public void setDefaultValue (String defaultValue) {
      this.defaultValue = defaultValue;
   }

   public List<EnvironmentValue> getEnvs () {
      return envs;
   }

   public void setEnvs (List<EnvironmentValue> envs) {
      this.envs = envs;
   }
}
