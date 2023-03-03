package vehiculeMotor;

public class Motor {

	private int quantityfuel;

	public Motor(int quantityfuel) {
		
		this.quantityfuel = quantityfuel;
	}
	
	public int getquantityfuel() {
		return quantityfuel;
	}
	
	public void setquantityfuel(int quantityfuel) {
		this.quantityfuel = quantityfuel;
	
	}
	// function start
	//var1
	/*
	public boolean fuelAvailable = quantityfuel >= 1 ;
	
	public boolean start(boolean fuelAvailable) {
						
		if(fuelAvailable) {
			System.out.println("I just consumed 1 liter to start");
		}else {
			System.out.println("0 liters left");
		}
		return fuelAvailable;
	} */
			//pr_var2
	
	public boolean start() {
		
		boolean fuelAvailable = false;
		if(quantityfuel >= 1) {
			System.out.println("Le moteur est démarré avec " + quantityfuel + " litres dans le reservoir" );
			//exactement pareil que : carburant = carburant - 1;
			quantityfuel -= 1;
			System.out.println("Je viens de consommer 1 litre pour démarrer");
			fuelAvailable = true;
		}
		
		return fuelAvailable;
	}

	
	// use
	
	public int use(int availfuel) {
		//int q =1;
		quantityfuel -= availfuel;
			System.out.println("I just consumed" + availfuel + "liters");
			
			return quantityfuel;
		
		/*for(int q=60; q>=0; q = q-10) {
			if(q==0) {
				System.out.println("the car broke down");
				
			}else if(q==60) {
				System.out.println("the engine is started with 60 liters in the tank");
				
			}else {
				System.out.println("I just consumed" + q + "liters");
			}
		}*/
		
	}
	// plein - fillTank
	
	public void fillTank(int quantityfuel) {
		this.quantityfuel += quantityfuel;
	}

	// stop
	public void stop() {
		System.out.println("the car broke down");
	}
	
	
	
}