package com.company.dealer.web.screens.color;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.Color;

@UiController("dealer_Color.edit")
@UiDescriptor("color-edit.xml")
@EditedEntityContainer("colorDc")
@LoadDataBeforeShow
public class ColorEdit extends StandardEditor<Color> {
}