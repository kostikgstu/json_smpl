package JSONsmpl;


public class Student {

    private String surname;
    private String name;
    private String middlename;
    private int age;
    private String groupname;

    public Student() {
        this("Ivanoff","Ivan","Ivanovich",25,"IT");
    }

    public Student(String surName, String name, String middleName, int age, String groupName) {
        this.surname=surName;
        this.name = name;
        this.middlename=middleName;
        this.age=age;
        this.groupname=groupName;
    }

    public String getSurName() {
        return surname;
    }

    public void setSurName(String surName) {
        this.surname = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getMiddleName() {
        return middlename;
    }

    public void setMiddleName(String middleName) {
        this.middlename = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroupName() {
        return groupname;
    }

    public void setGroupName(String groupName) {
        this.groupname = groupName;
    }


    @Override
    public String toString() {
        return surname+" "+name.charAt(0)+"."+middlename.charAt(0)+".";
    }


}