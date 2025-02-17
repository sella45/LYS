package car;

import common.Car;
import common.Vehicle;

public class AutomaticCar extends Car implements Vehicle {

    public AutomaticCar(String vin, String color, boolean isStart) {
        super(vin, color, isStart);
    }
    @Override
    public void accelerate() {
        System.out.println("자동 변속기 자동차가 가속합니다!");
        System.out.println("차량번호: " + getVin());
        System.out.println("색상: " + getColor());
        System.out.println("시동 상태: " + (isStart() ? "켜짐" : "꺼짐"));
        System.out.println();
    }
    @Override
    public void stop() {
        System.out.println("자동 변속기 자동차가 정차합니다!");
        System.out.println("차량번호: " + getVin());
        System.out.println("색상: " + getColor());
        System.out.println("시동 상태: " + (isStart() ? "꺼짐" : "켜짐"));
        System.out.println();
    }
    @Override
    public void setStart() {
        super.setStart();
        System.out.println("자동 변속기 자동차의 시동 상태: " + (isStart() ? "켜짐" : "꺼짐"));
    }
}
