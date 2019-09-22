## Food Truck Rating Project

### Week 2 Homework Project for Skill Distillery

### Overview
The week two assignment was to write a program that would allow the user to create an array of food trucks and input the truck's name, food type, and the user's rating for the truck. Also, each truck was to be assigned a unique ID number upon entry, that the user could not directly input themselves.

### Technologies/Topics Applied
Topics I applied this week include utilizing arrays, declaring and initializing objects, and utilizing methods (constructors, getters, setters, toStrings).

### Lessons Learned
Encapsulation was an interesting topic to try to wrap my head around. I needed to keep my data private, but allow others access to it through the use of public methods. I also had to avoid a null pointer exception caused by calling methods null objects in the food truck array. The user had the option of choosing to quit input before the end of the array, leading to null pointer exceptions when I tried to call methods in a loop over the whole array. To counteract this, I made a loop to check for null elements, and if any were found, I made a new array, assigned non-null values to it, and then assigned the new array to the old array's name.
