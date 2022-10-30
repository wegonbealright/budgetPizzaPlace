# BudgetPizzaPlace
Main patterns used in the project are: 

- Decorator (used for topping addition to prototype pizza's or the one from scratch) (Structural)
- Prototype (premade type of pizza that can also add toppings if decided so) (Creational)
- State (signalizes the different order processing stages after receiving payment) (Behavioral)
- Strategy (payment type for the order - card or paypal) (Behavioral)
- Template Method (preparation quality for the pizza, main difference being – price) (Behavioral)


# Quick runthrough of the program

1. The program asks the user's input whether he would like to order one of the 2 pre-made pizzas or make one himself
2. Based on the input, one of the pizza's is "created". The user can then decide for toppings (3 combinations consisting of 2 toppings in each)
3. User can re-do the choice if needed, else he can type "done" and move on to next step
4. Now, the user decides about the cooking method – quick and easy (less expensive) or rich and exquisite (more expensive).
5. After deciding on the cooking method, the user will be prompted to select payment method
6. Finally the pizza place will accept the payment (if valid) and show the different delivery states of the pizza.
