class Calculator:
    input1 = 0.0
    input2 = 0.0

    def __init__(self, input1=0.0, input2=0.0):
        self.input1 = input1
        self.input2 = input2
        
    def adder(self):
        return self.input1 + self.input2

    def subtractor(self):
        return self.input1 - self.input2

    def divider(self):
        return self.input1/self.input2
    
    def multiplier(self):
        return self.input1 * self.input2
    
    def clear(self):
        self.input1 = 0.0
        self.input2 = 0.0
        return 0.0
    

x = float(input())
y = float(input())

calculate = Calculator() #Initilise with empty parameters
calculate.input1 = x
calculate.input2 = y
print(calculate.multiplier())

calculate = Calculator(x,y)
print(calculate.adder())

calculator = Calculator(x) # input1 is set, input2 is default
print(calculator.subtractor())

calculator = Calculator(input2=y) # input1 is default, input2 is y
print(calculator.adder())

calculator = Calculator(input2=y, input1=x)
print(calculator.divider())