package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	 
	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	

	public GamerManager() {
		
	}


	public void register(Gamer gamer) {
		if (gamerCheckService.CheckIsRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " " + "isimli oyuncu kayýt edildi.");
		}
		else {
			System.out.println("Böyle bir kullanýcý bulunamadý.");
		}
	}
	

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() +  " " + "isimli oyuncu eklendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() +  " " + "isimli oyuncu silindi.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() +  " " + "Ýsimli oyuncu güncellendi.");
		
	}
	
}
