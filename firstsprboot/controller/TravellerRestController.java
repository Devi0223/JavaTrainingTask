package com.dal.firstsprboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dal.firstsprboot.entity.ForeignTour;
import com.dal.firstsprboot.entity.LocalTour;
import com.dal.firstsprboot.entity.Traveller;
import com.dal.firstsprboot.repository.TravellerRepository;
import com.dal.firstsprboot.service.TravellerService;

@RestController
public class TravellerRestController {
	
	@Autowired
	TravellerService travellerService;
	@Autowired
	TravellerRepository travellerRepository;
	
	@PostMapping("/addTraveller")
	public Traveller addTraveller(@RequestBody Traveller traveller)
	{
		return travellerService.addTraveller(traveller);
	}
	
	@GetMapping("/welcome")
	public String helloApp() {
		return "Hi devi traveller";
	}
	

	@PostMapping("/requestlocaltour")
	public LocalTour saveLocalTourRequest(@RequestBody LocalTour localTour) {
		return travellerService.saveLocalTourRequest(localTour);
	}

	@PostMapping("/requestforeigntour")
	
	public ForeignTour saveForeignTourRequest(@RequestBody ForeignTour foreignTour) {
		System.out.println("****** From Controller Foreign ******" + foreignTour);
		return travellerService.saveForeignTourRequest(foreignTour);
	}
	
	@GetMapping("/listtravellers")

	public List<Traveller> listAllTravellers() {

		return travellerService.listAllTravellers();
	}
	
	@GetMapping("/findbytid/{tId}")

	public Optional<Traveller> searchByTreavellerId(@PathVariable Long tId) {

		return travellerService.searchByTreavellerId(tId);
	}
	
	@GetMapping("/findbytname/{tname}")

	public Traveller searchByTreavellerName(@PathVariable String tname) {

		return travellerService.searchByTravellerName(tname);
	}
	
	@DeleteMapping("/deleteTravellerById/{tId}")

	public void deleteTravellerById(@PathVariable Long tId) {

		 travellerService.delTravellerById(tId);
	}
	
	@GetMapping("/login")	
	public ResponseEntity<Traveller> loginrest(@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "password", required = false) String password) {
		System.out.println("*******This is a login rest controller ***********");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Traveller traveller = travellerRepository.findByTravellerName(auth.getName());
		System.out.println("After Login__________________"
				+ "send back to Angular or postman as response__________________" + traveller);
		return ResponseEntity.ok(traveller);
	}
	
}
