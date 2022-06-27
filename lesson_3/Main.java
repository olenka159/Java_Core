package lesson_3;

public class Main {
        public static void main(String[] args) {
            Box<Apple> myBoxApple = new Box();
            Box<Apple> myBoxApple2 = new Box();
            Box<Orange> myBoxOrange = new Box();

            myBoxApple.addFruit(new Apple());
            myBoxApple.addFruit(new Apple());
            myBoxApple.addFruit(new Apple());
            myBoxApple.addFruit(new Apple());

            myBoxApple2.addFruit(new Apple());
            myBoxApple2.addFruit(new Apple());

            myBoxOrange.addFruit(new Orange());
            myBoxOrange.addFruit(new Orange());

            System.out.println(myBoxApple.getCount());

            System.out.println(myBoxApple.getWeight());
            System.out.println(myBoxOrange.getWeight());
            System.out.println(myBoxApple.compare(myBoxApple2));

            System.out.println("myBoxApple=" + myBoxApple.getWeight());
            System.out.println("myBoxApple2=" + myBoxApple2.getWeight());
            System.out.println("Пересыпаем содержимое из myBoxApple в myBoxApple2");
            myBoxApple.moveToAnotherBox(myBoxApple2);
            System.out.println("myBoxApple=" + myBoxApple.getWeight());
            System.out.println("myBoxApple2=" + myBoxApple2.getWeight());
        }
    }

