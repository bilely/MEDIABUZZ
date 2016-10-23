package com.humanbooster.mediabuzz.utils;

import com.humanbooster.mediabuzz.business.Media;

public abstract class MediaCompareVue implements Comparable<Media>{

	@Override
	public int compareTo(Media autreMedia) {
		if(this.getNbVue()==autreMedia.getNbVue())
			return 0;
		else if(this.getNbVue()>autreMedia.getNbVue())
			return 1;
		else
			return -1;
	}

}
