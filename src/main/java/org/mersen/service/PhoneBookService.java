package org.mersen.service;

import org.mersen.entity.PhoneRecord;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneBookService {

    private List<PhoneRecord> phoneRecordList = new ArrayList<>();

    public record PhoneBookSearchParameter(long phoneNumber, String user) {

    }

    public void addNewPhoneRecord(PhoneRecord phoneRecord) {
        phoneRecordList.add(phoneRecord);
    }

    public List<PhoneRecord> queryPhoneRecords(PhoneBookSearchParameter searchParameter) {
        return phoneRecordList.stream()
                .filter(x -> searchParameter.phoneNumber == 0 || x.getPhoneNumber() == searchParameter.phoneNumber)
                .filter(x -> searchParameter.user == null || x.getUser().equals(searchParameter.user))
                .toList();
    }

    public void deletePhoneRecord(long phoneNumber) {
        phoneRecordList.removeIf(x -> x.getPhoneNumber() == phoneNumber);
    }
}
