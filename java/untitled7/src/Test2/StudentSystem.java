package Test2;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentSystem {
    public static void main(String[] args) {
            ArrayList<Student> list = new ArrayList<>();
    loop:   while (true) {
            System.out.println("---------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请选择");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();
            switch (choice) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> searchStudent(list);
                case "5" -> {
                    System.out.println("已退出");
                    break loop;
                    //System.exe(0);//停止虚拟机运行
                }
                default -> System.out.println("输入错误");
            }

        }
    }
        public static void addStudent (ArrayList < Student > list) {
            Student s = new Student();
            Scanner sc = new Scanner(System.in);
            String id = null;
            while(true){
                System.out.println("Please input the id of the student");
                id = sc.next();
                boolean flag = contains(list,id);
                if(flag) {
                    System.out.println("The target already exists");
                }else {
                    s.setId(id);
                    break;
                }
            }

            System.out.println("Please input the name of the student");
            String name = sc.next();
            s.setName(name);
            System.out.println("Please input the age of the student");
            int age = sc.nextInt();
            s.setAge(age);
            System.out.println("Please input the address of the student");
            String address = sc.next();
            s.setAddress(address);

            list.add(s);
            System.out.println("Finish");

        }

        public static void deleteStudent (ArrayList < Student > list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the id of the student");
        String id = sc.next();
        int index = getIndex(list,id);
        if(index >= 0) {
            list.remove(index);
            System.out.println("The id was removed");
        }else {
            System.out.println("The id does not exist");
        }

        }

        public static void updateStudent (ArrayList < Student > list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the id of the student");
        String id = sc.next();

        int index = getIndex(list,id);
        if(index == -1) {
            System.out.println("The id does not exist");
            return;
        }
        Student s = list.get(index);

        System.out.println("Please input the name of the student");
        String newName = sc.next();
        s.setName(newName);
        System.out.println("Please input the age of the student");
        int newAge = sc.nextInt();
        s.setAge(newAge);
        System.out.println("Please input the address of the student");
        String newAddress = sc.next();
        s.setAddress(newAddress);

        list.set(index, s);
        System.out.println("Finish");

        }
        public static void searchStudent (ArrayList < Student > list) {
            if (list.size() == 0) {
                System.out.println("当前没有学生，请添加后再查询");
                return;
            }
            System.out.println("id\t\tname\t\tage\t\taddress");
            for (int i = 0; i < list.size(); i++) {
                Student Stu = list.get(i);
                System.out.println(Stu.getId() + "\t" + Stu.getName() + "\t" + Stu.getAge() + "\t" + Stu.getAddress());
            }

        }

        public static boolean contains(ArrayList < Student > list, String id) {
//            for (int i = 0; i < list.size(); i++) {
//                Student s = list.get(i);
//                String sid = s.getId();
//                if(sid.equals(id)){
//                    return true;
//                }
//            }
//            return false;
            return getIndex(list,id)>=0;
        }

        public static int getIndex (ArrayList < Student > list, String id) {
            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                String sid = s.getId();
                if (sid.equals(id)) {
                    return i;
                }
            }
            return -1;
        }
}
