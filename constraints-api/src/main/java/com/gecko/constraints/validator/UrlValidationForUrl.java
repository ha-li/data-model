package com.gecko.constraints.validator;

import com.gecko.constraints.URL;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by hlieu on 04/30/17.
 */
public class UrlValidationForUrl implements ConstraintValidator<URL, java.net.URL> {
   private String protocol;
   private String host;
   private int port;

   public void initialize (URL parameters) {
      if(parameters != null) {
         this.protocol = parameters.protocol ();
         this.host = parameters.host ();
         this.port = parameters.port ();
      }
   }

   public boolean isValid (java.net.URL url, ConstraintValidatorContext context) {
      if (url == null) return true;

      if (protocol != null && protocol.length () > 0) {
         if ( !url.getProtocol ().equals (protocol) ) {
            return false;
         }
      }

      if (host != null && host.length () > 0) {
         if ( !url.getHost ().equals (host)) {
            return false;
         }
      }

      if (port != -1) {
         if (url.getPort () != port) {
            return false;
         }
      }

      return true;
   }
}
