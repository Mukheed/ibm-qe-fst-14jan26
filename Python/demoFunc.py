def my_function():
  print("Hello from a function")
  
my_function()

#Arbitary arguments
def my_function(*pets):
  print("The youngest pet is " + pets[0])

my_function("Timmy", "Chippy") 