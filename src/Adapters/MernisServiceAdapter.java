package Adapters;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean CheckIsRealPerson(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;

		try {
			result = client.TCKimlikNoDogrula(
					Long.parseLong(gamer.getNationalityID()),
					gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth().getYear());

		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}
	

}
