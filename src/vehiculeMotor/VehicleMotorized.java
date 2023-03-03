package vehiculeMotor;

public class VehicleMotorized extends Vehicle {

	private Motor carMotor;
	
	public VehicleMotorized(String model, Motor carMotor) {
		super(model);
		this.carMotor = carMotor;
	}
	
	public Motor getCarMotor() {
		return carMotor;
	}

	public void setCarMotor(Motor carMotor) {
		this.carMotor = carMotor;
	}
	///
	public boolean startMotor() {
		
		if(carMotor.start()) {
		return true;
		}
		return false;
	}
	///
	 public void stopMotor() {
		 carMotor.stop();
	 }

	 public void fillTank(int quantityfuel) {
		 carMotor.fillTank(quantityfuel);
	 }
}
