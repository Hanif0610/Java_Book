package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);                  //노선 번호가 100번인 버스
        studentJames.takeBus(bus100);               //james가 100번 버스를 탐
        studentJames.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway("2호선");   //노선 번호가 2호인 지하철
        studentTomas.takeSubway(subwayGreen);       //Tomas가 2호선을 탐
        studentTomas.showInfo();
        subwayGreen.showInfo();
    }
}