/**
 * Created by bepe14 on 2016-09-09.
 */
public class tictactoe {
    char[] spelplan = new char[9];
    public static void main(String[] args) {

        char[] spelplan = new char[9];

        for (int l = 0; l < spelplan.length; l++) {
            spelplan[l] = ' ';
        }
    }
        public void printboard(){

        System.out.println("---------");

        for (int j = 0; j < 3; j++) {
            System.out.print("|");
            for (int i = 0; i < 3; i++) {
                System.out.print(spelplan[j + i]);

            }


        }
    }

}

