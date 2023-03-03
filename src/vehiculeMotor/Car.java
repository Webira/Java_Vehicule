package vehiculeMotor;

public class Car extends VehicleMotorized {

	public Car(String model, Motor carMotor) {
		super(model, carMotor);
		// TODO Auto-generated constructor stub
	}
	public void rouler(int quantityfuel) {
		super.getCarMotor().use(quantityfuel);
	}


}
