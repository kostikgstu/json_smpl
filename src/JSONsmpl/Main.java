package JSONsmpl;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        Gson gson = new Gson();

        String json = gson.toJson(student);

        System.out.println(json);

    }
}
