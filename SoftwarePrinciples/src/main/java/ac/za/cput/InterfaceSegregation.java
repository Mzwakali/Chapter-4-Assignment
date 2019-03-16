package ac.za.cput;

public class InterfaceSegregation {

    //Correct way
    interface Snake{
        void hiss();
    }
    interface Predator{
        void roar();
    }
    public class BlackMamba implements Snake{
        @Override
        public void hiss() {
            System.out.println("Hssssss!");
        }
        public class Cub implements Predator{
            @Override
            public void roar() {
                System.out.println("Roooooaaaaaar!");
            }
        }

    }

    //Wrong way
    interface Animal{
        void hiss();
        void raor();
    }
    public class Tiger implements Animal{

        @Override
        public void hiss() {
        }

        @Override
        public void raor() {
            System.out.println("ROOOAAAAR!");
        }
    }

}
