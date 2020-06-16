package com.company.dealer.web.screens.color;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.Color;

@UiController("dealer_Color.browse")
@UiDescriptor("color-browse.xml")
@LookupComponent("colorsTable")
@LoadDataBeforeShow
public class ColorBrowse extends StandardLookup<Color> {
}