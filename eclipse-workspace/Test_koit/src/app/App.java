package app;

import car.AutomaticCar;
import car.ManualCar;
import common.Vehicle;
import train.FreightTrain;
import train.PassengerTrain;

public class App {
    public static void main(String[] args) {

        // 각 자동차 및 열차 객체 생성
        Vehicle manualCar = new ManualCar("10가1234", "blue", false, 0);
        Vehicle automaticCar = new AutomaticCar("10가1234", "blue", false);
        Vehicle passengerTrain = new PassengerTrain("KTX001", "서울", "부산", false, 200);
        Vehicle freightTrain = new FreightTrain("Cargo001", "부산", "구미", true, 100.0);

        // 시동 걸기
        System.out.println("-------( 시동상태 )-------");
        manualCar.setStart();
        automaticCar.setStart();
        passengerTrain.setStart();
        freightTrain.setStart();
        System.out.println();

        // 가속
        System.out.println("-------( 가속 )-------");
        manualCar.accelerate();  // 가속 시 기어 입력 받음
        automaticCar.accelerate();
        passengerTrain.accelerate();
        freightTrain.accelerate();
        System.out.println();

        // 정차
        System.out.println("-------( 정차 )-------");
        manualCar.stop();
        automaticCar.stop();
        passengerTrain.stop();
        freightTrain.stop();
        System.out.println();
    }
}
