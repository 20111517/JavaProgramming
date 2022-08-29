package day_39Recapp.CydeoTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty()) {
            System.err.println("invalid name:" + name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 18) {
            System.err.println("invalid age" + age);
            System.exit(1);
        }
        this.age = age;
    }

        public char getGender () {
            return gender;
        }

        public void setGender ( char gender){
            this.gender = gender;
        }

    public Person(String name, int age, char gender){
            setName(name);
            setAge(age);
            setGender(gender);
        }
    }
