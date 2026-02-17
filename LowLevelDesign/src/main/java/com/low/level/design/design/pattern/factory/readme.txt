In SimpleFactory Pattern:
We are doing 2 things.
1. Decision making before creating object i.e; which object needs to be created.
2. Creating object.

This is violating two principles
1. Single Responsibility Principle.(doing 2 things)
2. Open/Closed Principle. (let say later we add some more shapes so we will be updating ShapeFactory class).



In FactoryMethod Pattern:

We are doing 1 thing just deciding the which object needs to be created and that object factory will be creating the object.
As we have 1 factory per product.
1 factory for circle
1 factory for square

here we are violating only 1 principle
1. Open/Closed Principle. (let say later we add some more shapes So we will be updating ShapeFactory class).

But we have resolved the single responsibility principle violation here
