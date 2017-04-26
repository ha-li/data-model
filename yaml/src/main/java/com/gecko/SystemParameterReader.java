package com.gecko;

import com.esotericsoftware.yamlbeans.YamlReader;
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
      SystemParameters all = yamlReader.read(SystemParameters.class, List.class);
      System.out.println (all);
   }
}
