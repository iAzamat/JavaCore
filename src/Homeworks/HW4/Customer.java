package Homeworks.HW4;

public class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private Gender gender;

    public Customer(String firstName, String lastName, int age, String phone, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Имя не должно быть равно null или пустым");
        } else {
            this.firstName = firstName;
        }

    }

    public void setLastName(String lastName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Фамилия не должна быть равна null или пустой");
        } else {
            this.lastName = lastName;
        }
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public void setPhone(String phone) {
        if (phone == null || phone.isEmpty() || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("Был передан некорректный номер");
        } else {
            this.phone = phone;
        }

    }

    public void setGender(Gender gender) {
        if (gender == null) {
            throw new IllegalArgumentException("Пол не указан");
        } else {
            this.gender = gender;
        }

    }

    @Override
    public String toString() {
        String genderTitle = "Мужской";
        if (gender == Gender.FEMALE) {
            genderTitle = "Женский";
        }
        return
                "   Покупатель: " + lastName + " " + firstName + '\n' +
                        "   Возраст: " + age + '\n' +
                        "   Телефон: " + phone + '\n' +
                        "   Пол: " + genderTitle + '\n';
    }
}
