package ProxyPattern;

import java.util.HashMap;
import java.util.Map;

public class ElectricTrainTimetableProxy implements TrainTimetable {
    private ElectricTrainTimetable electricTrainTimetable;
    private Map<String, String> cache = new HashMap<>(); // 캐시를 저장할 HashMap

    public ElectricTrainTimetableProxy(ElectricTrainTimetable electricTrainTimetable) {
        this.electricTrainTimetable = electricTrainTimetable;
    }

    @Override
    public void getTimetable() {
        // 캐시된 데이터가 있는지 확인
        if (cache.containsKey("timetable")) {
            System.out.println("ProxyPattern.ElectricTrainTimetableProxy: Returning cached timetable...");
            System.out.println(cache.get("timetable"));
        } else {
            System.out.println("ProxyPattern.ElectricTrainTimetableProxy: Fetching the timetable...");
            electricTrainTimetable.getTimetable(); // 실제 객체 호출
            cache.put("timetable", "Timetable information");
            System.out.println("ProxyPattern.ElectricTrainTimetableProxy: Timetable fetched and cached.");
        }
    }

    @Override
    public void getTimeDepartureTime() {
        // 캐시된 데이터가 있는지 확인
        if (cache.containsKey("departureTime")) {
            System.out.println("ProxyPattern.ElectricTrainTimetableProxy: Returning cached departure time...");
            System.out.println(cache.get("departureTime"));
        } else {
            System.out.println("ProxyPattern.ElectricTrainTimetableProxy: Fetching the departure time...");
            electricTrainTimetable.getTimeDepartureTime(); // 실제 객체 호출
            cache.put("departureTime", "Departure time information");
            System.out.println("ProxyPattern.ElectricTrainTimetableProxy: Departure time fetched and cached.");
        }
    }
}
