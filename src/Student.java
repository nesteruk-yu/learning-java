//1. Создать класс Student c полями id (тип int), name (тип String), surname (тип String), faculty (факультет, тип String ), course(тип int) , Группа(тип String), средняя оценка (тип int).Инициализацию студента в классе main выполнять через конструктор с параметрами. Также определите конструктор без параметров.
public class Student {
    int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int mark;
    static Boolean isFirst = true;

    public Student(int id, String name, String surname, String faculty, int course, String group, int mark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.mark = mark;
    }

    public Student() {
        this.id = 5;
        this.name = "Ivan";
        this.surname = "Ivanov";
        this.faculty = "Math";
        this.course = 1;
        this.group = "two";
        this.mark = 7;
    }

    //2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
    public void info() {
        System.out.println("Name: " + name + ", Surname: " + surname + ", Faculty: " + faculty + ", Course: " + course + ", Group: " + group + ", Mark: " + mark);
    }

    //3. Создать метод, который будет изменять текущую группу студента (сам метод в качестве параметра будет принимать новую группу)
    public void changeGroup(String newGroup) {
        this.group = newGroup;
    }

    //4. Создать метод, который будет возвращать текущую группу студента.
    public String showCurrentGroup() {
        return this.group;
    }

    //5. Создать метод, который будет изменять оценку студента и группу студента.
    public void changeMarkAndGroup(int newMark, String newGroup) {
        this.mark = newMark;
        this.group = newGroup;
    }
//7. Создать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов массив студентов, у которых оценка выше переданной оценки в методе. (Сигнатура метода будет выглядеть так PublicStudent[]getStudents(Students[] students, int mark)

    public Student[] getStudentsMark(Student[] students, int mark) {

        Student[] result = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            if (students[i].mark > mark) {
                result[i] = students[i];
            }
        }
        return result;
    }
}
