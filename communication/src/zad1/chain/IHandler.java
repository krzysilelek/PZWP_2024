package zad1.chain;

public interface IHandler {
	public void setNext(IHandler handler);
	public boolean postEvent(IEvent event);
	public boolean handleEvent(IEvent event);
}
