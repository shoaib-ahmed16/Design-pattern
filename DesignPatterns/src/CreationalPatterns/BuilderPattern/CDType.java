package CreationalPatterns.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class CDType {
	
	private List<Packing> items =new ArrayList<Packing>();
	public void addItem(Packing packs) {
		this.items.add(packs);
	}
	
	public void getCost() {
		for(Packing packs:items) {
			packs.price();
		}
	}
	public void showItems() {
		for(Packing packs:items) {
			System.out.print("CD Name: "+packs.pack());
			System.out.print(", Price: "+packs.price()+"\r\n");
		}
	}
}
