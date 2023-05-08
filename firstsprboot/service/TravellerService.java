package com.dal.firstsprboot.service;

import java.util.List;
import java.util.Optional;

import com.dal.firstsprboot.entity.ForeignTour;
import com.dal.firstsprboot.entity.LocalTour;
import com.dal.firstsprboot.entity.Traveller;

public interface TravellerService {

	public Traveller addTraveller(Traveller traveller);
	public LocalTour saveLocalTourRequest(LocalTour localTour);
	public ForeignTour saveForeignTourRequest(ForeignTour foreignTour);
	public List<Traveller> listAllTravellers();
	
	public Optional<Traveller> searchByTreavellerId(Long tId);
	public Traveller searchByTravellerName(String tname);
	
	public void delTravellerById(Long tId);
}
