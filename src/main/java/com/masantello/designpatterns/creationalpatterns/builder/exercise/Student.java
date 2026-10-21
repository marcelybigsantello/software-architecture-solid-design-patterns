package com.masantello.designpatterns.creationalpatterns.builder.exercise;

public class Student {

    private Integer code;
    private String name;
    private String university;

    private Integer age;

    private Student(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.university = builder.university;
        this.age = builder.age;
    }

    public static class Builder {
        private final Integer code;
        private final String name;
        private final String university;

        private Integer age;

        public Builder(Integer code, String name, String university) {
            this.code = code;
            this.name = name;
            this.university = university;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student {" +
                " code=" + code +
                ", name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", age=" + age +
                " }";
    }
}
