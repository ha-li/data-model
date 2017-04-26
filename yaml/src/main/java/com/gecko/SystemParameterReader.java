package com.gecko;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.gecko.domain.EnvironmentValue;
import com.gecko.domain.SystemParameter;
import com.gecko.domain.SystemParameters;

import java.io.FileReader;
import java.net.URL;
import java.util.List;

/**
 * Created by hlieu on 04/25/17.
 */
public class SystemParameterReader {
   public static void main (String[] args) throws Exception  {
      String systemParameterFile = "systemParameter.yaml";
      URL configUrl = ClassLoader.getSystemResource (systemParameterFile);
      String fileName = configUrl.getFile();
      YamlReader yamlReader = new YamlReader (new FileReader (fileName));
      yamlReader.getConfig().setClassTag("SystemParameters", SystemParameters.class);
      yamlReader.getConfig().setClassTag("SystemParameter", SystemParameter.class);
      //yamlReader.getConfig().setClassTag("EnvironmentValue", EnvironmentValue.class);
      //yamlReader.getConfig ().setPropertyElementType(SystemParameter.class, "envs", EnvironmentValue.class);
      SystemParameters all = yamlReader.read(SystemParameters.class, List.class);
      // List all = yamlReader.read(List.class, SystemParameter.class);

      //for(Object sys : all) {
         //SystemParameter s = (SystemParameter) sys;
         System.out.println (all);
      //}
   }
}
