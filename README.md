# ST10438499_OliverDixon_IMAD_Assignment1

The goal of creating the program was to create a mobile application that would compare famous figures in history to the user's age. The app would take the user’s input and match it against a historical figure and display some information about the person. 

To complete this task, I had to plan and create a mind map of what I needed before I started programming. There was going to be a place where the user could enter their age and two buttons that would perform functions that would compare the user’s age and the historical figure when pressed and the other button would reset the program so that the user could keep entering ages to see who they compare against. 

Once I had the mind map, I created a emulator so that i could run and test my code. I decided to use a Google Pixel 7 pro as it has good resolution and will be the base of my project.

![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/b0309353-1b8f-4dbe-9d81-91052b2d9d92)

I then had a blank enviroment that i had to build upon.The first thing i was going to implement was a backround to do this i got a jpeg image of old paper that was stained this would help link to the history theme and uploaded it to android studio where i could then set it as the background. When i created the backround i set it to the phones resolution so it would have a higher quality image.

![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/3eb2eb87-dd26-42dc-a5b3-337001db4c1c)

After the backround was set i needed to create a user interface, i aimed for a simplistic look and not for anything stand out too much. I needed to add components to add functions and uses to them.
I added an text view component that was going to contain the header so that the user could have a base to the name of the project. The size of the text was too small for the header of the app so i increased it to 40sp using the attributes tab. The characters of the header didnt stand out enough and thus i made the text bold.

![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/26da94d2-e01f-49d9-ae20-84ad8d529cf3)

I added an edit text component that was going to be an area where the user could enter their age to get the user input so that functions can use it for calculations and methods. It had an area for user hints so i made it so the user could understand that they need to enter their age into that text box. To prevent later errors when the user has to enter their age i added a syntax command in the xml of the activity main so they could only enter whole numbers.

![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/9a7315c5-db84-44d3-8023-424c642c3127)

I added text view 2 component that was going to be a place holder for displaying the historical figure and infomation about them. By using "" parenthesis you can use it as a place holder so no text shows up this made the text view transparent and could later be edited in the main activity. This would allow for less clutter being on the screen and allowing me to display text and change the backround color later on.
![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/d6558cb2-6ae2-4b7d-8c26-3d3799aeb144)

I needed something for the user to interact with so that the calculations could be done so I added two buttons one would activate the function of comparing the age of the user with the historical figure sending what was meant to be displayed to text view 2 with a background behind the text. The second button would clear the text and backround that was added reseting the app and allowing the user to enter another age.
Before i got to programming the functions for the buttons i dragged and dropped the components onto the main activity and constrained them in the center for a more appealing view.

After that i then needed to create an id name and bind it ti string so i could later set the names of the components. Once they where set i created the names of what i wanted the components to display. Once their id's and names where set and binded i added them to the xml of the main activity so that it would change the text.

![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/a395c679-371a-4da2-ac32-8531da756f55)

My ui was looking better but the buttons stood out as they where not the same color as the background and where square. So i found the colour of the background in hexadecimal and saved it in a newly created color xml where i could then set the color of the button to the variable i created using the attributes tab i also made the buttons 25% transparent so they would blend into the background better.

![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/5470fce5-4ca7-4734-8530-b9714fdba79e)

The square buttons didnt fit in so i changed them to round corners but keeping their block like look i used to corner radius syntax command in the xml of the activity main to achieve this.
![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/a68e0ee3-b9a6-4950-93f5-531bc5b42197)

In the xml of the code i added a syntax command so that all the text was centered to match how the layout of the app was set up.
This was the Final result of the UI and it had a clean asthetic with a history themed background. 
![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/ebc81c2e-21a3-4887-a5a5-47b1cd76f11a)

Once the UI was finished and the components where connected to there respective strings and colours i moved on to program the project. I was going to use a switch case to hold the data of the historical figures and compare them to the users age once one of the buttons was pressed and then change the second text views backround and hidden text to display a white backround and information on the history figures. I will also have a error message with a hint to the error caused by the user to be displayed if they are out of the range or didnt choose the write historical figure ages.

![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/abb0453a-869f-4668-a9c7-6bf88db41bd3)

Under the class the first thing i had to do was import the components that i used in activity main over so that the code could access them and allow me to use them in functions and code. They where classified under the android widgits class and then all i had to do was specify which widgits they where.

![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/3e7e1f21-40d4-4347-af22-30631cee7354)

I then add to set my variables that i used in the activity main under val, i used val to store these variables as they where not going to be changed or modified later on in the code. Then i added the name of the id's that the program had to find so that it could be activated in the main.

![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/a65b4610-d531-4a7a-9e4d-14678854d521)

Now that the components where transfered over and activated i could use them in code. I wanted to set up a switch function that would take the users input from the edit text and compare it to the data on the historical figures and if the ages matched then it would display the historical figure and information about them. So i had to set an on click listener so that when the first button was pressed it would call this function to run the first thing the function would do is to change a text view 2 to a white backround so that the text is easier to read. It would then run a piece of code that would set an output message to the users input 

![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/fd87494e-da3b-4fc1-ada7-300d1b236889)

After it would compare the ages and if the ages matched it would use a "->" command to set the text in the 2nd text view to whatever is writing the the paranthesis. However if there age is not one of the numbers in the data then an else statement would run that would print out an "You entered an invalid age. " and "Try enter a number between 56 and 90" in the text view instead this would indicate to the user the range they need to enter in.


![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/4b565a7f-ef1f-48c2-a09c-354ffd092f7a)

I had to set a function for my second button which would revert the background to and the text back to its original state. I first had to set an on click listener which would activate the code inside the brackets if the clear button was clicked it would then set the text to "" which would produce an invisible text and the background color would change to transparent so that it was invisible again.

![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/5b724945-7856-469f-ab57-f1cf7c2f9cea)

This is the output message that would change the text view to whatever the message was.


















