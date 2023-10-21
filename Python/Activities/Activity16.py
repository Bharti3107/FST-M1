# create a class
class Car:

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color


    def accelerate(self):
     print(self.manufacturer , "and " + self.model , " has started moving")

    def stop(self):
     print(self.manufacturer , "and " , self.model , " has stopped moving")



mycar1 = Car("Toyota", "Corolla", "2015", "Manual", "White")
mycar2 = Car("Maruti", "800", "2013", "Manual", "Red")
mycar3 = Car("Suzuki", "Swift", "2017", "Automatic", "Black")

mycar1.accelerate()
mycar1.stop()
