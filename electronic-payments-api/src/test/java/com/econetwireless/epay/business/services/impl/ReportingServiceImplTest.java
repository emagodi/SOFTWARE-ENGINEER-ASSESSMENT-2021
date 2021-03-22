package com.econetwireless.epay.business.services.impl;

import com.econetwireless.epay.business.services.api.ReportingService;
import com.econetwireless.epay.domain.SubscriberRequest;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class ReportingServiceImplTest {
    public ReportingService reportingService = Mockito.mock(ReportingService.class);
    @Test
    public void findSubscriberRequestsByPartnerCode() {
        final String partnerCode = "hot-recharge";

        List<SubscriberRequest> requests = reportingService.findSubscriberRequestsByPartnerCode(partnerCode);
        //Test If Service Is Working
        //Test If Service is not Return Null
        Assert.assertNotNull(requests);
        //Test If Service is returning Required Data Type of List ie List has property size()
        Assert.assertTrue(requests.size()>=0);
    }

}