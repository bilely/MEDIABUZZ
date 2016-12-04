package com.humanbooster.mediabuzz.dao;

import java.util.List;

import com.humanbooster.mediabuzz.business.Image;
import com.humanbooster.mediabuzz.business.Utilisateur;

public interface ImageDao {
	public boolean createImage(Image image);

	public Image getImage(int id);

	public List<Image> getImages(Utilisateur user);

	public List<Image> getAllImage();

	public boolean upDateImage(Image image);

	public boolean upDateImages(List<Image> images);

	public boolean deleteImage(int id);

	public boolean deleteImages(Utilisateur user);

	public boolean deleteAllImages();
}
