package PROGRAM3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

class Person {
    private String name;
    private Date dateOfBirth;

    public Person(String name, String dob) {
        this.name = name;
        try {
            this.dateOfBirth = new SimpleDateFormat("dd-MM-yyyy").parse(dob);
        } catch (Exception e) {
            System.out.println("Invalid date format. Use DD-MM-YYYY.");
            this.dateOfBirth = null; // Ensures the object is still valid
        }
    }

    public void displayPersonName() {
        System.out.println("Person Name: " + name);
    }

    public void displayAge() {
        if (dateOfBirth != null) {
            Calendar dob = Calendar.getInstance();
            dob.setTime(dateOfBirth);
            Calendar today = Calendar.getInstance();

            int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
            if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
                age--;
            }

            System.out.println("Age: " + age + " years");
        } else {
            System.out.println("Age calculation failed due to invalid date format.");
        }
    }
}


