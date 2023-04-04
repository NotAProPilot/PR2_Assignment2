# Task requirements
## Prerequistes 

- Complete the following tasks:

1.  - Create a package named a2\_sidas shown in **Figure 1**, where sidis your student id. For example, if your student id is 123456789 then the package name is a2\_123456789.
    - You will need to use this package to store all the Java class(es) that you create for the program.

2.  - Copy to this package two classes (PCProgand Set) that are provided in the attached zip file. Fix the import statements in these classes to match your package name.
    - The subsequent tasks will explain what you need to do with these classes. The design of class Setwas explained in the coursebook.

## Important notice: 
+ Failure to name the package as described above will result in an invalid program.
+ You must use the necessary utility classes in the utils package (provided as part of the lecture resources). This package should be created as another top-level package as shown in **Figure 1**. You must **not** create package utilsas a sub-package of your package. 
+ In addition, you must **not** include package utils as part of your submission.
+ You may use JDK version 8 or 11 only.

## Specify and implement class PC.
+ PCmust contain the essential state and behaviour spaces.
+ PCmust appropriately use Setin its design.
+ You must implement ```PC.toString()``` such that the outputs look like the example shown in
Section 1.
+ You **must override** the equals()method for PC, which determines equality of two PCobjects based on their states.

## Specify and implement class PCFactory that has a factory method for creating PCs. 
+ This class must also be a singleton. You must strictly follow the relevant design pattern solutions.

## Specify and implement class PCReportwhich contains a single operation:

```displayReport(PC[] objs): String```

- *Note the following:*
   1. The report format must be as specified in **Listing 1**.
   2. This class has no instance variables.

## Specify for the PCProg (partially completed)
- A partially completed class named PCProg is provided for testing your program. Move it into your a2\_sidpackage so that you can run it. 
- Class PCProgcontains the ```main``` method and some operations for performing the tasks highlighted in Section 1:
  +  Attribute ```objsis``` typed Set<PC>and used to record PC objects.
  +  ```createObjects```: uses PCFactory to create a new PC object and record it in objs. Method createObjectsshould not invoke PCconstructor directly.
  + ```getObjects```: return the recorded PC objects.
  + ```displayReport```: uses PCReportto generate and display the tabular report about PC objects.
  + ```saveReport```: save the report text to file.
  + ```main```: create a new PCProgobject and run its operations.

- **Some notes about the PC Prog class**:
  + The following procedures are completed and provided for you: ```displayReport```, ```saveReportand```, and ```main```. You must **not** change them.
  + In order to make the program work, you need to specify and implement the operations ```createObjectsand``` and ```getObjects```.

## Submission requirements
1. Create a zip file containing **just the folder of the required package**. You must name the file as follows: a2\_sid.zip, where sidis your student id. Submit your file to the designated submission box.
2. In particular, ONLY the **ZIP** format is accepted. Other formats (e.g. RAR) are NOT accepted.
**IMPORTANT:** Failure to name the file as described above will result in an invalid program.
