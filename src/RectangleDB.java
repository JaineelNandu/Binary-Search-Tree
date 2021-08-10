/*
 * In this project we implement a Binary Search Tree,
 * where each node is a rectangle object with a name
 * and its dimensions.
 * 
 * The goal of this project is to learn to manipulate
 * the tree by inserting, removing, finding relevant nodes.
 */

/*
 * // On my honor:
 * //
 * // - I have not used source code obtained from another student,
 * // or any other unauthorized source, either modified or
 * // unmodified.
 * //
 * // - All source code and documentation used in my program is
 * // either my original work, or was derived by me from the
 * // source code published in the textbook for this course.
 * //
 * // - I have not discussed coding details about this project with
 * // anyone other than my partner (in the case of a joint
 * // submission), instructor, ACM/UPE tutors or the TAs assigned
 * // to this course. I understand that I may discuss the concepts
 * // of this program with other students, and that another student
 * // may help me debug my program so long as neither of us writes
 * // anything during the discussion or modifies any computer file
 * // during the discussion. I have violated neither the spirit nor
 * // letter of this restriction.
 */

/**
 * The class containing the main method.
 *
 * @author Jaineel Nandu
 * @version 20201009
 */
public class RectangleDB {
    /**
     * Main function
     * 
     * @param args
     *            Command line parameters
     */
    public static void main(String[] args) {
        // This is the main file for the program.
        if (args.length != 1) {
            System.out.println("Usage: java RectangleDB" + "<command-file>");
        }
        else {
            String commandFileName = args[0];
            FileReader readFile = new FileReader();
            readFile.beginParsing(commandFileName);
        }
    }
}
