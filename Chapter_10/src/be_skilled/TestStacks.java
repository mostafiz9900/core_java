package be_skilled;

public class TestStacks {

    public static void main(String[] args) {
        Stacks_378 stack = new Stacks_378();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
            while (!stack.empty()) {
                System.out.print(stack.pop() + " ");

            }

        }
    }
}
