import java.util.Scanner;
import java.StringUtils;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Roman Numeral");

        String numeral = scanner.nextLine();
        int dec = RN2DEC(numeral);
        if(dec == 0){
            System.out.println("error");
        }
    }

    public void RN2DEC(String input){
        int step = 1;
        int result = 0;
        for(int pointer = 0; pointer <= input.length(); pointer = pointer + step){ // Run through input
            step = 1;
            char rm = input.charAt(pointer);

            if(rm == "M"){                                                     // RM "M" (1000)
                result = result + 1000;                                        // Add 1000 to result
            }else if(rm == "D"){                                               // RM "D" (500)
                result = result + 500;                                         // Add 500 to result
            }else if(rm == "C"){                                               // RM "C" (100)
                if(input.charAt(pointer + 1) == )
            }
        }

    }
}