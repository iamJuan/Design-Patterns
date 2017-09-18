package com.john.exercise.composite;

public class CompositeTest {
	public static void main(String args[]){
		Trash trash = new Trash("Trash Can", "Trash");
		Trash bio = new Trash("Blue Trash Bin", "Biodegradable");
		Trash nonbio = new Trash("Red Trash Bin", "Non-Biodegradable");
		
		Trash tinCan = new Trash("Tin Can", "Non-Bio");
		Trash plastic = new Trash("Plastic", "Non-Bio");
		Trash lightBulbs = new Trash("Light Bulb", "Non-Bio");
		
		Trash fruitPeels = new Trash("Fruit Peels", "Bio");
		Trash papers = new Trash("Papers", "Bio");
		Trash driedLeaves = new Trash("Dried Leaves", "Bio");
		
		trash.add(bio);
		trash.add(nonbio);
		
		nonbio.add(tinCan);
		nonbio.add(plastic);
		nonbio.add(lightBulbs);
		
		bio.add(fruitPeels);
		bio.add(papers);
		bio.add(driedLeaves);
		
		System.out.println(trash); 
	      
	    for (Trash trashes : trash.getSubordinates()) {
	       System.out.println(trashes);

	       for (Trash strashes : trashes.getSubordinates()) {
	          System.out.println(strashes);
	       }
	    }
	}
}
