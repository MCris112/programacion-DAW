package Activities.Activity5;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String[] data;

    public Student(String[] data) {
        this.data = data;
    }

    public String[] getData() {
        return data;
    }

    public void setValueOn( int index, String value) {
        this.data[index] = value;
    }

    @Override
    public String toString() {
        return "Student{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
