class Dog {
  String name = "spot";
  

  void goodBoy(){
  	System.out.println("Wags tail");
  }

  void rename(String newValue) {
  	name = newValue;
  }

  void whatsYourNameBoy(){
  	System.out.println(name);
  	goodBoy();
  }
}

interface Appliance
{
	void setPower();
	// void unplug();
	// void plugin();
}

class Lamp implements Appliance {
	boolean power = false;

	public void setPower()
	{
		if (power == false) {

		  power = true;	
		}
		else {
		  power = false;
		}
	}

	void printState(){
		System.out.println("power: " + power);
	}
}	

class Radio implements Appliance {
	boolean power = false;
	int volume = 0;

	public void setPower()
	{
		if (power == false) {

		  power = true;	
		}
		else {
		  power = false;
		  volume = 0;
		}
	}

	void setVolume(int newValue)
	{
		volume = newValue;
	}

	void printState(){
		System.out.println("power: " + power + " volume: " + volume);
	}
}	