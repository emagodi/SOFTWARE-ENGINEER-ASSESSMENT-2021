package com.econetwireless.epay.business.services.impl;

import com.econetwireless.epay.business.services.api.PartnerCodeValidator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PartnerCodeValidatorImplTest {
    public PartnerCodeValidator partnerCodeValidator = Mockito.mock(PartnerCodeValidator.class);
    @Test
    public void validatePartnerCode() {
        String emptyPartnerCode = "";
        String  nullPartnerCode = null;

        //Should Return False Because Partner code is Empty
        Assert.assertFalse(partnerCodeValidator.validatePartnerCode(emptyPartnerCode));
        //should Return False Because Partner code is Null
        Assert.assertFalse(partnerCodeValidator.validatePartnerCode(nullPartnerCode));
    }
}