package train;

import common.Train;
import common.Vehicle;

public class PassengerTrain extends Train implements Vehicle {
    private int passengerCount;

    public PassengerTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, int passengerCount) {
        super(trainNumber, departureStation, arrivalStation, isStart);
        this.passengerCount = passengerCount;
    }
    @Override
    public void accelerate() {
        System.out.println("여객 열차가 가속합니다!");
        System.out.println("열차번호: " + getTrainNumber());
        System.out.println("출발역: " + getDepartureStation());
        System.out.println("도착역: " + getArrivalStation());
        System.out.println("시동 상태: " + (isStart() ? "켜짐" : "꺼짐"));
        System.out.println("탑승객 수: " + passengerCount);
        System.out.println();
    }
    @Override
    public void stop() {
        System.out.println("여객 열차가 정차합니다!");
        System.out.println("열차번호: " + getTrainNumber());
        System.out.println("출발역: " + getDepartureStation());
        System.out.println("도착역: " + getArrivalStation());
        System.out.println("시동 상태: " + (isStart() ? "꺼짐" : "켜짐"));
        System.out.println("탑승객 수: " + passengerCount);
        System.out.println();
    }
    @Override
    public void setStart() {
        super.setStart();
        System.out.println("여객 열차의 시동 상태: " + (isStart() ? "켜짐" : "꺼짐"));
    }
}
