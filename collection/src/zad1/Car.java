package zad1;

public class Car implements IElement{

	private String brand;
	
	public Car(String brand) {
		this.brand = brand;
	}
	
	@Override
	public void addElement(IElement element) {
		throw new UnsupportedOperationException("We cannot add something to the car!");
	}

	@Override
	public void removeElement(int index) {
		throw new UnsupportedOperationException("We cannot remove something from the car!");
	}

	@Override
	public Object[] getChildren() {
		return new Object[0];
	}

	@Override
	public int countElements() {
		return 1;
	}
	
	@Override
	public void info() {
		System.out.println(this.brand+" 1");
	}
	
}
