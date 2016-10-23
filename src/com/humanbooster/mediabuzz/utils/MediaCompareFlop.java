package com.humanbooster.mediabuzz.utils;

import com.humanbooster.mediabuzz.business.Media;

public class MediaCompareFlop implements Comparable<Media> {

	@Override
	public int compareTo(Media autreMedia) {
		if((this.getVote().getTop().getNbVote()/this.getVote().getFlop().getNbVote())==
				(autreMedia.getVote().getTop().getNbVote()/this.getVote().getFlop().getNbVote()))
			if (this.getVote().getTop().getNbVote()==autreMedia.getVote().getTop().getNbVote())
				if (this.getDatePublication()==autreMedia.getDatePublication())
					return 0;
				else if (this.getDatePublication().before(autreMedia.getDatePublication()))
					return 1;
				else
					return -1;
			else if (this.getVote().getFlop().getNbVote()> autreMedia.getVote().getFlop().getNbVote())
				return 1;
			else 
				return -1;
		else if((this.getVote().getTop().getNbVote()/this.getVote().getFlop().getNbVote()) <
				(autreMedia.getVote().getTop().getNbVote()/autreMedia.getVote().getFlop().getNbVote()))
			return 1;
		else
			return -1;
	}
	
}
