package com.company.dealer.web.screens.legal;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.Legal;

@UiController("dealer_Legal.edit")
@UiDescriptor("legal-edit.xml")
@EditedEntityContainer("legalDc")
@LoadDataBeforeShow
public class LegalEdit extends StandardEditor<Legal> {
}