package car;

import common.Car;
import common.Vehicle;
import java.util.Scanner;

public class ManualCar extends Car implements Vehicle {
    private int gear;

    public ManualCar(String vin, String color, boolean isStart, int gear) {
        super(vin, color, isStart);
        this.gear = gear;
    }

    public void setGear(int gear) {
        this.gear = gear; // 기어 상태 설정
    }

    // 가속, 정차, 시동 기능 구현
    @Override
    public void accelerate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("기어 상태를 입력하세요 ( 1단 ~ 6단 ): ");
        int newGear = scanner.nextInt();

        // 잘못된 기어 값이 입력될 경우
        while (newGear < 1 || newGear > 6) {
            System.out.println("잘못된 기어입니다. 1에서 6까지의 값을 입력해주세요.");
            newGear = scanner.nextInt();  
        }
        scanner.close();
        // 유효한 기어 값이 입력되면 기어 상태 변경
        setGear(newGear);
        // 가속 상태
        System.out.println("수동 변속기 자동차가 가속합니다!");
        System.out.println("차량번호: " + getVin());
        System.out.println("색상: " + getColor());
        System.out.println("시동 상태: " + (isStart() ? "켜짐" : "꺼짐"));
        System.out.println("기어 상태: " + gear);
        System.out.println();
    }
    @Override
    public void stop() {
        // 정차할 때 기어 상태를 0으로 변경
        setGear(0);

        System.out.println("수동 변속기 자동차가 정차합니다!");
        System.out.println("차량번호: " + getVin());
        System.out.println("색상: " + getColor());
        System.out.println("시동 상태: " + (isStart() ? "꺼짐" : "켜짐"));
        System.out.println("기어 상태: " + gear);  // 기어 상태 0으로 출력
        System.out.println();
    }
    @Override
    public void setStart() {
        super.setStart();
        System.out.println("수동 변속기 자동차의 시동 상태: " + (isStart() ? "켜짐" : "꺼짐"));
    }
}
