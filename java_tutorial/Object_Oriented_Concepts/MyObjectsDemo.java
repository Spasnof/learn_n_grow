class MyObjectsDemo {
	 public static void main(String[] args) {
	 	Dog mydog = new Dog();
	 	mydog.rename("Spotty");
	 	mydog.whatsYourNameBoy();

	 	Lamp mylamp = new Lamp();
	 	mylamp.setPower();
	 	mylamp.printState();
	 	mylamp.setPower();
	 	mylamp.printState();

	 	Radio myradio = new Radio();
	 	myradio.setPower();
	 	myradio.setVolume(11);
	 	myradio.printState();
	 	myradio.setPower();
	 	myradio.printState();
	 }
	}