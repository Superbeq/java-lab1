import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        // Task 1

//        int additionSum;
//        int subtractionsum;
//        int multiplySum;
//        int divisonSum;
//        int modSum;
//
//
//        System.out.println("Please enter the first number: ");
//        int firstNumber = scan.nextInt();;
//
//
//        System.out.println("Please enter the second number:");
//        int secondNumber = scan.nextInt();
//
//
//        additionSum = firstNumber + secondNumber;
//
//        subtractionsum = firstNumber - secondNumber;
//
//        multiplySum = firstNumber * secondNumber;
//
//        divisonSum = firstNumber / secondNumber;
//
//        modSum = firstNumber % secondNumber;
//
//        System.out.println("Addition sum: " + additionSum + "  Subtraction sum: " + subtractionsum + "  Multiply Sum: " + multiplySum + "  Divison sum: " + divisonSum + "  Mod sum: " + modSum);


        // Task 2

//        System.out.println("Please enter a number (The program will print the multiplication table up to 10)");
//        int numberTable = scan.nextInt();
//
//        int product = 0;
//        for (int i = 1; i <=10; i++) {
//
//            product = i * numberTable;
//            System.out.println( i+ " x " + numberTable + " = " + product);
//
//        }



        // Task 3


//        System.out.println("Please enter the radius (To calculate the area and the perimeter)");
//        double radius = scan.nextDouble();
//
//
//        double perimeter = 2 * Math.PI * radius;
//
//        double area = Math.PI * radius * radius;
//
//
//
//        System.out.println("The Perimeter is = " + perimeter);
//
//
//        System.out.println("The Area is = " + area);


        // Task 4

//        System.out.println("Please enter the count of numbers you want to average out: ");
//        double count = scan.nextDouble();
//
//        double sum = 0;
//
//
//        for (int i = 0; i < count ; i++) {
//            System.out.println("Please enter integers: ");
//            double integer = scan.nextDouble();
//            sum += integer;
//        }
//
//        double average = sum / count;
//
//        System.out.println("The Average is: " + average);
//



        // Task 5


//        System.out.println("PLease enter the first number: ");
//
//        int num1 = scan.nextInt();
//
//        System.out.println("PLease enter the second number: ");
//
//        int num2 = scan.nextInt();
//
//
//        System.out.println("PLease enter the third number:  ");
//
//        int num3 = scan.nextInt();
//
//
//
//        boolean result = (num1 + num2) == num3;
//
//        System.out.println("The result is: " + result);
//


        // Task 6


//
//               System.out.println("Please enter a word");
//      String originalString = scan.nextLine();
//
//      String reversedString = "";
//
//      for(int i = originalString.length() - 1; i>=0; i--){
//
//          reversedString += originalString.charAt(i);
//
//      }
//
//        System.out.println("The original Text: " + originalString + " The reversed Text: " + reversedString);
//


        // Task 7

//        System.out.println("Please enter a number (To determine if it's even or odd)");
//        int determine = scan.nextInt();
//
//
//        if(determine % 2 == 0) {
//            System.out.println("The number " + determine + " is even");
//        } else {
//            System.out.println("The number " + determine + " is odd");
//        }



        // Task 8
//
//        System.out.println("Please enter the temperature in Centigrade (To convert it to Fahrenheit)");
//        float convert = scan.nextFloat();
//        float fahrenheit = 0;
//
//
//        fahrenheit = (convert * 9/5) +32;
//
//
//        System.out.println(convert + " Converted to Fahrenheit " + fahrenheit );
//

        // Task 9

//        System.out.println("Please enter a sentence");
//        String sentence = scan.nextLine();
//
//        System.out.println("Please enter a number to see the corresponding letter in the sentence");
//        int sentenceIndex = scan.nextInt();
//
//
//              char index =  sentence.charAt(sentenceIndex);
//
//        System.out.println("The letter is: " + index);



        // Task 10  Check again later on

//
//        System.out.println("PLease enter the height (To calculate the area and perimeter)");
//        double height = scan.nextDouble();
//
//
//        System.out.println("PLease enter the width (To calculate the area and perimeter)");
//        double width = scan.nextDouble();
//
//
//
//        double area = height * width;
//
//
//        double perimeter = 2 * (height + width);
//
//
//        System.out.println("The area is: " + area);
//
//        System.out.println("The perimeter is:" + perimeter);



        // Task 11

