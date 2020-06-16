package com.company.dealer.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.Country;

@UiController("dealer_Country.edit")
@UiDescriptor("country-edit.xml")
@EditedEntityContainer("countryDc")
@LoadDataBeforeShow
public class CountryEdit extends StandardEditor<Country> {
}