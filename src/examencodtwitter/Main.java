/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencodtwitter;

import javax.swing.JOptionPane;
import twitter4j.TwitterException;

/**
 *
 * @author oquintansocampo
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws twitter4j.TwitterException
     */
    public static void main(String[] args) throws TwitterException {
        // TODO code application logic here
        
        MetodosTwitter twit = new MetodosTwitter();
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("opciones: \n1 --> TimeLine\n2 --> Buscar\n3 --> Tweettear\n4 --> Exit"));
            switch (op) {
                case 1:
                    twit.timeLine();
                    break;
                case 2:
                    twit.buscar();
                    break;
                case 3:
                    twit.tweet();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.exit(0);
            }
        } while (op != 0 && op != 4);
    }

}
