package org.mersen.entity;

public class PhoneRecord {

    private long phoneNumber;
    private String user;

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "PhoneRecord{" +
                "phoneNumber=" + phoneNumber +
                ", user='" + user + '\'' +
                '}';
    }
}
