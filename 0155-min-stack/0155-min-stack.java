class MinStack {
    int min = Integer.MAX_VALUE; // 스택의 현재 최소값을 저장하는 변수
    Stack<Integer> stack = new Stack<Integer>(); // 정수형 스택
    
    public void push(int x) {
        // 새로운 값 x가 현재 최소값 min보다 작거나 같으면,
        // 현재 최소값을 스택에 푸시하고, min을 x로 갱신
        if(x <= min){          
            stack.push(min);
            min = x;
        }
        stack.push(x); // 새로운 값을 스택에 푸시
    }

    public void pop() {
        // 스택에서 값을 제거했을 때, 그 값이 현재 최소값 min과 같으면,
        // 스택에서 한 번 더 값을 제거하고, 이를 새로운 최소값으로 설정
        if(stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek(); // 스택의 맨 위에 있는 요소를 반환
    }

    public int getMin() {
        return min; // 현재 스택의 최소값을 반환
    }
}
