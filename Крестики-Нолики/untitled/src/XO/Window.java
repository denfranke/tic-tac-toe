package XO;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {
    //private JTextField textField;
    private final ImageIcon imageX = new ImageIcon("src/X.png");
    private final ImageIcon imageO = new ImageIcon("src/O.png");
    private final ImageIcon imageE = new ImageIcon("src/Emp.png");
    private int cnt = 0;
    private int[][] map = new int[4][4];
    public static Random rnd = new Random();

    public Window() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 200, 600, 600);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = 0;
            }
        }
        JPanel panel = new JPanel(new GridLayout(3, 3));
        JButton[][] buttons = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setIcon(imageE);
                JButton copy = buttons[i][j];
                int finalI = i;
                int finalJ = j;
                copy.addActionListener(action -> {
                    copy.setIcon(imageX);
                    copy.setEnabled(false);
                    copy.setDisabledIcon(imageX);
                    cnt++;
                    map[finalI][finalJ] = 1;
                    if (checkWin(map, 1,3) == true) {
                        JFrame alert = new JFrame("Человек победил");
                        afterGame(alert);
                    } else if (cnt == 9) {
                        JFrame alert = new JFrame("Ничья");
                        afterGame(alert);
                    } else
                        movePC(buttons);

                    //printMap();
                });
                panel.add(buttons[i][j]);
            }
        }

        add(panel);
        setVisible(true);
    }

    private void afterGame(JFrame alert) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        alert.setBounds(200, 200, 300, 100);
        JPanel alertpnl = new JPanel(new FlowLayout());
        JButton newGame = new JButton("New game");
        newGame.addActionListener(a -> {
            this.dispose();
            new Window();
            alert.dispose();
        });
        JButton close = new JButton("Close");
        close.addActionListener(a1 -> {
            this.dispose();
            alert.dispose();
        });
        alertpnl.add(newGame);
        alertpnl.add(close);
        alert.add(alertpnl);
        alert.setVisible(true);
        alert.setResizable(false);
    }

    private boolean checkWin(int[][] map, int symb,int a) {
        /*System.out.println("//////////////////////");
        if(a==0)
            System.out.println("может ли победить человек");
        if(a==1)
            System.out.println("можно ли победить боту");
        if(a==2)
            System.out.println("Бот победил?");
        if(a==3)
            System.out.println("Человек победил?");
    printMap();
        System.out.println("//////////////////////");*/
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return
                true;
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return
                true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return
                true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return
                true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return
                true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return
                true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return
                true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return
                true;
        return false;
    }

    private boolean isCellValid(int x, int y) {
        if (x < 0 || x >= 3 || y < 0 || y >= 3) return false;
        if (map[x][y] == 0) return true;
        return false;
    }

    private void movePC(JButton[][] buttons) {
        int x=3, y=3;
        boolean f1 = false;

        //случайный ход
        do {
            x = rnd.nextInt(3);
            y = rnd.nextInt(3);
        } while (!isCellValid(x, y));
        //System.out.println(x+" "+y);

        // если можно победить
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = 2;

                    if (checkWin(map, 2,1)) {
                        x = i;
                        y = j;
                        //System.out.println("Yes  "+x+" "+y);
                        f1 = true;
                    }
                    map[i][j] = 0;
                }
            }
        }
        //System.out.println(x+" "+y);

        // если человек может победить
        if (f1== false) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (isCellValid(i, j)) {
                        map[i][j] = 1;

                        if (checkWin(map, 1,10)) {
                            x = i;
                            y = j;
                            f1 = true;
                        }
                        map[i][j]=0;
                    }
                }
            }
        }
        System.out.println("Компьютер походил в точку " + (x ) + " " + (y ));
        map[x][y] = 2;
        if(x!=3 && y!=3) {
            buttons[x][y].setIcon(imageO);
            buttons[x][y].setEnabled(false);
            buttons[x][y].setDisabledIcon(imageO);
        }
            cnt++;
            if (checkWin(map, 2,2) == true) {
                JFrame alert = new JFrame("Бот победил");
                afterGame(alert);
            }

        //printMap();
        //System.out.println("//////////////////////");

    }

    private void printMap() {
        System.out.print("_ ");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print((i) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Window();
    }

}