package org.mersen.controller;

import org.mersen.entity.PhoneRecord;
import org.mersen.service.PhoneBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/phonebook/")
public class PhoneBookController {

    private PhoneBookService phoneBookService;

    private Logger logger = LoggerFactory.getLogger(PhoneBookController.class);

    @Autowired
    public PhoneBookController( PhoneBookService phoneBookService) {
        this.phoneBookService = phoneBookService;
    }
    @PostMapping("/new")
    public void addnewPhoneRecord(@RequestBody PhoneRecord phoneRecord){
        logger.debug("A new Phone record reqeust is received {}", phoneRecord);
        phoneBookService.addNewPhoneRecord(phoneRecord);
    }

    @GetMapping("/query")
    public List<PhoneRecord> queryPhoneRecords(@RequestBody PhoneBookService.PhoneBookSearchParameter searchParameter){
        logger.debug("A new Phone record query request is received {}", searchParameter);
        return phoneBookService.queryPhoneRecords(searchParameter);
    }

    @DeleteMapping("/phonerecord/{phoneNumber}")
    public void deletePhoneRecord(@PathVariable long phoneNumber){
        logger.debug("A new Phone record delete request is received {}", phoneNumber);
        phoneBookService.deletePhoneRecord(phoneNumber);
    }
}
