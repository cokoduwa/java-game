package game;
import javax.swing.*;
public class JavaGame {
    public static void main(String[] args) {

        //Introduction to the game in a message dialog box
        JOptionPane.showMessageDialog(null, "Welcome to the Wonderful World of Java!",
                "Welcome Message", JOptionPane.INFORMATION_MESSAGE);

        //Variables
        int mainMenu;
        String name;


        //Prompts user to enter their name
        name = JOptionPane.showInputDialog("Please enter your name.");

        //Prompts user to select an option from the menu
        //Dialog box will show
        JOptionPane.showMessageDialog(null, "Hello " + name + "!"
                        + " Please select an option from the following main menu: ",
                "Menu", JOptionPane.INFORMATION_MESSAGE);
        do {
            //Displays Main Menu and allows user to enter their selection
            String str;
            str = JOptionPane.showInputDialog(null, "Please make your selection. \n" +
                    "\t1. See Rules\n" +
                    "\t2. Play Game\n" +
                    "\t3. Exit", "Main Menu", JOptionPane.INFORMATION_MESSAGE);
            mainMenu = Integer.parseInt(str);

            if (mainMenu < 1 || mainMenu > 3) {
                JOptionPane.showMessageDialog(null, "That is an invalid option." +
                                " Please select options 1-3 from the Main Menu.",
                        "Invalid Options", JOptionPane.INFORMATION_MESSAGE);
            }

            //The rules are displayed in dialog box
            if (mainMenu == 1) {
                JOptionPane.showMessageDialog(null,
                        "There are 10 questions in total. \n" +
                                "The player has to answer the first question before moving on to the next. \n" +
                                "For each correct answer you will receive 10 points. \n" +
                                "For each incorrect answer you will receive 0 points. \n" +
                                "Your total points will display as you answer each question and in the end.",
                        "Rules", JOptionPane.INFORMATION_MESSAGE);
            }

            //The user will play the game and answer the questions
            else if (mainMenu == 2) {

                JOptionPane.showMessageDialog(null, "Let's start the game " + name + "!");

                //Variables for point amount for each answer.
                int point1;
                int point2;
                int point3;
                int point4;
                int point5;
                int point6;
                int point7;
                int point8;
                int point9;
                int point10;

                //Question #1
                //Declaring the variables as an object.
                Object[] answer1 = {" ", "A", "B", "C", "D"};
                //Displays the question in dialog box and allows user to input.
                Object question1 = JOptionPane.showInputDialog(null, "\t1. What is the double slash // used for? \n" +
                                "\t\tA. The beginning of comment. \n" +
                                "\t\tB. The end of a statement. \n" +
                                "\t\tC. Encloses statements. \n" +
                                "\t\tD. Used for a method header. \n", "Question 1", JOptionPane.INFORMATION_MESSAGE,
                        null, answer1, answer1[0]);

                //If statement for the correct answer.
                if (question1 == answer1[1]) {
                    point1 = 10;
                    JOptionPane.showMessageDialog(null, "Correct. Great Job! " + name + " You earned "
                            + point1 + " points. Your current total is " + (point1) + " points.", "Answer", JOptionPane.INFORMATION_MESSAGE);
                }
                //Else statement for the incorrect answer.
                else {
                    point1 = 0;
                    JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is A.\n You earned "
                            + point1 + " points. Your current total is " + (point1) + " points.", "Answer", JOptionPane.INFORMATION_MESSAGE);
                }

                //Question #2
                //Declaring the variables as an object.
                Object[] answer2 = {" ", "A", "B", "C", "D"};
                //Displays the question in dialog box and allows user to input.
                Object question2 = JOptionPane.showInputDialog(null, "\t2. How do you end source code files for Java?\n" +
                        "\t\ta. .py\n" +
                        "\t\tb. .html\n" +
                        "\t\tc. .java\n" +
                        "\t\td. .css", "Question 2", JOptionPane.INFORMATION_MESSAGE, null, answer2, answer2[0]);

                //If statement for the correct answer.
                if (question2 == answer2[3]) {
                    point2 = 10;
                    JOptionPane.showMessageDialog(null, "Correct. Great Job! " + name + " You earned "
                                    + point2 + " points. Your current total is " + (point1 + point2) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }
                //Else statement for the incorrect answer.
                else {
                    point2 = 0;
                    JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is C.\n You earned "
                                    + point2 + " points. Your current total is " + (point1 + point2) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }

                //Question #3
                //Declaring the variables as an object.
                Object[] answer3 = {" ", "A", "B", "C", "D"};
                //Displays the question in dialog box and allows user to input.
                Object question3 = JOptionPane.showInputDialog(null, "\t3. 20 is an example of what type of literal?\n" +
                        "\t\ta. String literal\n" +
                        "\t\tb. Integer literal\n" +
                        "\t\tc. Number literal\n" +
                        "\t\td. Sign literal", "Question 3", JOptionPane.INFORMATION_MESSAGE, null, answer3, answer3[0]);

                //If statement for the correct answer.
                if (question3 == answer3[2]) {
                    point3 = 10;
                    JOptionPane.showMessageDialog(null, "Correct. Great Job! " + name + " You earned "
                            + point3 + " points. Your current total is " + (point1 + point2 + point3) + " points.", "Answer", JOptionPane.INFORMATION_MESSAGE);
                }
                //Else statement for the incorrect answer.
                else {
                    point3 = 0;
                    JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is B.\n You earned "
                            + point3 + " points. Your current total is " + (point1 + point2 + point3) + " points.", "Answer", JOptionPane.INFORMATION_MESSAGE);
                }

                //Question 4
                //Declaring the variables as an object.
                Object[] answer4 = {" ", "A", "B", "C", "D"};
                //Displays the question in dialog box and allows user to input.
                Object question4 = JOptionPane.showInputDialog(null, "\t4. This type of expression has " +
                        "a value of either true or false. \n" +
                        "\t\ta. decision expression\n" +
                        "\t\tb. binary expression\n" +
                        "\t\tc. boolean expression\n" +
                        "\t\td. unconditional expression", "Question 4", JOptionPane.INFORMATION_MESSAGE, null, answer4, answer4[0]);

                //If statement for the correct answer.
                if (question4 == answer4[3]) {
                    point4 = 10;
                    JOptionPane.showMessageDialog(null, "Correct. Great Job! " + name + " You earned "
                                    + point4 + " points. Your total is " + (point1 + point2 + point3 + point4) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }
                //Else statement for the incorrect answer
                else {
                    point4 = 0;
                    JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is C.\n You earned "
                                    + point4 + " points. Your total is " + (point1 + point2 + point3 + point4) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }

                //Question 5
                //Declaring the variables as an object.
                Object[] answer5 = {" ", "A", "B", "C", "D"};
                //Displays the question in dialog box and allows user to input.
                Object question5 = JOptionPane.showInputDialog(null, "\t5. This is an if statement that " +
                        "appears inside another if statement. \n" +
                        "\t\ta. tiered if statement\n" +
                        "\t\tb. dislodged if statement\n" +
                        "\t\tc. structured if statement\n" +
                        "\t\td. nested if statement", "Question 5", JOptionPane.INFORMATION_MESSAGE, null, answer5, answer5[0]);

                //If statement for the correct answer.
                if (question5 == answer5[4]) {
                    point5 = 10;
                    JOptionPane.showMessageDialog(null, "Correct. Great Job! " + name + " You earned "
                                    + point5 + " points. Your current total is " + (point1 + point2 + point3 + point4 + point5) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }
                //Else state for the incorrect answer.
                else {
                    point5 = 0;
                    JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is D.\n You earned "
                                    + point5 + " points. Your current total is " + (point1 + point2 + point3 + point4 + point5) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }

                //Question 6
                //Declaring the variables as an object.
                Object[] answer6 = {" ", "A", "B", "C", "D"};
                //Displays the question in dialog box and allows user to input.
                Object question6 = JOptionPane.showInputDialog(null, "\t6. This type of loop has no way " +
                        "of ending and repeats until the program is interrupted. \n" +
                        "\t\ta. timeless\n" +
                        "\t\tb. infinite\n" +
                        "\t\tc. indeterminate\n" +
                        "\t\td. interminable", "Question 6", JOptionPane.INFORMATION_MESSAGE, null, answer6, answer6[0]);

                //If statement for the correct answer.
                if (question6 == answer6[2]) {
                    point6 = 10;
                    JOptionPane.showMessageDialog(null, "Correct. Great Job! " + name + " You earned "
                                    + point6 + " points. Your current total is " + (point1 + point2 + point3 + point4 + point5 + point6) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }
                //Else state for the incorrect answer.
                else {
                    point6 = 0;
                    JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is D.\n You earned "
                                    + point6 + " points. Your current total is " + (point1 + point2 + point3 + point4 + point5 + point6) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }

                //Question 7
                //Declaring the variables as an object.
                Object[] answer7 = {" ", "A", "B", "C", "D"};
                //Displays the question in dialog box and allows user to input.
                Object question7 = JOptionPane.showInputDialog(null, "\t7. This class allows you to " +
                        "read a line from a file. \n" +
                        "\t\ta. Scanner\n" +
                        "\t\tb. FileWriter\n" +
                        "\t\tc. FileReader\n" +
                        "\t\td. InputFile", "Question 7", JOptionPane.INFORMATION_MESSAGE, null, answer7, answer7[0]);

                //If statement for the correct answer.
                if (question7 == answer7[3]) {
                    point7 = 10;
                    JOptionPane.showMessageDialog(null, "Correct. Great Job! " + name + " You earned "
                                    + point7 + " points. Your current total is " + (point1 + point2 + point3 + point4 +
                                    point5 + point6 + point7) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }
                //Else statement for the incorrect answer.
                else {
                    point7 = 0;
                    JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is D.\n You earned "
                                    + point7 + " points. Your current total is " + (point1 + point2 + point3 + point4 +
                                    point5 + point6 + point7) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }

                //Question 8
                //Declaring the variables as an object.
                Object[] answer8 = {" ", "A", "B", "C", "D"};
                //Displays the question in a dialog box and allows user to input.
                Object question8 = JOptionPane.showInputDialog(null, "\t8. This type of method does not " +
                        "return a value. \n" +
                        "\t\ta. Null \n" +
                        "\t\tb. Void \n" +
                        "\t\tc. Empty \n" +
                        "\t\td. Anonymous", "Question 8", JOptionPane.INFORMATION_MESSAGE, null, answer8, answer8[0]);

                //If statement for the correct answer.
                if (question8 == answer8[2]) {
                    point8 = 10;
                    JOptionPane.showMessageDialog(null, "Correct. Great Job! " + name + " You earned "
                                    + point8 + " points. Your current total is " + (point1 + point2 + point3 + point4 +
                                    point5 + point6 + point7 + point8) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }

                //Else statement for the incorrect answer.
                else {
                    point8 = 0;
                    JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is B.\n You earned "
                                    + point8 + " points. Your current total is " + (point1 + point2 + point3 + point4 +
                                    point5 + point6 + point7 + point8) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }

                //Question 9
                //Declaring the variables as an object.
                Object[] answer9 = {" ", "A", "B", "C", "D"};
                //Displays the question in a dialog box and allows user to input.
                Object question9 = JOptionPane.showInputDialog(null, "\t9. This appears at the beginning of a" +
                        " method definition.\n" +
                        "\t\ta. Semicolon\n" +
                        "\t\tb. Parentheses\n" +
                        "\t\tc. Body\n" +
                        "\t\td. Header", "Question 9", JOptionPane.INFORMATION_MESSAGE, null, answer9, answer9[0]);

                //If statement for the correct answer.
                if (question9 == answer9[4]) {
                    point9 = 10;
                    JOptionPane.showMessageDialog(null, "Correct. Great Job! " + name + " You earned "
                                    + point9 + " points. Your current total is " + (point1 + point2 + point3 + point4 +
                                    point5 + point6 + point7 + point8 + point9) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }

                //Else statement for the incorrect answer.
                else {
                    point9 = 0;
                    JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is D.\n You earned "
                                    + point9 + " points. Your current total is " + (point1 + point2 + point3 + point4 +
                                    point5 + point6 + point7 + point8 + point9) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }

                //Question 10
                //Declaring the variables as an object.
                Object[] answer10 = {" ", "A", "B", "C", "D"};
                //Displays the question in a dialog box and allows user to input.
                Object question10 = JOptionPane.showInputDialog(null, "\t10. In an array declaration, " +
                        "this indicates the number of elements that the array will have.\n" +
                        "\t\ta. Subscript\n" +
                        "\t\tb. Size declarator\n" +
                        "\t\tc. Element sun\n" +
                        "\t\td. Reference variable", "Question 10", JOptionPane.INFORMATION_MESSAGE, null, answer10, answer10[0]);

                //If statement for the correct answer.
                if (question10 == answer10[2]) {
                    point10 = 10;
                    JOptionPane.showMessageDialog(null, "Correct. Great Job! " + name + " You earned "
                                    + point10 + " points. Your current total is " + (point1 + point2 + point3 + point4 +
                                    point5 + point6 + point7 + point8 + point9 +point10) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }

                //Else statement for the incorrect answer.
                else {
                    point10 = 0;
                    JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is B.\n You earned "
                                    + point10 + " points. Your current total is " + (point1 + point2 + point3 + point4 +
                                    point5 + point6 + point7 + point8 + point9 + point10) + " points.",
                            "Answer", JOptionPane.INFORMATION_MESSAGE);
                }

                //Variable and formula for total point accumulator.
                int totalPoints = point1 + point2 + point3 + point4 + point5 + point6 + point7 + point8 + point9 + point10;

                //Displays the total amount of points accumulated in the game.
                JOptionPane.showMessageDialog(null, "You earned a total of " + totalPoints +
                                " points! Thanks for playing!",
                        "Total Points", JOptionPane.INFORMATION_MESSAGE);

            }

            //Exit Program
            else if (mainMenu == 3) {
                JOptionPane.showMessageDialog(null, "Thank you " + name
                                + " for playing. Goodbye!",
                        "Exit", JOptionPane.INFORMATION_MESSAGE);
            }


        }
        while (mainMenu != 3);

    }
}
