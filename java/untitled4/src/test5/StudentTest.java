package test5;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student s1 = new Student("zhangsan",20,1);
        Student s2 = new Student("lisi",22,2);
        Student s3 = new Student("wangwu",24,3);

        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;

        Student s4 = new Student("sanqi",26,4);

        boolean flag = contains(arr,s4.getId());
        if(flag){
            System.out.println("This Id was used");
        }else {
            int count=getCount(arr);
            if(count == arr.length){
                System.out.println("This arr was full");
                Student[] newArr = creatNewArr(arr);
                newArr[count]=s4;
                printfArr(newArr);
            }else{
                arr[count]=s4;
                printfArr(arr);
            }
        }

    }

    public static void printfArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student Stu = arr[i];
            if(Stu!=null){
                System.out.println(Stu.getName()+","+Stu.getAge()+","+Stu.getId());
            }
        }
    }


    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }


    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                count++;
            }
        }
        return count;
    }
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            if (s != null && s.getId() == id) {
                return true;
            }
        }
        return false;
    }

}
