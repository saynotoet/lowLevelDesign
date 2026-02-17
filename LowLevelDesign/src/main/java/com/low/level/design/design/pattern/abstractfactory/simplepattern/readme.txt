In this approach we have 2 layer factories.
first we give choice and get factory either ExteriorFactory or InteriorFactory
Then from that object,
we again give choice and get Either Luxury or Economy

This way it is known as factory of factories.

Here CarProducerFactory is a factory of InteriorFactory and ExteriorFactory.
