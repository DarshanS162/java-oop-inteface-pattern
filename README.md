Payment Interface
A base Payment interface defines the contract for all payment types.
Each payment method must implement the required behavior (e.g., pay()).

Multiple Payment Implementations
Several concrete classes (like CashPayment, CardPayment, etc.) implement the Payment interface.
Each class overrides the logic based on its specific payment process.

Custom Functional Interface – Logger
A functional interface TransLogger is included to demonstrate lambda expressions.
It is used to log important transaction messages in a cleaner, more flexible way.
