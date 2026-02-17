There are two approaches for this patter
1.push
2.pull

both are correct it depends on the requirement and approach we are using.

In push approach, observable notifies the observers and send data in the update method.


In pull approach, observers already have the object of observable and pulls data as per their need. observable only calls update method whenever there is any update available,
and observers will pull data.