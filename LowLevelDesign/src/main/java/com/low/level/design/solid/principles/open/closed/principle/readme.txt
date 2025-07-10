We had InvoiceDAO at some point we also have to save invoice in file as well along with db.
Now if we just add method saveToFile in InvoiceDAO class then it's the violation of open closed principle.
As it is open for extension but not for modification and we are about to do modification.

For solution we introduces an interface and then each class will be implementing the save method
as per their requirement.
