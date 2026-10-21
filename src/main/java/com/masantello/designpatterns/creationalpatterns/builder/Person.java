package com.masantello.designpatterns.creationalpatterns.builder;

import java.time.LocalDate;

public class Person {

    // Mandatory fields
    private Integer personId;
    private String name;
    private String email;

    // Optional fields
    private String documentId;
    private LocalDate birthDate;
    private String address;

    public Person(Builder builder) {
        this.personId = builder.personId;
        this.name = builder.name;
        this.email = builder.email;
        this.documentId = builder.documentId;
        this.birthDate = builder.birthDate;
        this.address = builder.address;
    }

    public static class Builder {
        private final Integer personId;
        private final String name;
        private final String email;

        private String documentId;
        private LocalDate birthDate;
        private String address;

        public Builder(Integer personId, String name, String email) {
            this.personId = personId;
            this.name = name;
            this.email = email;
        }

        public Builder setDocumentId(String documentId) {
            this.documentId = documentId;
            return this;
        }

        public Builder setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        //this is when we build the Person object
        public Person build() {
            return new Person(this);
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", documentId='" + documentId + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                '}';
    }
}
