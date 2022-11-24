import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Group {
    {
//    static void f() {
//        Random rand = new Random();
//        Scanner sc = new Scanner(System.in);
//        int tr = 1;
//        while (tr == 1) {
//            int a = rand.nextInt(10);
//            //System.out.println(a);
//            int k = 0;
//            while (k < 3) {
//                int b = sc.nextInt();
//                if (b > a)
//                    System.out.printf("< осталось: %d", 3 - k);
//                else if (b < a)
//                    System.out.printf("> осталось: %d", 3 - k);
//                else {
//                    System.out.println("=");
//                    System.out.println("Повторить?");
//                    tr = sc.nextInt();
//                    break;
//                }
//                k++;
//                if (k == 3) {
//                    System.out.println("Повторить?");
//                    tr = sc.nextInt();
//                    break;
//                }
//            }
//        }
//    }
//
//    static void f1() {
//        String[] words = {"apple", "orange",
//                "lemon", "banana",
//                "apricot", "avocado",
//                "broccoli", "carrot",
//                "cherry", "garlic",
//                "grape", "melon",
//                "leak", "kiwi",
//                "mango", "mushroom",
//                "nut", "olive",
//                "pea", "peanut",
//                "pear", "pepper",
//                "pineapple", "pumpkin", "potato"};
//        Random rand = new Random();
//        Scanner sc = new Scanner(System.in);
//        int l = rand.nextInt(25);
//        Boolean tr = true;
//        while (tr) {
//            String s = sc.next();
//            String s1 = words[l];
//            System.out.println(s.equals(s1));
//            if (s.equals(s1))
//                break;
//            else {
//                if (s.length() >= s1.length())
//                    for (int i = 0; i < s1.length(); i++) {
//                        if (s.charAt(i) == s1.charAt(i))
//                            System.out.println(s.charAt(i));
//                        else
//                            System.out.println("#");
//                    }
//                else
//                    for (int i = 0; i < s.length(); i++) {
//                        if (s.charAt(i) == s1.charAt(i))
//                            System.out.println(s.charAt(i));
//                        else
//                            System.out.println("#");
//                    }
//                for (int i = 0; i < 15; i++)
//                    System.out.println("#");
//            }
//
//        }
//    }

        //крестики нолики

//    public static char[][] map;
//    public static int SIZE = 5;
//    public static final int DOTS_TO_WIN = 4;
//    public static final char DOT_EMPTY = '.';
//    public static final char DOT_X = 'X';
//    public static final char DOT_O = 'O';
//
//    public static void initMap() {
//        map = new char[SIZE][SIZE];
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                map[i][j] = DOT_EMPTY;
//            }
//        }
//    }
//
//    public static void printMap() {
//        for (int i = 0; i <= SIZE; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < SIZE; i++) {
//            System.out.print((i + 1) + " ");
//            for (int j = 0; j < SIZE; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//
//    public static Scanner sc = new Scanner(System.in);
//
//    public static void humanTurn() {
//        int x, y;
//        do {
//            System.out.println("Введите координаты в формате X Y");
//            x = sc.nextInt() - 1;
//            y = sc.nextInt() - 1;
//        } while (!isCellValid(x, y));
//        map[y][x] = DOT_X;
//    }
//
//    public static boolean isCellValid(int x, int y) {
//        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
//        if (map[y][x] == DOT_EMPTY) return true;
//        return false;
//    }
//
//    public static boolean isMapFull() {
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                if (map[i][j] == DOT_EMPTY) return false;
//            }
//        }
//        return true;
//    }
//
//    public static Random rand = new Random();
//
//    public static void aiTurn() {
//       /* for (int y = 0; y < SIZE; y++) {
//            for (int x = 0; x < 3; x++) {
//                if (map[y][x] == 'X' && map[y][x + 1] == 'X' && map[y][x + 2] == 'X' && ((isCellValid((x + 3), y) == true && map[y][x + 3] == '.') || (isCellValid(x - 1, y) == true && map[y][x - 1] == '.'))) {
//                    if (isCellValid(x - 1, y) == true) {
//                        System.out.println("Компьютер походил в точку// " + (y + 1) + " " + (x));
//                        map[y][x - 1] = DOT_O;
//                        // return;
//                    } else {
//                        System.out.println("Компьютер походил в точку/ " + (y + 1) + " " + (x + 4));
//                        map[y][x + 3] = DOT_O;
//                        //return;
//                    }
//                }
//                if (map[x][y] == 'X' && map[x + 1][y] == 'X' && map[x + 2][y] == 'X' && ((isCellValid(x + 3, y) == true && map[x + 3][y] == '.') || (isCellValid(x - 1, y) == true && map[x - 1][y] == '.'))) {
//                    if (isCellValid(x -1, y) == true) {
//                        System.out.println("Компьютер походил в точку//// " + (x) + " " + (y + 1));
//                        map[x - 1][y] = DOT_O;
//                        // return;
//                    } else{
//                        System.out.println("Компьютер походил в точку/// " + (x + 4) + " " + (y));
//                        map[x + 3][y] = DOT_O;
//                        //return;
//                    }
//                }
//            }
//        }*/
//        for (int y = 0; y < SIZE; y++) {
//            for (int x = 0; x < 3; x++) {
//                if (map[y][x] == 'X' && map[y][x + 1] == 'X' && map[y][x + 2] == 'X' && ((isCellValid((x + 3), y) == true && map[y][x + 3] == '.') || (isCellValid(x - 1, y) == true && map[y][x - 1] == '.'))) {
//                    if (isCellValid(x + 3, y) == true) {
//                        System.out.println("Компьютер походил в точку/ " + (y + 1) + " " + (x + 4));
//                        map[y][x + 3] = DOT_O;
//                        //return;
//                    } else {
//                        System.out.println("Компьютер походил в точку// " + (y + 1) + " " + (x));
//                        map[y][x - 1] = DOT_O;
//                        // return;
//                    }
//                }
//                if (map[x][y] == 'X' && map[x + 1][y] == 'X' && map[x + 2][y] == 'X' && ((isCellValid(x + 3, y) == true && map[x + 3][y] == '.') || (isCellValid(x - 1, y) == true && map[x - 1][y] == '.'))) {
//                        if (isCellValid(x + 3, y) == true) {
//                            System.out.println("Компьютер походил в точку/// " + (x + 4) + " " + (y));
//                            map[x + 3][y] = DOT_O;
//                            //return;
//                        } else {
//                        System.out.println("Компьютер походил в точку//// " + (x) + " " + (y + 1));
//                        map[x - 1][y] = DOT_O;
//                        // return;
//                    }
//                }
//            }
//        }
//        int x, y;
//        do {
//            x = rand.nextInt(SIZE);
//            y = rand.nextInt(SIZE);
//        } while (!isCellValid(x, y));
//        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
//        map[y][x] = DOT_O;
//    }
//
//    public static boolean checkWin(char symb) {
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < 2; j++) {
//                if (map[i][j] == symb && map[i][j + 1] == symb && map[i][j + 2] == symb && map[i][j + 3] == symb)
//                    return true;
//                if (map[j][i] == symb && map[j + 1][i] == symb && map[j + 2][i] == symb && map[j + 3][i] == symb)
//                    return true;
//            }
//        }
//        for (int j = 0; j < 2; j++)
//            if (map[j][j] == symb && map[1 + j][j + 1] == symb && map[2 + j][j + 2] == symb && map[3 + j][j + 3] == symb)
//                return true;
//        if (map[0][4] == symb && map[1][3] == symb && map[2][2] == symb && map[3][1] == symb) return true;
//        if (map[1][3] == symb && map[2][2] == symb && map[3][1] == symb && map[4][0] == symb) return true;
//        if (map[0][1] == symb && map[1][2] == symb && map[2][3] == symb && map[3][4] == symb) return true;
//        if (map[1][0] == symb && map[2][1] == symb && map[3][2] == symb && map[4][3] == symb) return true;
//        if (map[0][3] == symb && map[1][2] == symb && map[2][1] == symb && map[3][0] == symb) return true;
//        if (map[1][4] == symb && map[2][3] == symb && map[3][2] == symb && map[4][1] == symb) return true;
//        return false;
//    }
//
//    public static void main(String[] args) {
//        initMap();
//        printMap();
////        for(int i=0;i<SIZE;i++) {
////            for(int j=0;j<2;j++) {
////                System.out.println(i+j+" "+(j));
////                System.out.println(i+j+1+" "+(j+1));
////                System.out.println(i+j+2+" "+(j+2));
////                System.out.println(i+j+3+" "+(j+3));
////                System.out.println();
////
////            }
////        }
//        while (true) {
//            humanTurn();
//            printMap();
//            if (checkWin(DOT_X)) {
//                System.out.println("Победил человек");
//                break;
//            }
//            if (isMapFull()) {
//                System.out.println("Ничья");
//                break;
//            }
//            aiTurn();
//            printMap();
//            if (checkWin(DOT_O)) {
//                System.out.println("Победил Искуственный Интеллект");
//                break;
//            }
//            if (isMapFull()) {
//                System.out.println("Ничья");
//                break;
//            }
//        }
//        System.out.println("Игра закончена");
//    }
    }

    public int id;
    public String name;
    private int counter = 0;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public Group() {
        counter++;
        id = counter;
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public Group(ArrayList<Student> students, ArrayList<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
    }

    public Group(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
        student.setgroup(this);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        teacher.Selectgroup(this);
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void showPeopleInGroup() {
        //for (int i = 0; i < this.students.size(); i++){
            System.out.println(getStudents());
    //}
        System.out.println(this.getTeachers());
    }
}



