# Coding challenge

This is based on the brilliant https://adventofcode.com/2020/day/2

----

Suppose you have the following text file:

    1-3 a: abcde
    1-3 b: cdefg
    2-9 c: ccccccccc

Each line gives a password policy and then the password to be validated. The password policy indicates the lowest and highest number of times a given letter must appear for the password to be valid. For example, `1-3 a` means that the password must contain a at least 1 time and at most 3 times.

In the above example, 2 passwords are valid. The middle password, `cdefg`, is not; it contains no instances of b, but needs at least 1. The first and third passwords are valid: they contain one a or nine c, both within the limits of their respective policies.

How many passwords in `input.txt` are valid according to their policies?

# Getting started
Clone this to your computer and import into an IDE (if you use one). Remember to set a JDK or a Python version.

If you don't have a working local install, you can use replit.com with Github credentials. In that case, import this repository and set .replit to be one of the following:

## Java

    language = "java10"
    run = "cd java;javac src/uk/gov/insolvency/inssdev/applicationservices/b3test/Main.java; java -cp src uk.gov.insolvency.inssdev.applicationservices.b3test.Main"

## Python

    language = "python3"
    run = "cd python;python3 b3test.py"