package common;

public class Car {
    private String vin;     // 차량 번호
    private String color;   // 색상
    private boolean isStart; // 시동 상태

    public Car(String vin, String color, boolean isStart) {
        this.vin = vin;
        this.color = color;
        this.isStart = isStart;
    }

    public String getVin() {
        return vin;
    }

    public String getColor() {
        return color;
    }

    public boolean isStart() {
        return isStart;
    }

    public void setStart() {
        isStart = !isStart;  // 시동 상태를 반전
    }
}
