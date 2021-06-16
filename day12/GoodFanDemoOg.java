
package hit.day12;

import java.util.Scanner;

public class GoodFanDemoOg {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	GoodFan orient = new GoodFan();
	while (true) {
		System.out.println("Press a key and enter for pulling chain...");
		scan.next();
		orient.pull();
	}
}
}

class GoodFan {
	State state = new SwitchOffState();
	public void pull() {
		state.pull(this);
	}
}
abstract class State {
	public abstract void pull(GoodFan fan);
}

class SwitchOffState extends State {
	@Override
	public void pull (GoodFan fan) {
		System.out.println("Switch on state...");
		fan.state = new SwitchOnState();
	}
}
class MediumSpeedState extends State {
	@Override
	public void pull (GoodFan fan) {
		System.out.println("High speed state...");
		fan.state = new HighSpeedState();
	}
}
class HighSpeedState extends State {
	@Override
	public void pull (GoodFan fan) {
		System.out.println("Switch off state...");
		fan.state = new SwitchOffState();
	}
}
class SwitchOnState extends State {
	@Override
	public void pull (GoodFan fan) {
		System.out.println("Medium speed on state...");
		fan.state = new MediumSpeedState();
	}
}
