package com.nourdine.vetements;

import java.util.Date;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.nourdine.vetements.entities.Vetement;
import com.nourdine.vetements.repos.VetementRepository;
import com.nourdine.vetements.service.VetementService;

@SpringBootTest
class VetementsApplicationTests {

	@Autowired
	private VetementRepository vetementRepository;
	
	@Autowired
	private VetementService vetementService;

	@Test
	public void testCreateProduit() {
		Vetement vet = new Vetement("guess", 1600.500, new Date());
		vetementRepository.save(vet);
	}

	@Test
	public void testFindVetement() {
		Vetement v = vetementRepository.findById(1L).get();
		System.out.println(v);
	}

	@Test
	public void testUpdateVetement() {
		Vetement v = vetementRepository.findById(1L).get();
		v.setPrixVet(2000.0);
		vetementRepository.save(v);
		System.out.println(v);
	}

	@Test
	public void testDeleteVetement() {
		vetementRepository.deleteById(1L);
	}
	@Test
	public void testFindAllVetement() {
		List<Vetement> vets = vetementRepository.findAll();
		for (Vetement v : vets) {
			System.out.println(v);
		}
	}
	
	@Test
	public void testFindByNomProduitContains()
	{

	Page<Vetement> vets = vetementService.getAllVetementsParPage(0,2);  
	System.out.println(vets.getSize());
	System.out.println(vets.getTotalElements());
	System.out.println(vets.getTotalPages());
	vets.getContent().forEach(v -> {System.out.println(v.toString());
	 });
	/*
	 * ou bien for (Produit p : prods) { System.out.println(p); }
	 */
}

}
