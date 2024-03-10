package java_basic_programs;

public class pass_by_value {
    int marks = 77;
    void subject(int marks){
        marks = marks - 10;
        System.out.println(marks);
    }
    public static void main(String[] args){
        pass_by_value pbv = new pass_by_value();
        System.out.println(pbv.marks);
        pbv.subject(99);
        System.out.println(pbv.marks);
    }
}
