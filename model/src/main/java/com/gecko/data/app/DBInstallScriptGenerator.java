package com.gecko.data.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;

/**
 * Created by hlieu on 04/8/17.
 */
public class DBInstallScriptGenerator {
   public static void main (String[] args) throws Exception {
      Properties modelProperties = new Properties ();
      URL url = ClassLoader.getSystemResource ("model.properties");
      String fileName = url.getFile ();
      modelProperties.load(new FileReader (fileName));
      String toadExe = modelProperties.getProperty("toad.app");
      System.out.println ("Toad is " + toadExe);

      String macroFile = modelProperties.getProperty("toad.diff.ini");
      String[] cmd = {toadExe, "-a", "ACH_SchemaCompare->CompareSchemas | " + macroFile};
      Process toad = Runtime.getRuntime().exec(cmd);
      BufferedReader inputStream = new BufferedReader (new InputStreamReader (toad.getInputStream ()));
      String line = null;
      while ( (line = inputStream.readLine()) != null ) {
         System.out.println (line);
      }
      toad.waitFor ();
      toad.exitValue ();
   }
}
