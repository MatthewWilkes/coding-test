#! python3.8


def inputData():
    """A function to return the contents of input.txt from the current directory, to act as a development
    placeholder for data input.
    
    You don't need to improve this method if you don't want to, but you're welcome to change how data is read in
    from input.txt if you like.
    """
    with open("input.txt", "r", encoding="ascii") as input_file:
        return input_file.read()


def main():
    print("Done")


if __name__ == "__main__":
    main()
