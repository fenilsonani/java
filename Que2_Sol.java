// 2. Uka Tarsadia University awards some grace marks to students who participate in the
// national games. Therefore, total marks awarded = Exam_Marks + Sports_Grace_Marks.
// If total marks scored are greater than maximum marks, then the final marks awarded
// will be equal to the maximum marks. An OO-based implementation will contain a class
// called Results, which inherits a class called Exam, which itself inherits a class called
// Student. It will also contain class called Sports, which is inherited by the Results class.
// The Results class will be responsible for computing the final marks scored by students.
// Write c++ program to implement given scenario.

class Student {
    String name;
    int rollNo;
    int maxMarks;

    Student(String name, int rollNo, int maxMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.maxMarks = maxMarks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }
}

class Exam extends Student {
    int examMarks;

    Exam(String name, int rollNo, int maxMarks, int examMarks) {
        super(name, rollNo, maxMarks);
        this.examMarks = examMarks;
    }

    public int getExamMarks() {
        return examMarks;
    }

    public void setExamMarks(int examMarks) {
        this.examMarks = examMarks;
    }
}

class Sports {
    int sportsGraceMarks;

    Sports(int sportsGraceMarks) {
        this.sportsGraceMarks = sportsGraceMarks;
    }

    public int getSportsGraceMarks() {
        return sportsGraceMarks;
    }

    public void setSportsGraceMarks(int sportsGraceMarks) {
        this.sportsGraceMarks = sportsGraceMarks;
    }
}

class Results extends Exam {
    int totalMarks;

    Sports s;

    Results(String name, int rollNo, int maxMarks, int examMarks, int sportsGraceMarks) {
        super(name, rollNo, maxMarks, examMarks);
        s = new Sports(sportsGraceMarks);
        int temp = examMarks + sportsGraceMarks;
        if (temp > maxMarks) {
            totalMarks = maxMarks;
        } else {
            totalMarks = temp;
        }
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int getSportsGraceMarks1() {
        return s.getSportsGraceMarks();
    }
}

public class Que2_Sol {
    public static void main(String[] args) {
        Results r = new Results("John", 1, 100, 910, 10);
        System.out.println("Name: " + r.getName());
        System.out.println("Roll No: " + r.getRollNo());
        System.out.println("Max Marks: " + r.getMaxMarks());
        System.out.println("Exam Marks: " + r.getExamMarks());
        System.out.println("Sports Grace Marks: " + r.getSportsGraceMarks1());
        System.out.println("Total Marks: " + r.getTotalMarks());
    }
}
