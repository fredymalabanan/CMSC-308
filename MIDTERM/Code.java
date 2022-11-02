import java.util.*;

public class CMSC308_MALABANAN {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Boolean flag = true;

        while (flag == true) {
            System.out.print("Number of test cases: ");
            int testCaseNum = scan.nextInt();
            List<String> testCaseResults = new ArrayList<String>();

            if (testCaseNum > 0) {
                for (int i = 0; i < testCaseNum; i++) {
                    System.out.print("Number of Holidays: ");
                    int holidaysNum = scan.nextInt();
                    scan= new Scanner(System.in);
                    System.out.print("Day of Holidays: ");
                    String input = scan.nextLine();

                    String[] inputs = input.split("\\s+");

                    if (holidaysNum == inputs.length) {
                        testCaseResults.add(processHolidays(inputs));
                    } else {
                        System.out.println();
                        System.out.println("Error input");
                        testCaseResults.add("Invalid case");
                    }
                }

                System.out.println();
                for (int i = 0; i < testCaseResults.size(); i++) {
                    System.out.println(
                            String.format("Number of holidays for Test Case %s: %s ", i + 1, testCaseResults.get(i)));
                }
                flag = false;
            } else {
                System.out.println("Invalid number of test cases");
            }
        }
        scan.close();
    }

    private static String processHolidays(String[] inputs) {
        HashSet<Integer> holidays = new HashSet<Integer>(Arrays.asList(6, 7, 13, 14, 20, 21, 27, 28));
        int[] intInputs = new int[inputs.length];
        try {
            for (int i = 0; i < intInputs.length; i++) {
                intInputs[i] = Integer.parseInt(inputs[i]);
            }

        } catch (Exception e) {
            return "Invalid input on this test case";
        }
        for (int input : intInputs) {
            holidays.add(input);
        }
        List<Integer> sortedHolidays = new ArrayList<Integer>(holidays);
        Collections.sort(sortedHolidays);

        String result = String.format("%s %s", sortedHolidays.size(), sortedHolidays);
        return result;
    }
}
