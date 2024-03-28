package org.mersen.entity;

import java.util.List;

public class PhoneBook {

    private List<PhoneRecord> recordList;
    private String owner;

    public List<PhoneRecord> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<PhoneRecord> recordList) {
        this.recordList = recordList;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
