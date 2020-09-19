package com.store;

public abstract class User {
    private String name;
    private String emailAddress;
    private String phone;
    private Address homeAddress;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract void jump();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString(){
        return String.format("Name:%s%nPhoneNumber:%s%nEmail:%s%nHomeAddress:%s",getName(),getPhone(),getEmailAddress(),getHomeAddress());
    }
}
