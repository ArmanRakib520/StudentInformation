package com.rakib.studentinformation;

public class FormDataModel {
    private int id;
    private String name;
    private String age;
    private String phone;
    private String email;
    private byte[] imageData;


    public FormDataModel(int id, String name, String age, String phone, String email, byte[] blob) {
        super();
        this.id = this.id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.imageData=imageData;

    }
    public FormDataModel(String name, String age, String phone, String email, byte[] imageData) {
        super();
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.imageData=imageData;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

}
