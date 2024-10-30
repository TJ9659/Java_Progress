
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        String longestName = "";
        int total = 0;

        ArrayList<String> names = new ArrayList<>(); 
        ArrayList<Integer> birthYears = new ArrayList<>(); 

        while(true){
            String str = scanner.nextLine();

            if(str.equals("")){
                break;
            }


            String[] pieces = str.split(",");

            String name = pieces[0];
            int birthYear = Integer.valueOf(pieces[1]);
            
            names.add(name);
            birthYears.add(birthYear);

        }

        for(int year : birthYears){
            sum += year;
        }

        System.out.println(birthYears.size());

        for(String name: names){
            if(name.length() > longestName.length()){
                longestName = name;
            }
        }

        System.out.println("Longest Name: " + longestName);

        System.out.println(sum);


        System.out.println("Average of the birth years: " + (1.0 * sum/(birthYears.size())));

    }
}


/*

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        String longestName = "";
        int total = 0;

        

        while(true){
            String str = scanner.nextLine();

            if(str.equals("")){
                break;
            }


            total += 1;

            String[] pieces = str.split(",");

            String name = pieces[0];
            int birthYear = Integer.valueOf(pieces[1]);
            sum += birthYear;

            if(name.length() > longestName.length()){
                longestName = name;
            }

        }

        System.out.println("Longest Name: " + longestName);


        System.out.println("Average of the birth years: " + (1.0 * sum/total));

    }
}

 */