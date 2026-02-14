We have bike interface, and all the time method turnOnEngine gets called then it turn on the engine
or set the isEngineOn to true but in Bicycle case there is no engine at all. then we throw an error. but
this violates the principle as it is breaking the behaviour of the program.

now when we pass the object of bicycle to the program and calls turnOnEngine mehod it will
create problem.


this issue can be fixed if we introduce granular interfaces as MotorizedBike and Bike instead of only 1
interface as Bike.
MotorCycle class will be implementing both the interfaces
but the bicycle class will only implement the Bike interface. So there are no chances that we call
turnOnEngine method on Bicycle class's object.
