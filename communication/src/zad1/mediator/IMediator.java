package zad1.mediator;

public interface IMediator {
	void registerColleague(IColleague informant, IColleague informed);
	void unregisterColleague(IColleague colleague);
	public void notifyColleagues(IColleague colleague, double newPrice);
}
