﻿# CastingAgency
- The `buildData` method in the `Main` class is responsible for reading data from the "random.csv" file and populating three hashmaps (`gozRengiTable`, `sacRengiTable`, and `boyTable`) based on the eye color, hair color, and height of each person, respectively. It also maintains an `ArrayList` called `isimler` to store all the names.

- The `main` method prompts the user to input values for eye color, hair color, and height. It then searches the hashmaps to find matching persons based on the provided criteria. The matching algorithm counts the number of criteria that match and stores the count for each person in the `answer` hashmap.

- If no criteria are provided, the code prints all the names from the `isimler` array. Otherwise, it prints the names of the persons who match all the provided criteria.

- The `RandomData` class is responsible for generating random data if the "random.csv" file does not exist. It creates a file writer and writes a predefined number of lines to the file, randomly assigning eye colors, hair colors, and heights to each person.

Note: The code assumes that the "random.csv" file is present in the specified path (`./random.csv`) or generates it if it does not exist. You may need to ensure that the file is present or adjust the path accordingly.

Overall, this code demonstrates the implementation of a hashmap to store and search data based on different attributes of persons.
