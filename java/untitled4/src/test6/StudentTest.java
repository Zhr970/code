package test6;


public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student s1 = new Student("zhangsan",20,1);
        Student s2 = new Student("lisi",22,2);
        Student s3 = new Student("wangwu",24,3);

        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;

        int index=getIndex(arr,1);
        if(index>=0){
            arr[index]=null;
            System.out.println("This id was deleted");
            printfArr(arr);
        }else{
            System.out.println("This id was not found");
        }

        int id=getIndex(arr,2);
        if(id>=0){
            Student stu = arr[id];
            int newAge = stu.getAge()+1;
            stu.setAge(newAge);
            printfArr(arr);
        }else{
            System.out.println("This id was not found");
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
    public static int getIndex(Student[] arr,int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            if(stu!=null){
                int sid=stu.getId();
                if(sid==id){
                    return i;
                }
            }
        }
        return -1;
    }

    public static int getId(Student[] arr,int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            if(stu!=null){
                int sid=stu.getId();
                if(sid==id){
                    return i;
                }
            }
        }
        return -1;
    }

}
