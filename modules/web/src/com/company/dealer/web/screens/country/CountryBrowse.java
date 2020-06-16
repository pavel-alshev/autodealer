package com.company.dealer.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.Country;

@UiController("dealer_Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("countriesTable")
@LoadDataBeforeShow
public class CountryBrowse extends StandardLookup<Country> {
}