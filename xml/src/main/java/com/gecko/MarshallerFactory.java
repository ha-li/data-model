package com.gecko;

import com.gecko.domain.internal.Animal;
import com.gecko.domain.internal.Inventory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 * Created by hlieu on 04/16/17.
 */
public class MarshallerFactory {

   public static void marshal (Object object) throws Exception {
      JAXBContext context = JAXBContext.newInstance (object.getClass());
      Marshaller marshaller = context.createMarshaller ();
      marshaller.setProperty (Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
      marshaller.marshal (object, System.out);
   }

   public static void main (String[] args) throws Exception {
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

      MarshallerFactory.marshal (animal);
   }
}