//        System.out.println("Please enter the first number (Comparison between two numbers)");
//        int num1 = scan.nextInt();
//
//        System.out.println("Please enter the second number (Comparison between two numbers)");
//        int num2 = scan.nextInt();
//
//
//        if (num1 != num2){
//            System.out.println(num1 + "!=" + num2);
//
//        }
//        if (num1 >= num2){
//            System.out.println(num1 + ">=" + num2);
//
//        }
//        if (num1 > num2){
//            System.out.println(num1 + ">" + num2);
//
//        }
//        if (num1 <= num2){
//            System.out.println(num1 + "<=" + num2);
//
//        }
//        if (num1 < num2){
//            System.out.println(num1 + "<" + num2);
//
//        }
//        if (num1 == num2){
//            System.out.println(num1 + "==" + num2);
//
//        }



        // Task 12

//
//        System.out.println("Please enter number of seconds :");
//        int totalSeconds = scan.nextInt();
//
//
//        int hours = totalSeconds / 3600;
//        int minutes = (totalSeconds % 3600) / 60;
//        int seconds = totalSeconds % 60;
//
//        System.out.printf("The result is: "+hours+":"+minutes+":"+seconds);


        // Task 13

//
//        System.out.println("Please enter first number");
//        int number1 = scan.nextInt();
//
//        System.out.println("Please enter second number");
//        int number2 = scan.nextInt();
//
//        System.out.println("Please enter third number");
//        int number3 = scan.nextInt();
//
//        System.out.println("Please enter fourth number");
//        int number4 = scan.nextInt();
//
//
//        if(number1 == number2 && number2 == number3 && number3 == number4){
//            System.out.println("They are Equal!!!");
//        } else {
//            System.out.println("They are not Equal!!!");
//        }



        // Task 14


//        System.out.println("Please enter an integer number");
//        int integer = scan.nextInt();
//
//        if(integer > 0){
//            System.out.println("The number  " + integer + " Is positive");
//        } else if (integer < 0) {
//            System.out.println("The number  " + integer + " Is negative");
//        } else {
//            System.out.println("The number is zero");
//        }


        // Task 15

//
//        int positiveCount = 0;
//        int negativeCount = 0;
//        int zeroCount = 0;
//        String continueInput;
//
//
//        int number;
//        do {
//            System.out.print("Enter a number: (Enter -1 to Quit)");
//            number = scan.nextInt();
//
//
//            if (number == -1) {
//                System.out.println("You quit the program successfully");
//                break;
//            } else if (number < 0) {
//                negativeCount++;
//            } else if (number > 0) {
//                positiveCount++;
//            } else {
//                zeroCount++;
//            }
//
//
//        } while (number != -1);
//
//
//        System.out.println("Positive numbers: " + positiveCount);
//        System.out.println("Negative numbers: " + negativeCount);
//        System.out.println("Zeros: " + zeroCount);


        // Task 16


//        System.out.println("Please enter an integer number");
//        int integer = scan.nextInt();
//
//
//        int reversedInteger = 0;
//
//        while(integer != 0 ){
//            int lastDigit = integer % 10;
//            reversedInteger = reversedInteger * 10 + lastDigit;
//            integer /= 10;
//        }
//
//        System.out.println("The reversed integer " + reversedInteger);
//

        // Task 17


//
//
//        int largest = 0, smallest = 0;
//
//        boolean firstInput = true;
//
//        while (true) {
//            System.out.print("Enter a number (or 0 to quit): ");
//            int number = scan.nextInt();
//
//            if (number == 0) {
//                break;
//            }
//
//            if (firstInput) {
//                largest = number;
//                smallest = number;
//                firstInput = false;
//            } else {
//                if (number > largest) {
//                    largest = number;
//                } else if (number < smallest) {
//                    smallest = number;
//                }
//            }
//        }
//
//        if (firstInput) {
//            System.out.println("No numbers were entered.");
//        } else {
//            System.out.println("The largest number is: " + largest);
//            System.out.println("The smallest number is: " + smallest);
//        }
//



        // Task 18

//        System.out.println("Enter String: ");
//        String inputString = scan.nextLine();
//
//        int count = 0;
//        for (int i = 0; i < inputString.length(); i++) {
//            if (inputString.charAt(i) == 'a') {
//                count++;
//            }
//        }
//
//        System.out.println("Number of a's: " + count);


    }
}