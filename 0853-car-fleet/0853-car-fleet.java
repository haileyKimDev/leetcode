class Solution {
 public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] cars = new double[n][2];
        
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }
        
        // 위치를 기준으로 내림차순 정렬합니다.
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));
        
        Stack<Double> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            double time = cars[i][1];
            // 새로운 군단을 형성해야 하는 경우
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }
        
        return stack.size();
    }
}