package hu.bme.mit.train.interfaces;

public interface TrainSensor {

	int getSpeedLimit();

	int overrideSpeedLimit(int speedLimit);

}
