package kodlamaio.hrms.adapter.concretes;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.Locale;

import kodlamaio.hrms.adapter.abstracts.CheckService;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckService {

	@Override
	public boolean checkIsPerson(JobSeeker jobSeeker) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;

		LocalDate birthDate = jobSeeker.getDateOfBirth();
		int year = birthDate.getYear();

		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getNationalityId()),
					jobSeeker.getFirstName().toUpperCase(new Locale("tr")),
					jobSeeker.getLastName().toUpperCase(new Locale("tr")), year);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return result;
	}

}
