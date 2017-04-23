package com.gecko.yaml;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.gecko.domain.Contact;
import com.gecko.domain.Phone;

import java.io.FileReader;
import java.net.URL;

/**
 * Created by hlieu on 04/22/17.
 */
public class ConfigReader {

   public static Contact read (String fileName) throws Exception {
      YamlReader yReader = new YamlReader(new FileReader (fileName));
      Contact object = yReader.read (Contact.class);
      return object;
   }
}
