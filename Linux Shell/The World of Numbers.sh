#!/bin/bash
# Read two integers
read X
read Y
# Perform operations
sum=$((X + Y))
difference=$((X - Y))
product=$((X * Y))

# Handle integer division
if [ $Y -ne 0 ]; then
    quotient=$((X / Y))
else
    quotient="Undefined (cannot divide by zero)"
fi

# Output results
echo $sum
echo $difference
echo $product
echo $quotient
