package lesson_2;

public class Main {
    public static int inputArraySize = 4;

    public static void main(String[] args) {
        String[][] arr1 = {{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};
        String[][] arr2 = null;

        try{
            System.out.println("—умма = "+getSumArray(arr1));
        }
        catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.fillInStackTrace());
        }
    }

    static Integer getSumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array == null || array.length != inputArraySize || array[0].length != inputArraySize) {
            throw new MyArraySizeException();
        }

        Integer sumResult = 0;

        for (int i=0; i < array.length; i++){
            for (int j=0; j < array[i].length; j++){
                try {
                    sumResult = sumResult + Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException ex){
                    throw new MyArrayDataException("ќшибка преобразовани€ в €чейке arr["+i+"]["+j+"]");
                }
            }
        }

        return sumResult;
    }

    static public class MyArraySizeException extends Exception {
        public MyArraySizeException() {
            super("ќшибка размера");
        }
    }

    static public class MyArrayDataException extends Exception{
        public MyArrayDataException(String message) {
            super(message);
        }
    }
}
