package common;

public class Train {
    String trainNumber;      // 열차 번호
    String departureStation; // 출발역
    String arrivalStation;   // 도착역
    boolean isStart;         // 시동 상태

    public Train(String trainNumber, String departureStation, String arrivalStation, boolean isStart) {
        this.trainNumber = trainNumber;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.isStart = isStart;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public boolean isStart() {
        return isStart;
    }

    public void setStart() {
        isStart = !isStart;  // 시동 상태 반전
    }
}
