
import java.util.Date;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;


public class Main {

	public static void main(String[] args) {
		
		GameManager gameManager = new GameManager();
		Game game =new Game(1,"Forious Racing 3D","Yarýþ Oyunu",200);
		gameManager.add(game);
		
		
		GamerManager gamerManager = new GamerManager();
		Gamer gamer = new Gamer(1, "Beyza Nur", "Ayhan", new Date(1996,02,20),"11111111111");
		gamerManager.add(gamer);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "Yýlbaþý", 100);
		campaignManager.add(campaign);
	}

}
