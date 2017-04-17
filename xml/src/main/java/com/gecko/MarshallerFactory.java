package com.gecko;

import com.gecko.domain.internal.Animal;
import com.gecko.domain.internal.CreditCard;
import com.gecko.domain.internal.Inventory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
 * Created by hlieu on 04/16/17.
 */
public class MarshallerFactory {

   public static String marshal (Object object) throws Exception {
      JAXBContext context = JAXBContext.newInstance (object.getClass());
      Marshaller marshaller = context.createMarshaller ();
      marshaller.setProperty (Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

      StringWriter sw = new StringWriter ();
      marshaller.marshal (object, sw);
      return sw.toString ();
   }

   public static Inventory getInventory () {
      Inventory inventory = new Inventory ();
      Animal animal = new Animal ();
      animal.setAnimalClass ("mammal");
      animal.setName("Song Fang");
      animal.setSpecied ("Giant Panda");
      animal.setFood("Bambo");
      animal.setTemperament ("Friendly");
      animal.setWeight (45.0);
      animal.setFoodRecipe (null);
      inventory.getAnimal().add(animal);
      return inventory;
   }

   public static CreditCard getCreditCard () {
      CreditCard cc = new CreditCard ();
      cc.setType ("mastercard");
      cc.setControlNumber (342);
      cc.setExpiryDate ("3/20");
      cc.setNumber ("234234234234");
      return cc;
   }

   public static void main (String[] args) throws Exception {

      Inventory inventory = getInventory ();
      System.out.println (MarshallerFactory.marshal (inventory.getAnimal ().get(0)));
      //MarshallerFactory.marshal (getCreditCard ());
   }
}

