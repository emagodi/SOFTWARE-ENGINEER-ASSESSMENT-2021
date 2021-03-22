### Developer Task 1 

* You will receive instructions from Cassava Smartech on what's required.

1.	mvn clean install  - system is failing in the module econet-utils. 
Solution: Changed Logger in MobileNumberUtils.java from non-static to static
2.	System now failing at electronic-payments-domain module. Compilation failure due to symbol PreInsert. 
Solution: Corrected annotation PreInsert to @PrePersit
3.	Failing in the business module in the java file PartnerCodeValidatorImpl.java.
Corrected this(super) to super().
4.	Failing in business module due to method persist which is not being recognised by JPA. Changed the JPA method in CreditsServiceImpl.java to save.
5.	Failing in business module due to method update which is not being recognised by JPA. Changed the JPA method in CreditsServiceImpl.java to save.
6.	Failing in business module due to method persist which is not being recognised by JPA. Changed the JPA method in EnquiriesServiceImpl.java to save.
7.	Failing in business module due to method update which is not being recognised by JPA. Changed the JPA method in EnquiriesServiceImpl.java to save.
8.	Corrected name query in SubscriberRequest.java. Replaced Request with request since entity name is set to request.
9.	 EpayResourceIT test cases throwing null point. First correction adding @PathVariable Spring annotation
10.	Autowired EpayRequestProcessor to inject in EpayResource.java.
11.	Autowired ReportingProcessor to inject in EpayResource.java.
12.	Marked directory electronic-payments-business as generated source root. This will generate java classes from the wsdl.
13.	Created test class to validate partner code. The class checks if partner code is null or empty.
14.	Created test class for ReportingService. This test will check if the service is running. It also checks if the service is not returning null. The test also test if service is returning required data type of List i.e List has property size()
15.	Start web service from the file IntelligentNetworkPublisher.java
16.	Start jetty save using command mvn jetty:run
17.	Test method shouldReturnStatusOkIfRequestsAreMoreThanOne()in EpayResourceIT giving error 415 due to content type 

