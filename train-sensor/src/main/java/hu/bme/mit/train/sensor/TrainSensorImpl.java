package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;

public class TrainSensorImpl implements TrainSensor {

	private TrainController controller;
	private int speedLimit = 5;

	public TrainSensorImpl(TrainController controller) {
		this.controller = controller;
	}

	@Override
	public int getSpeedLimit() {
		return speedLimit;
	}

	@Override
	public int overrideSpeedLimit(int speedLimit) {
		if(speedLimit <= 0) return -1;

		this.speedLimit = speedLimit;
		controller.setSpeedLimit(speedLimit);
		return 0;
	}

}
