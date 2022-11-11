import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
        static void getAnswer(){
            // Take the strings input word1 and word2 to be compared
            Scanner s = new Scanner(System.in);

            System.out.print("Input first string: ");
            String word1 = s.nextLine();

            System.out.print("Input second string: ");
            String word2 = s.nextLine();

            // calculate the cost matrix
            int[][] cost = EditDistance.costArray(word1, word2);

            EditDistance.printWays(word1, word2, cost);
        }
        static class EditDistance {
            static ArrayList<ArrayList<String>> arr = new ArrayList<>();

            // Function to print the steps
            static void printAllChanges(String word1, String word2, ArrayList<String> changes, int[][] cost) {

                int i = word1.length();
                int j = word2.length();

                // Iterate till end
                while (true) {
                    if (i == 0 || j == 0) {
                        // Add this list to our List of lists.
                        arr.add(changes);
                        break;
                    }

                    // If same
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        i--;
                        j--;
                    } else {
                        boolean if1 = false, if2 = false;

                        // Replace
                        if (cost[i][j] == cost[i - 1][j - 1] + 1) {
                            changes.add("Change " + word1.charAt(i - 1) + " to " + word2.charAt(j - 1));
                            i--;
                            j--;

                            // note whether this 'if' was true.
                            if1 = true;
                        }

                        // Delete
                        if (cost[i][j] == cost[i - 1][j] + 1) {
                            if (!if1) {
                                changes.add("Delete " + word1.charAt(i - 1));
                                i--;
                            } else {
                                // If the previous method was true, create a new list as a copy of previous.
                                ArrayList<String> changeWord2 = new ArrayList<>(changes);

                                // Remove last operation
                                changeWord2.remove(changes.size() - 1);

                                // Add this new operation
                                changeWord2.add("Delete " + word1.charAt(i));

                                // initiate new instance of this function with remaining substrings
                                printAllChanges(word1.substring(0, i),
                                        word2.substring(0, j + 1), changeWord2, cost);
                            }

                            if2 = true;
                        }

                        // Add character step
                        if (cost[i][j] == cost[i][j - 1] + 1) {
                            if (!if1 && !if2) {
                                changes.add("Add " + word2.charAt(j - 1));
                                j--;
                            } else {

                                // Add steps
                                ArrayList<String> changeWord = new ArrayList<>(changes);
                                changeWord.remove(changes.size() - 1);
                                changeWord.add("Add " + word2.charAt(j));

                                // Recursively call for the next steps
                                printAllChanges(word1.substring(0, i + 1), word2.substring(0, j), changeWord, cost);
                            }
                        }
                    }
                }
            }

            static void printWays(String word1, String word2, int[][] cost) {

                // Print all the ways
                printAllChanges(word1, word2, new ArrayList<>(), cost);

                int i = 1;

                for (ArrayList<String> ar : arr) {
                    System.out.println("\nMethod " + i++ + " :");
                    for (String s : ar) {
                        System.out.println(s);
                    }
                }
            }

            // Compute the cost matrix
            static int[][] costArray(String word1, String word2) {
                int m = word1.length();
                int n = word2.length();

                int[][] cost = new int[m + 1][n + 1];
                // initialize by the maximum edits possible
                for (int i = 0; i <= m; i++)
                    cost[i][0] = i;
                for (int i = 1; i <= n; i++)
                    cost[0][i] = i;

                for (int i = 1; i <= m; i++) {
                    for (int j = 1; j <= n; j++) {
                        // if the characters are same no changes required
                        if (word1.charAt(i - 1) == word2.charAt(j - 1))
                            cost[i][j] = cost[i - 1][j - 1];

                        else {
                            int a = cost[i - 1][j - 1]; // Delete operation
                            int b = cost[i][j - 1]; // Insert operation
                            int c = cost[i - 1][j]; // Replace operation

                            // Minimum of three operations possible
                            cost[i][j] = a < b ? (Math.min(a, c)) : (Math.min(b, c));
                            cost[i][j]++;
                        }
                    }
                }

                return cost;
            }
        }
}