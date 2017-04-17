package com.gecko;

import com.gecko.marshaller.FinanicalMarshaller;
import com.gecko.marshaller.ZooMarshaller;
import com.gecko.schema.zoo.v1.Animal;
import com.gecko.schema.zoo.v1.Inventory;
import com.gecko.schema.fintech.v1.CreditCard;

/**
 * Created by hlieu on 04/16/17.
 */
public class MarshalMain {

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

   public static void zooInventory () throws Exception {
      Inventory inventory = getInventory ();
      String zooXml = ZooMarshaller.marshal (inventory.getAnimal ().get(0));
      System.out.println (zooXml);
   }

   public static CreditCard getCreditCard () {
      CreditCard cc = new CreditCard ();
      cc.setType ("mastercard");
      cc.setControlNumber (342);
      cc.setExpiryDate ("3/20");
      cc.setNumber ("234234234234");
      return cc;
   }



   public static void creditCard () throws Exception {
      CreditCard cc = getCreditCard ();
      System.out.println (FinanicalMarshaller.marshal(cc));
   }

   public static void main (String[] args) throws Exception {
      zooInventory ();
      creditCard ();
   }
}
