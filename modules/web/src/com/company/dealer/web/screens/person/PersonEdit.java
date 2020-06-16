package com.company.dealer.web.screens.person;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.Person;

@UiController("dealer_Person.edit")
@UiDescriptor("person-edit.xml")
@EditedEntityContainer("personDc")
@LoadDataBeforeShow
public class PersonEdit extends StandardEditor<Person> {
}