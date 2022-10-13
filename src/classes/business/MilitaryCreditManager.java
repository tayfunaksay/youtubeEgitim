package classes.business;

public class MilitaryCreditManager implements CreditService {

	@Override
	public void Calculate() {
		System.out.println("Asker Kredisi Hesaplandı.");
		
	}

	@Override
	public void Save() {
		System.out.println("Asker Kredisi Verildi.");
		
	}

}
