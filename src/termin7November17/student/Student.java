package termin7November17.student;

public class Student {

    private String name;
    private int alter;

    public int getAlter() {
        return alter;
    }

    public String getName() {
        return name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Student[] ueber18(Student[] studenten) {
        int count = 0;
        for(int i = 0; i < studenten.length; i++) {
            if(studenten[i].alter >= 18) {
                count++;
            }
        }

        Student[] newArray = new Student[count];

        int count2 = 0;
        for(int i = 0; i < studenten.length; i++) {
            if(studenten[i].alter >= 18) {
                newArray[count2] = studenten[i];
                count2++;
            }
        }

        return newArray;
    }

}
