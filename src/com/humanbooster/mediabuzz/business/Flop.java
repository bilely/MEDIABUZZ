package com.humanbooster.mediabuzz.business;

public class Flop {

	//Attributes
		private Vote vote;
		int nbVote;
		
		//Constructors
		public Flop(Vote vote, int nbVote) {
			this.vote = vote;
			this.nbVote = nbVote;
		}

		//Methods
		
		//Gets&Sets
		public Vote getVote() {
			return vote;
		}

		public void setVote(Vote vote) {
			this.vote = vote;
		}

		public int getNbVote() {
			return nbVote;
		}

		public void setNbVote(int nbVote) {
			this.nbVote = nbVote;
		}
	
}
