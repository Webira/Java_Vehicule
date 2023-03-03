package vehiculeMotor;

public class Motorbike extends VehicleMotorized {

	public Motorbike(String model, Motor carMotor) {
		super(model, carMotor);
		// TODO Auto-generated constructor stub
	}
	
	public void rouler(int quantityfuel) {
		super.getCarMotor().use(quantityfuel);
	}

}
