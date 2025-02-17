package train;

import common.Train;
import common.Vehicle;

public class FreightTrain extends Train implements Vehicle {
    private double cargoWeight;

    public FreightTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, double cargoWeight) {
        super(trainNumber, departureStation, arrivalStation, isStart);
        this.cargoWeight = cargoWeight;
    }
    @Override
    public void accelerate() {
        System.out.println("화물 열차가 가속합니다!");
        System.out.println("열차번호: " + getTrainNumber());
        System.out.println("출발역: " + getDepartureStation());
        System.out.println("도착역: " + getArrivalStation());
        System.out.println("시동 상태: " + (isStart() ? "꺼짐" : "켜짐"));
        System.out.println("화물 무게: " + cargoWeight);
        System.out.println();
    }
    @Override
    public void stop() {
        System.out.println("화물 열차가 정차합니다!");
        System.out.println("열차번호: " + getTrainNumber());
        System.out.println("출발역: " + getDepartureStation());
        System.out.println("도착역: " + getArrivalStation());
        System.out.println("시동 상태: " + (isStart() ? "켜짐" : "꺼짐"));
        System.out.println("화물 무게: " + cargoWeight);
        System.out.println();
    }
    @Override
    public void setStart() {
        super.setStart();
        System.out.println("화물 열차의 시동 상태: " + (isStart() ? "꺼짐" : "켜짐"));
    }
}
