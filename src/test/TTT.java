package test;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class TTT {

    static class OBJ {
        String name;
        int age;
        public OBJ(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            OBJ obj = (OBJ) o;
            return age == obj.age && Objects.equals(name, obj.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }


    public static void main(String[] args) {
        showCurrent();
    }

    static void showCurrent() {
        LocalDateTime localDateTime = LocalDateTime.now();
        long milliseconds = localDateTime
                .atZone(ZoneId.systemDefault())
                .toInstant().toEpochMilli();

        long seconds = milliseconds / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;

        long s = seconds % 60;
        long m = minutes % 60;
        long h = hours % 24;

        System.out.printf("Date: %s, Time: %d\n", localDateTim.toString(), milliseconds);
        System.out.println(h + ": " + m + ": " + s);
    }
}
