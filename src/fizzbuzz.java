public class fizzbuzz {
    public static void main(String[] args){
        System.out.println(FizzBuzz(15));
        System.out.println(FizzBuzz(21));
        System.out.println(FizzBuzz(3));
        System.out.println(FizzBuzz(5));
        System.out.println(FizzBuzz(4));


    }

    public static String FizzBuzz(int i) {
        String result = "";
        if (i % 3 == 0) {
            result = "Fizz";
        }
        if (i % 5 == 0) {
            result = result + "Buzz";
        }
        if (result == "") {
            result =  String.valueOf(i);
        }
        return result;
    }
}
