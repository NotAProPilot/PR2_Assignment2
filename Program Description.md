# Description
## Brief overview:
- In this assignment, you will develop an object oriented program in Java that obtains user data input from the standard input to create objects and to display a report to the standard output. The program also provides an option to store the report to a text file.
- The program, named ```PCProg```, processes data about personal computers. A personal computer (PC) is described in terms of the following attributes: ```model```, ```year```, ```manufacturer``` , and ```comps``` (short for components). 
- The table below describes the domain constraints of these attributes. Note that attribute comps has the type Set. For the purpose of this program, components are simply strings which denote their names.
![image](https://user-images.githubusercontent.com/113848893/229787644-4cbd2628-bc00-43ff-8036-78dbfeb152e4.png)
- To create a PC object, the program first prompts the user for the required data values, in the following order: model, year, manufacturer, and components. The number of components may vary from 0 to many. When the user wants to stop adding components, (s)he enters a blank line. Please note that comps is a set, which doesn’t store duplicate elements.
- Once the data values have been obtained, the program creates a new PC object and add it to a set. This set is an object of the Set class. The program then asks the user if (s)he wishes to continue (the answer of which must be either “Y” or “N”). If the user answers “Y”, the program repeats to create the next PC object. If, however, the user responds with “N”, the program proceeds to displaying a report
about the PC objects.
