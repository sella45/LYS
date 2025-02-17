package 연습;

public class bbbbb {
    static class Connection {  // 클래스 외부에서 접근할 수 있도록 static으로 선언
        private static Connection _inst = null;  // 싱글턴 인스턴스
        private int count = 0;

        // private 생성자: 외부에서 인스턴스 생성 불가
        private Connection() {}

        // 싱글턴 객체 반환 메서드
        public static Connection get() {
            if (_inst == null) {
                _inst = new Connection();
            }
            return _inst;
        }

        // count 증가
        public void count() {
            count++;
        }

        // count 값 반환
        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        Connection conn1 = Connection.get();
        conn1.count();
        Connection conn2 = Connection.get();
        conn2.count();
        Connection conn3 = Connection.get();
        conn3.count();

        conn1.count();
        System.out.print(conn1.getCount());  // 결과는 4
    }
}
