package com.humanbooster.mediabuzz.utils;

import com.humanbooster.mediabuzz.business.Media;

public class MediaCompareAntiChrono implements Comparato<Media>{

	@Override
	public int compareTo(Media autreMedia) {
		if(this.getDatePublication().before(autreMedia.getDatePublication()))
			return -1;
		else if(this.getDatePublication().after(getDatePublication()))
			return 1;
		else
			return 0;
	}

	

}
