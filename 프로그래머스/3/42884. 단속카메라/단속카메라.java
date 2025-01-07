import java.util.*;

class Solution {
    static class Car implements Comparable<Car> {
        int src, desc;
        public Car(int src, int desc) {
            this.src = src;
            this.desc = desc;
        }
        
        @Override
        public int compareTo(Car c) {
            return this.desc - c.desc;
        }
    }
    
    public int solution(int[][] routes) {
        List<Car> cars = new ArrayList<>();
        for(int[] route: routes) {
            Car newCar = new Car(route[0], route[1]);
            cars.add(newCar);
        }
        
        Collections.sort(cars);
        
        int answer = 0;
        int last = -1;
        for(Car cur: cars) {
            if(last == -1) {
                last = cur.desc;
                answer++;
            } else if (cur.src <= last && cur.desc >= last) {
            } else {
                last = cur.desc;
                answer++;
            }
        }
        
        return answer++;
    }
}