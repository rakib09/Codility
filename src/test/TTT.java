package test;

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
}
