package concurrency.level2.Library;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

import concurrency.level2.Library.ReadingObject.TypeReading;

public class Library {

	private String name;
	private HashMap<TypeReading, HashMap<IGroupType, TreeSet<ReadingObject>>> catalog;
	private HashMap<ReadingObject, Double> givenReadings;
	
	public Library(String name) {
		this.name = name;
		this.catalog=new HashMap<>();
		this.givenReadings=new HashMap<>();
	}
	
	public void addReadingObject(ReadingObject r){
		if(!catalog.containsKey(r.getType())){
			catalog.put(r.getType(), new HashMap<>());
		}
		if(!catalog.get(r.getType()).containsKey(r.getGroupType())){
			catalog.get(r.getType()).put(r.getGroupType(), new TreeSet<>());
		}
		catalog.get(r.getType()).get(r.getGroupType()).add(r);
	}
	
	public void rentReadingObject(ReadingObject r){
		this.catalog.get(r.getType()).get(r.getGroupType()).remove(r);
	}
	
	
	public void printCatalog(){
		for(Entry<TypeReading, HashMap<IGroupType, TreeSet<ReadingObject>>> entry: this.catalog.entrySet()){
			System.out.println(entry.getKey());
			HashMap<IGroupType, TreeSet<ReadingObject>> map = entry.getValue();
			
			for(Entry<IGroupType, TreeSet<ReadingObject>> entry2 : map.entrySet()){
				System.out.println("   "+entry2.getKey());
				
				for(ReadingObject r: entry2.getValue()){
					System.out.println("        "+r);
				}
			}
		}
	}

	//search by name of book, not by readingObject
	public ReadingObject giveBook(ReadingObject reading) {
		TypeReading type=reading.getType();
		IGroupType group=reading.getGroupType();
		if(type==TypeReading.MAGAZINE){
			System.out.println("Magazines are only for reading.");
			return null;
		}
		TreeSet<ReadingObject> setForSearch=this.catalog.get(type).get(group);
		if(setForSearch.contains(reading)){
			System.out.println(this.name+" give "+reading.getName());
			this.givenReadings.put(reading, reading.getValueRent());
			
			reading.checker=new BookChecker(reading, this);
			reading.checker.start();
			setForSearch.remove(reading);
			return reading;
		}
		return null;
	}

	public void receiveBook(ReadingObject takenReading) {
		takenReading.checker.interrupt();
		TypeReading type=takenReading.getType();
		IGroupType group=takenReading.getGroupType();
		this.catalog.get(type).get(group).add(takenReading);
		System.out.println(this.name + " receive "+takenReading.getName());
		System.out.println("You owe "+this.givenReadings.get(takenReading));
		this.givenReadings.remove(takenReading);
	}

	public void increaseTax(ReadingObject reading) {
		this.givenReadings.put(reading, (this.givenReadings.get(reading)*1.01));		
	}
}
