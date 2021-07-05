package hit.day20.revision;

public class Demo {
	 static SevaDepartment myGoverment = new SevaDepartment();

	static {
		PoliceDepartment police = new PoliceDepartment();
		MedicalDepartment md = new MedicalDepartment();
		Corporation c = new Corporation();
		HealthDepartment hd = new HealthDepartment();
		
		DeathCertificate dc = new DeathCertificate(md, police, c);
		HotelOpeningCertificate hc = new HotelOpeningCertificate(hd, police, c);
		
		myGoverment.setCommand(dc, 0);
		myGoverment.setCommand(hc, 1);
		
	}
	public static void main(String[] args) {
		// this is what the citizen does...
		myGoverment.executeCommand(1);
	}
}
