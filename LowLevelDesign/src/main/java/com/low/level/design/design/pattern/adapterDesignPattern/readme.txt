client wants wieght in kg but adaptee/existing interface return weight in pounds.
So we introduced the adapter which will be doing this conversion for us. and give weight in kg to the client.


Any class/interface which converts one form of result into another is known as adapter.

let say client needs response in JSON but server returns XML so we will introduce a service which will do conversion from JSON to XML.
that service will be known as adapter. server will be known as adaptee.