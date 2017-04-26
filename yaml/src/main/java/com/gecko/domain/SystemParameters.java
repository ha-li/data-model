package com.gecko.domain;

import java.util.List;

/**
 * Created by hlieu on 04/25/17.
 */
public class SystemParameters {
   private List<SystemParameter> parameters;

   public SystemParameters () {}

   public List<SystemParameter> getParameters () {
      return parameters;
   }

   public void setParameters (List<SystemParameter> parameters) {
      this.parameters = parameters;
   }
}
