package com.company.dealer.web.screens.person;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.Person;

@UiController("dealer_Person.browse")
@UiDescriptor("person-browse.xml")
@LookupComponent("personsTable")
@LoadDataBeforeShow
public class PersonBrowse extends StandardLookup<Person> {




}