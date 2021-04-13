from datetime import datetime

class Assest:
    name = ""
    description = ""
    value = 0.0
    qty = 0.0
    date = datetime

    def __init__(self, name, description, value, qty):
        self.name = name
        self.description = description
        self.value = value
        self.qty = qty
    
    def valuate(self):
        return self.value
    
class Stock(Assest):
    share_price = 0.0

    def valuate(self, share_price=None):
        if share_price is not None:
            self.share_price = share_price
            self.value = self.qty * share_price
        return self.value

class Bond(Assest):
    interest_rate = 0.0

    def valuate(self, years=0):
        if years > 0:
            self.value += self.value * years *  self.interest_rate
        return self.value
    
# gme = Stock("GME", "GameStonks", 200.0, 100) # constructors are inherited in Python
# print("Initial value=", gme.valuate())
# print("Current value=", gme.valuate(float(input())))

tel = Bond("TEL", "TELCO", 2000.0, 100)
tel.interest_rate = 0.1
print("Initial value=", tel.valuate())
print("Current value=", tel.valuate(float(input())))

