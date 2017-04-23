package com.gecko.yaml;

import com.esotericsoftware.yamlbeans.YamlConfig;
import com.esotericsoftware.yamlbeans.YamlReader;

import java.io.FileReader;
import java.net.URL;
import java.util.Map;

/**
 * Created by hlieu on 04/23/17.
 */
public class YamlConfigExample {
   public static void main (String[] args) throws Exception {
      YamlConfig yamlConfig = new YamlConfig ();

      URL url = ClassLoader.getSystemResource ("config.yaml");
      YamlReader reader = new YamlReader (new FileReader (url.getFile()));
      Object object = reader.read ();
      System.out.println (object);

      Map map = (Map) object;
      System.out.println (map.get("address"));
      Map addressMap = (Map) map.get("address");
      System.out.println (addressMap.get("line1"));
   }
}
