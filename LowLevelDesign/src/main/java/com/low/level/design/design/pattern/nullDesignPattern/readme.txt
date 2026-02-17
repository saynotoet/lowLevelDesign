in before. let say we get a vehicle of type Truck but factory will return null.
when we will invoke any method on this null we will get NPE. to avoid this we use !=null condition.
For removing this !=null conditions from everywhere we defined a class named NullVehicle now we can invoke methods and will not get any NPE.