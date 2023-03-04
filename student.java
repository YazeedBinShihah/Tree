package tree;
public class student {
    int id;
    String name;
    double exam_marks;

    public student(int id, String name, double exam_marks) {
        this.id = id;
        this.name = name;
        this.exam_marks = exam_marks;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExam_marks() {
        return exam_marks;
    }

    public void setExam_marks(double exam_marks) {
        this.exam_marks = exam_marks;
    }

    @Override
    public String toString() {
        return "student{" + "id=" + id + ", name=" + name + ", exam_marks=" + exam_marks + '}';
    }
    
}
