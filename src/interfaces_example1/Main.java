package interfaces_example1;

public class Main {

	public static void main(String[] args) {
		ElectricBehaviour eb = new Computer();
		eb.setOff();
		eb.setOn();
		eb.isOn();

		HasDisplay hd = new Computer();
		hd.displayOff();
		hd.displayOn();
		hd.isDsplayOn();

		Computer c = new Computer();
		Object o = new Object();
		if (o instanceof ElectricBehaviour) {
			ElectricBehaviour eb1 = (ElectricBehaviour)o;
		}
		if (o instanceof HasDisplay) {

		}
	}

}
