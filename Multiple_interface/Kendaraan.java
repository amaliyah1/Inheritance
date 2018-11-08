public class Kendaraan implements Mobil, Motor{
	public void merkMotor(){
		System.out.println("HONDA");
	}
	public void cetakType(){
		System.out.println("SCOOPY");
	}
	public void merkMobil(){
		System.out.println("FORTUNER");
	}
	public void tampilType(){
		System.out.println("CIVIC");
	}


	public static void main(String[] args) {
		//TODO Auto-generated method stub

		Kendaraan k1 = new Kendaraan();
		k1.merkMotor();
		k1.cetakType();
		k1.merkMobil();
		k1.tampilType();
	}
}