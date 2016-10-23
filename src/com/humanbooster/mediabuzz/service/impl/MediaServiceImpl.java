package com.humanbooster.mediabuzz.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.humanbooster.mediabuzz.business.Media;
import com.humanbooster.mediabuzz.service.MediaService;

public class MediaServiceImpl implements MediaService {
	//Attributes
	private Connection con;
	private List<Media> media = new ArrayList<>();
	
	//Constructor
	public MediaServiceImpl(Connection con){
		this.con = con;
	}
	
	//Methods
	@Override
	public List<Media> mediaParOrdreAntichronologiqueSql() {
		String query = "SELECT * FROM media ORDER BY datePublication";

		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return media;
	}

	@Override
	public List<Media> mediaParOrdreTopSql() {
		String query = "SELECT * FROM media ORDER BY SUM(Top)/SUM(Flop) DESC,SUM(Top),datePublicateion";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return media;
	}

	@Override
	public List<Media> mediaParOrdreFlopSql() {
		String query = "SELECT * FROM media ORDER BY SUM(Top)/SUM(Flop) ASC,SUM(Flop),datePublicateion";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return media;
	}

	@Override
	public List<Media> mediaParNbVueSql() {
		String query = "SELECT * FROM media ORDER BY nbVue DESC";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return media;
	}

	@Override
	public List<Media> mediaParTagSql(String tag) {
		String query = "SELECT*FROM media WHERE tag = ?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, tag);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}return media;
	}

	@Override
	public List<Media> mediaParAuteurSql(String auteur) {
		String query = "SELECT*FROM media WHERE auteur = ?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, auteur);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}return media;
	}

}
