public class Main {

    public static void main(String[] args) {
        double[] numbers = new double[15];


        numbers[0] = -5.5;


        numbers[1] = 3.7;


        numbers[2] = -2.1;


        numbers[3] = 4.9;


        numbers[4] = -1.2;


        numbers[5] = 6.3;


        numbers[6] = -8.4;


        numbers[7] = 2.8;


        numbers[8] = -9.1;


        numbers[9] = 7.6;


        numbers[10] = -3.9;


        numbers[11] = 5.2;


        numbers[12] = -0.8;


        numbers[13] = 1.4;


        numbers[14] = -6.7;
        double sum = 0;
        int count = 0;
        boolean foundNegative = false;
        for (double number : numbers) {
            if (foundNegative) {
                if (number > 0) {
                    sum += number;
                    count++;
                }

            }else
                    if (number < 0) {
                        foundNegative = true;
                    }
                }
                double average = sum / count;
                System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа: " + average);
            }

        }

