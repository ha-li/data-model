package com.gecko.json.domain;

import com.gecko.constraints.MustBeFunny;
import com.gecko.constraints.NonField;
import com.gecko.constraints.NonMethod;

/**
 * Created by hlieu on 04/23/17.
 */
public class Message {

   @NonMethod
   @MustBeFunny
   private String str;


   // even though this annotation does not give a compilier
   // error, constraints applied to static fields/methods
   // will not get enforced because they are validated
   // through an instance object
   @NonMethod
   private static String staticString;


   // I cannot apply this annotation to a field variable
   // since the @Target of NonField does NOT include FIELD
   // @NonField
   public Boolean field;

   // but I can apply it to a method since @Target includes METHOD
   // @NonField
   // @NonMethod <- is is not allowed
   public String getStr () {
      return str;
   }

   // there are 2 ways to annotate methods, before
   // and after the privacy accessor
   public /* @NonMethod */ void setStr (@NonMethod String str) {
      this.str = str;
   }
}
