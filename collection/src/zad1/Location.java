package zad1;

import java.util.ArrayList;
import java.util.List;

public class Location implements IElement{
	
	private String name;
	private List<IElement> elements;
	
	public Location(String name) {
		this.name = name;
		this.elements = new ArrayList<IElement>();
	}
	
	@Override
	public void addElement(IElement element) {
		this.elements.add(element);
	}

	@Override
    public void removeElement(int index) {
		if (index >= 0 && index < elements.size()) {
			this.elements.remove(index);
		}
    }

	@Override
    public Object[] getChildren() {
		return this.elements.toArray();
    }

	@Override
    public int countElements() {
    	return this.elements.size();
    }

	@Override
	public void info() {
		int countOfElements = 0;
		for(IElement e : elements) {
			e.info();
			countOfElements += e.countElements();
		}
		System.out.println(this.name + " " +countOfElements);
	}

}
