package com.nourdine.vetements.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nourdine.vetements.entities.Vetement;
import com.nourdine.vetements.repos.VetementRepository;

@Service
public class VetementServiceImpl implements VetementService {
	@Autowired
	VetementRepository vetementRepository;
	
	@Override
	public Vetement saveVetement(Vetement v) {
		
		return vetementRepository.save(v);
	}

	@Override
	public Vetement updateVetement(Vetement v) {
		return vetementRepository.save(v);

	}

	@Override
	public void deleteVetement(Vetement v) {
		vetementRepository.delete(v);
	}

	@Override
	public void deleteVetementById(Long id) {
		vetementRepository.deleteById(id);
		
	}

	@Override
	public Vetement getVetement(Long id) {
		return vetementRepository.findById(id).get();
	}

	@Override
	public List<Vetement> getAllVetements() {
		
		return vetementRepository.findAll();
	}

	@Override
	public Page<Vetement> getAllVetementsParPage(int page, int size) {
		return vetementRepository.findAll(PageRequest.of(page, size));
	}

}
