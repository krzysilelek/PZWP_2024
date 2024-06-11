package zad1.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mediator implements IMediator{
	
	private Map<IColleague,List<IColleague>>colleaguesConnections;
	
	public Mediator() {
		colleaguesConnections = new HashMap<>();
	}

	@Override
	public void registerColleague(IColleague informant, IColleague informed) {
		colleaguesConnections.computeIfAbsent(informant, k -> new ArrayList<>()).add(informed);
        informant.setMediator(this);
        informed.setMediator(this);
	}

	@Override
	public void unregisterColleague(IColleague colleague) {
		if (colleaguesConnections.containsKey(colleague)) {
			colleaguesConnections.remove(colleague);
        } else {
        	for (List<IColleague> friends : colleaguesConnections.values()) {
                friends.remove(colleague);
            }
        }
		
	}

	@Override
	public void notifyColleagues(IColleague colleague, double newPrice) {
		if (colleaguesConnections.containsKey(colleague)) {
            List<IColleague> listOfInformed = new ArrayList<>(colleaguesConnections.get(colleague)); 
            for (IColleague inform : listOfInformed) {
                inform.update(newPrice);
            }
        }
	}
}
