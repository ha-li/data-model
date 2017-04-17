package com.gecko;

import com.gecko.schema.anything.v1.Animal;
import com.gecko.schema.anything.v1.CreditCard;
import com.gecko.schema.anything.v1.Inventory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
 * Created by hlieu on 04/16/17.
 */
public class MarshallerFactory {

   public static String marshal (Object object) throws Exception {
      JAXBContext context = JAXBContext.newInstance ("com.gecko.schema.anything.v1");
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

   public static void inventory () throws Exception {
      Inventory inventory = getInventory ();
      System.out.println (MarshallerFactory.marshal (inventory.getAnimal ().get(0)));
   }

   public static void creditCard () throws Exception {
      CreditCard cc = getCreditCard ();
      System.out.println (MarshallerFactory.marshal(cc));
   }

   public static void main (String[] args) throws Exception {
      creditCard ();
      inventory ();
   }
}

