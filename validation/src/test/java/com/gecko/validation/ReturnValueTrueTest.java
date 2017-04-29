package com.gecko.validation;

import org.junit.Test;

/**
 * Created by hlieu on 04/29/17.
 */
public class ReturnValueTrueTest {

   @Test
   public void testReturnAssertTrue () {
      MockClass ex = new MockClass ();
      Boolean retBoolean = ex.getTrue (false);

      UniversalValidator.validate (retBoolean);
   }
}
