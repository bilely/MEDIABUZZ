package com.humanbooster.mediabuzz.business;

import java.util.Date;

public class Vote {
	private Media media;
	private Date dateVote;
	private ENUM vote; 
	private Tag tag;
	
	public Vote(Media media, Date dateVote, ENUM vote, Tag tag) {
		super();
		this.media = media;
		this.dateVote = dateVote;
		this.vote = vote;
		this.tag = tag;
	}
	public Media getMedia() {
		return media;
	}
	public void setMedia(Media media) {
		this.media = media;
	}
	public Date getDateVote() {
		return dateVote;
	}
	public void setDateVote(Date dateVote) {
		this.dateVote = dateVote;
	}
	public ENUM getVote() {
		return vote;
	}
	public void setVote(ENUM vote) {
		this.vote = vote;
	}
	public Tag getTag() {
		return tag;
	}
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	@Override
	public String toString() {
		return "Vote [media=" + media + ", dateVote=" + dateVote + ", vote="
				+ vote + ", tag=" + tag + "]";
	}
	
}
