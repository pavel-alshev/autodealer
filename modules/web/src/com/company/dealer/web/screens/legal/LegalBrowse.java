package com.company.dealer.web.screens.legal;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.Legal;

@UiController("dealer_Legal.browse")
@UiDescriptor("legal-browse.xml")
@LookupComponent("legalsTable")
@LoadDataBeforeShow
public class LegalBrowse extends StandardLookup<Legal> {
}