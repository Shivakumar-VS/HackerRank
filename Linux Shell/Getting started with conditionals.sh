#!/bin/bash

read X
if [[ $X == 'Y' || $X == 'y' ]]; then
    echo "YES"
elif [[ $X == 'N' || $X == 'n' ]]; then
    echo "NO"
else
    echo "No other character"
fi