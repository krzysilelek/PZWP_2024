package zad1;


public interface IElement {    
    public void info();
    
    public void addElement(IElement element);

	public void removeElement(int index);

	public Object[] getChildren();

	public int countElements();
}