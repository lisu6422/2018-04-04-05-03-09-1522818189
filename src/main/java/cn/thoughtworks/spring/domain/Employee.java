package cn.thoughtworks.spring.domain;

/**
 * @author likly
 * @version 1.0
 * @date 2018-04-29 10:11
 * @since 1.0
 */
public class Employee extends Domain<Integer> {

    private static final long serialVersionUID = -235812500524704751L;
    private String name;
    private Integer age;
    private String gender;

    public Employee() {
    }

    public Employee(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Employee)) return false;

        return getId().equals(((Employee) obj).getId());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
