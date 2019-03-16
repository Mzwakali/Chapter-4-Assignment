package ac.za.cput;

public class OpenClosed {

    //done wrong
    class Caclculator{
        public int subtract(int a, int b){
            return a-b;
        }

        public int subtract(int x, int b, int y){
            return x - b - y;
        }
    }

    //correct way
    interface Calculator{
        int subtract(int a, int b);
        int subtract(int x, int b, int y);
    }
    class Calc implements Calculator{
        @Override
        public int subtract(int a, int b){
            return a-b;
        }

        @Override
        public int subtract(int x, int b, int y) {
            return x - b - y;
        }
    }
}
