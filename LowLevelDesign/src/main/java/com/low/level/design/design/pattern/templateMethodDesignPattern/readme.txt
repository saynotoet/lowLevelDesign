now below mentioned methods/steps have flexibility to add any custom logic along with that making sendMoney method final we also restrict all children
classes to not override them and bounded them to give their impl for below mentioned methods.

1. validate();
2. calculatePlatformFees();
3. debitAmount();
4. creditAmount();
