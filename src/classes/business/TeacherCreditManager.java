package classes.business;

public class TeacherCreditManager implements CreditService {

	@Override
	public void Calculate() {
		
		System.out.println("Öğretmen Kredisi Hesaplandı.");
		
	}

	@Override
	public void Save() {
		System.out.println("Öğretmen Kredisi Verildi.");
		
	}
	
	

}
